package com.holding.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.holding.po.Seat;

@Service
public interface SeatService {

	public List<Seat> getSeatList(int deskId);
	
}
