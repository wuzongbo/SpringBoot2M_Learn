package com.holding.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.holding.vm.DeskCListVm;
import com.holding.vm.DeskVm;

@Service
public interface DeskService {

	public List<DeskCListVm> getDeskVmList(int roomId);
	
	public DeskVm getDeskVmById(int deskId,int seatId);
}
