package com.holding.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.holding.po.Room;

@Service
public interface RoomService {

	public List<Room> getRoomList(int floorId);
	
}
