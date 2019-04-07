package com.holding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.holding.mapper.RoomMapper;
import com.holding.po.Room;
import com.holding.po.RoomExample;
import com.holding.service.DeskService;
import com.holding.service.RoomService;
import com.holding.vm.DeskVm;
import com.holding.vm.RoomVm;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomMapper roomMapper;
	
	@Override
	public List<Room> getRoomList(int floorId) {
		RoomExample roomExample = new RoomExample();
		RoomExample.Criteria rCriteria = roomExample.createCriteria();
		rCriteria.andFlooridEqualTo(floorId);
		return roomMapper.selectByExample(roomExample);
	}

	@Autowired
	private DeskService deskService;
	
	@Override
	public RoomVm getRoomVmById(int roomId, int deskId, int seatId) {
		RoomVm roomVm = new RoomVm();
		DeskVm deskVm = deskService.getDeskVmById(deskId, seatId);
		roomVm.setDeskVm(deskVm);
		
		Room room = roomMapper.selectByPrimaryKey(roomId);
		roomVm.setId(room.getId());
		
		return roomVm;
	}

}
