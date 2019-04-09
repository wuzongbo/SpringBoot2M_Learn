package com.wuzongbo.jdbctemplate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wuzongbo.jdbctemplate.po.Admin;
import com.wuzongbo.jdbctemplate.po.ResultMsg;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@RequestMapping("/login/{name}/{password}")
	public ResultMsg login(@PathVariable("name")String name,@PathVariable("password")String password) {
		ResultMsg resultMsg=null;
		String sql="select * from admin where username=? and password=?";
		
		List<Admin> admins= jdbcTemplate.query(sql, new Object[] {name,password}, new BeanPropertyRowMapper<>(Admin.class));
		
		if(admins!=null && admins.size()>0) {
			resultMsg=new ResultMsg();
			resultMsg.setCode("1");
			resultMsg.setMessage("登陆成功");
					
		}else {
			
			resultMsg.setCode("1");
			resultMsg.setMessage("登陆失败，用户名密码错误，请重试");
		}
		return resultMsg;
	}
	
	
	

}
