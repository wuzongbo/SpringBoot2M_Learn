package com.holding.vm;

import com.holding.po.Floor;

public class FloorVm extends Floor{

	private RoomVm roomVm;

	public RoomVm getRoomVm() {
		return roomVm;
	}

	public void setRoomVm(RoomVm roomVm) {
		this.roomVm = roomVm;
	}
	
}
