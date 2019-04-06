package com.holding.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.holding.vm.FloorVm;

@Service
public interface FloorService {

	public List<FloorVm> getFloorVmList(int libraryId);
}
