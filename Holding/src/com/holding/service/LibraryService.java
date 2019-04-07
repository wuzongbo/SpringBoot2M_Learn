package com.holding.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.holding.po.Library;
import com.holding.vm.LibraryVm;

@Service
public interface LibraryService {

	public List<Library> getLibraryList(int provinceId,int cityId);
	
	
	public LibraryVm getLibraryVmById(int libraryId,int floorId,int roomId,int deskId,int seatId);
}
