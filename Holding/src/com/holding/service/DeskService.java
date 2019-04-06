package com.holding.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.holding.vm.DeskVm;

@Service
public interface DeskService {

	public List<DeskVm> getDeskVmList(int roomId);
}
