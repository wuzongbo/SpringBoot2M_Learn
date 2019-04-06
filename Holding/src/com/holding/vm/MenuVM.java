package com.holding.vm;

import java.util.List;

import com.holding.po.Menu;

public class MenuVM extends Menu {
	private List<Menu> menus;

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	@Override
	public String toString() {
		return "MenuVM [menus=" + menus + "]";
	}
	
	
}
