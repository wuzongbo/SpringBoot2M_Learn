package com.holding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.holding.mapper.RoomMapper;
import com.holding.po.Room;
import com.holding.po.RoomExample;
import com.holding.service.RoomService;

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

}
