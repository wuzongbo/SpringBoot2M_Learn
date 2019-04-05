package com.holding.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.holding.po.Menu;

public interface MenuMapper {

	//查询一级菜单
	@Select("select * from menu where menumid=0")
	List<Menu> getFirstMenu() throws Exception;
	
	@Insert("insert into menu (`menuname`,`menumid`) values ('#{menuName}','#{menuMid}')")
	String addMenu(String menuName,Integer menuMid) throws Exception;
	
	//查询二级菜单
	@Select("select * from menu where menumid=#{menuId}")
	List<Menu> getSecondMenu(Integer menuId ) throws Exception;
	
	//根据菜单名查询菜单ID
	@Select("select menuid from menu where menuname=#{menuName}") 
	Integer getMenuId(String menuName) throws Exception;
}	
