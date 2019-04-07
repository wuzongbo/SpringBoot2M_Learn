package com.holding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.holding.mapper.FloorMapper;
import com.holding.mapper.RoomMapper;
import com.holding.po.Floor;
import com.holding.po.FloorExample;
import com.holding.po.Library;
import com.holding.po.Room;
import com.holding.po.RoomExample;
import com.holding.service.FloorService;
import com.holding.service.LibraryService;
import com.holding.vm.FloorCListVm;
import com.holding.vm.LibraryVm;
import com.holding.vm.FloorCListVm;

@RestController
public class TestController {

	@Autowired
	private LibraryService service;
	
	
	@RequestMapping("/test.do")
	public LibraryVm getLibraryList(int libraryId,int floorId,int roomId,int deskId,int seatId) {
		return service.getLibraryVmById(libraryId, floorId, roomId, deskId, seatId);
		
		
	}
	
}
