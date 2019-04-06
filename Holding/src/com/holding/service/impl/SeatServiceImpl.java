package com.holding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.holding.mapper.SeatMapper;
import com.holding.po.Seat;
import com.holding.po.SeatExample;
import com.holding.service.SeatService;

@Service
public class SeatServiceImpl implements SeatService {

	@Autowired
	private SeatMapper seatMapper;
	
	@Override
	public List<Seat> getSeatList(int deskId) {
		SeatExample seatExample = new SeatExample();
		SeatExample.Criteria sCriteria = seatExample.createCriteria();
		sCriteria.andDeskidEqualTo(deskId);
		return seatMapper.selectByExample(seatExample);
	}

}
