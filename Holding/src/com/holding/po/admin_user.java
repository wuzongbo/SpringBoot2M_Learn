package com.holding.po;

public class admin_user {
	private Integer adminId;
	private String adminname;
	private String adminpwd;
	public admin_user() {
	}
	public admin_user(Integer adminId, String adminname, String adminpwd) {
		this.adminId = adminId;
		this.adminname = adminname;
		this.adminpwd = adminpwd;
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdminpwd() {
		return adminpwd;
	}
	public void setAdminpwd(String adminpwd) {
		this.adminpwd = adminpwd;
	}
	@Override
	public String toString() {
		return "admin_user [adminId=" + adminId + ", adminname=" + adminname + ", adminpwd=" + adminpwd + "]";
	}
	
	
	
}
