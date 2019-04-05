package com.holding.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.holding.po.Menu;

@Service
public interface MenuService {
	
	//查询一级菜单
	List<Menu> getFirstMenu() throws Exception;
	
	//插入新菜单
	String addMenu(String menuName,Integer menuMid) throws Exception;
	
	//查询二级菜单
	List<Menu> getSecondMenu(Integer menuId) throws Exception;
	
	//根据菜单名查询菜单ID
	Integer getMenuId(String menuName) throws Exception;
}
