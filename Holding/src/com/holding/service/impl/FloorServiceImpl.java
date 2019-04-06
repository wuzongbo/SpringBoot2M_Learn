package com.holding.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.holding.mapper.FloorMapper;
import com.holding.po.Floor;
import com.holding.po.FloorExample;
import com.holding.po.Room;
import com.holding.service.FloorService;
import com.holding.service.RoomService;
import com.holding.vm.FloorVm;

@Service
public class FloorServiceImpl implements FloorService {

	@Autowired
	private FloorMapper floorMapper;
	@Autowired
	private RoomService roomService;
	
	
	@Override
	public List<FloorVm> getFloorVmList(int libraryId) {
		FloorExample floorExample = new FloorExample();
		FloorExample.Criteria fcriteria = floorExample.createCriteria();
		fcriteria.andLibraryidEqualTo(libraryId);
		List<Floor> floors = floorMapper.selectByExample(floorExample);//得到楼层列表
		// 楼层包装类列表
		List<FloorVm> floorVms = new ArrayList<>();
		for (Floor floor : floors) {
			FloorVm floorVm = new FloorVm();
			floorVm.setId(floor.getId());
			floorVm.setLibraryid(floor.getLibraryid());
			floorVm.setName(floor.getName());
			floorVm.setStatus(floor.getStatus());
			List<Room> rooms = roomService.getRoomList(floor.getId());
			floorVm.setRooms(rooms);
			floorVms.add(floorVm);
		}
		return floorVms;
	}
	
	
	

}
