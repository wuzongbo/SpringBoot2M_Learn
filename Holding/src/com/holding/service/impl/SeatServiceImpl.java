package com.holding.service.impl;

import java.sql.SQLException;
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
	public List<Seat> getSeatListBydeskId(int deskId) {
		SeatExample seatExample = new SeatExample();
		SeatExample.Criteria sCriteria = seatExample.createCriteria();
		sCriteria.andDeskidEqualTo(deskId);
		return seatMapper.selectByExample(seatExample);
	}

	@Override
	public Seat getSeatById(int seatId) {
		return seatMapper.selectByPrimaryKey(seatId);
	}

	@Override
	public void insertSeat(Seat seat)  throws SQLException{
		try {
			seatMapper.insert(seat);
		} catch (Exception e) {
			throw new SQLException("添加失败");
		}
	}

	@Override
	public void deleteSeatById(List<Integer> seatIds)throws SQLException {
		for (int seatId : seatIds) {
			try {
				seatMapper.deleteByPrimaryKey(seatId);
			} catch (Exception e) {
				throw new SQLException("删除失败");
			}
		}
	}

	@Override
	public void updateSeat(Seat seat) throws SQLException{
		try {
			seatMapper.updateByPrimaryKey(seat);
		} catch (Exception e) {
			throw new SQLException("修改失败");
		}
	}

}
