package com.lab.dao;

import javax.security.auth.login.LoginException;

import com.lab.bean.Staff;

import net.sf.json.JSONObject;

public interface StaffDao {
	/*
	 * 这是用户的接口定义类*/
	
     /*用户登录*/
	public boolean login(Staff staff) throws LoginException;
	
	/*获取用户信息*/
	public JSONObject getStaff(String staff_id) throws Exception;
}
