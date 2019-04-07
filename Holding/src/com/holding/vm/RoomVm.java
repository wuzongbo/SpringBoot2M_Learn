package com.holding.vm;

import com.holding.po.Room;

public class RoomVm extends Room{

	private DeskVm deskVm;

	public DeskVm getDeskVm() {
		return deskVm;
	}

	public void setDeskVm(DeskVm deskVm) {
		this.deskVm = deskVm;
	}
	
}
