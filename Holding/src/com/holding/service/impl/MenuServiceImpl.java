package com.holding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.holding.mapper.MenuMapper;
import com.holding.po.Menu;
import com.holding.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuMapper menuMapper;
	
	@Override
	public List<Menu> getFirstMenu() throws Exception {
		// TODO Auto-generated method stub
		return menuMapper.getFirstMenu();
	}

	@Override
	public String addMenu(String menuName, Integer menuMid) throws Exception {
		// TODO Auto-generated method stub
		return menuMapper.addMenu(menuName, menuMid);
	}
	
	@Override
	public List<Menu> getSecondMenu() throws Exception {
		// TODO Auto-generated method stub
		return menuMapper.getSecondMenu();
	}

	@Override
	public Integer getMenuId(String menuName) throws Exception {
		// TODO Auto-generated method stub
		return menuMapper.getMenuId(menuName);
	}


	

}
