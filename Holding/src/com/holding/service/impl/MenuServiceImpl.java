package com.holding.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.holding.mapper.MenuMapper;
import com.holding.po.Menu;
import com.holding.po.MenuExample;
import com.holding.service.MenuService;
import com.holding.vm.MenuVM;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuMapper menuMapper;

	
	@Override
	public List<Menu> getFirstMenuByMid(Integer menuMid) throws Exception {
		//根据menuMid查询菜单
		MenuExample example=new MenuExample();
		MenuExample.Criteria criteria=example.createCriteria();
		criteria.andMenumidEqualTo(menuMid);
		List<Menu> menus=menuMapper.selectByExample(example);
		return menus;
	}



	@Override
	public List<MenuVM> getAllMenuByMid() throws Exception {
		// 根据已获得一级菜单id查询二级菜单
		List<Menu> menus=getFirstMenuByMid(0);
		List<MenuVM> vms=new ArrayList<>();
		MenuVM menuVM=null;
		for(Menu menu:menus) {
			menuVM=new MenuVM();
			BeanUtils.copyProperties(menu, menuVM);
			List<Menu> sub=getFirstMenuByMid(menu.getMenuid());
			
			menuVM.setMenus(sub);
			vms.add(menuVM);
		}
		return vms;
	}
	
	

}
