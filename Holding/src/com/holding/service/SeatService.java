package com.holding.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.holding.po.Seat;

@Service
public interface SeatService {

	public List<Seat> getSeatListBydeskId(int deskId);
	
	public Seat getSeatById(int seatId);
	
	public void insertSeat(Seat seat) throws SQLException;
	
	public void deleteSeatById(List<Integer> seatIds) throws SQLException;
	
	public void updateSeat(Seat seat) throws SQLException;
}
