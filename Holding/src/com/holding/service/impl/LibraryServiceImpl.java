package com.holding.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.holding.mapper.LibraryMapper;
import com.holding.po.Floor;
import com.holding.po.Library;
import com.holding.po.LibraryExample;
import com.holding.service.FloorService;
import com.holding.service.LibraryService;
import com.holding.vm.FloorVm;
import com.holding.vm.LibraryVm;

@Service
public class LibraryServiceImpl implements LibraryService{

	@Autowired
	private LibraryMapper libraryMapper;

	@Override
	public List<Library> getLibraryList(int provinceId, int cityId) {
		LibraryExample libraryExample = new LibraryExample();
		LibraryExample.Criteria criteria = libraryExample.createCriteria();
		criteria.andProvinceidEqualTo(provinceId);
		criteria.andCityidEqualTo(cityId);
		return libraryMapper.selectByExample(libraryExample);
	}

	@Autowired
	private FloorService floorService;
	
	//��ȡԤԼ��λ��Ϣ
	@Override
	public LibraryVm getLibraryVmById(int libraryId, int floorId, int roomId, int deskId, int seatId) {
		LibraryVm libraryVm = new LibraryVm();
		
		FloorVm floorVm = floorService.getFloorVmById(floorId, roomId, deskId, seatId);
		libraryVm.setFloorVm(floorVm);
		Library library = libraryMapper.selectByPrimaryKey(libraryId);
		
		libraryVm.setId(library.getId());
		return libraryVm;
	}

	@Override
	public void insertLibrary(Library library) throws SQLException {
		try {
			libraryMapper.insertSelective(library);
		} catch (Exception e) {
			throw new SQLException("添加失败");
		}
	}

	@Override
	public void deleteLibrary(List<Integer> libraryIds) throws SQLException {
		for (int libraryId : libraryIds) {
			try {
				List<Floor> floors = floorService.getFloorListBylibraryId(libraryId);
				List<Integer> floorIds = new ArrayList<>();
				for (Floor floor : floors) {
					floorIds.add(floor.getId());
				}
				floorService.deleteFloor(floorIds);
				libraryMapper.deleteByPrimaryKey(libraryId);
			} catch (Exception e) {
				throw new SQLException("删除失败");
			}
		}
	}

	@Override
	public void updateLibrary(Library library) throws SQLException {
		try {
			libraryMapper.updateByPrimaryKeySelective(library);
		} catch (Exception e) {
			throw new SQLException("修改失败");
		}
	}
	
	
	
}
