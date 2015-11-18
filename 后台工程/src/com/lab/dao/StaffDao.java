package com.lab.dao;

import javax.security.auth.login.LoginException;

import com.lab.bean.Staff;

public interface StaffDao {
     /*login*/
	public boolean login(Staff staff) throws LoginException;
}
