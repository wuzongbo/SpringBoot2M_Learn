package com.holding.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.holding.po.Room;
import com.holding.vm.RoomVm;

@Service
public interface RoomService {

	public List<Room> getRoomList(int floorId);
	
	public RoomVm getRoomVmById(int roomId,int deskId,int seatId);
}
