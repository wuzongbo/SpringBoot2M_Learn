package com.holding.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.holding.vm.FloorCListVm;
import com.holding.vm.FloorVm;

@Service
public interface FloorService {

	public List<FloorCListVm> getFloorVmList(int libraryId);
	
	public FloorVm getFloorVmById(int floorId,int roomId,int deskId,int seatId);
}
