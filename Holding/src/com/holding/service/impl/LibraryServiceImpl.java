package com.holding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.holding.mapper.LibraryMapper;
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
	
	//获取预约座位信息
	@Override
	public LibraryVm getLibraryVmById(int libraryId, int floorId, int roomId, int deskId, int seatId) {
		LibraryVm libraryVm = new LibraryVm();
		
		FloorVm floorVm = floorService.getFloorVmById(floorId, roomId, deskId, seatId);
		libraryVm.setFloorVm(floorVm);
		Library library = libraryMapper.selectByPrimaryKey(libraryId);
		
		libraryVm.setId(library.getId());
		return libraryVm;
	}
	
	
	
}
