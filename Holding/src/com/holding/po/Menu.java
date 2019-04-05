package com.holding.po;

public class Menu {
	private Integer menuId;
	private String menuName;
	private String menuMid;
	public Menu() {
		
	}
	public Menu(Integer menuId, String menuName, String menuMid) {
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuMid = menuMid;
	}
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuMid() {
		return menuMid;
	}
	public void setMenuMid(String menuMid) {
		this.menuMid = menuMid;
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", menuMid=" + menuMid + "]";
	}
	
	
	
	
}
