package com.lab.actions;


import com.lab.bean.Staff;
import com.lab.bll.StaffBll;
import com.lab.dao.StaffDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONObject;

public class LoginAction extends ActionSupport{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String password;
	
	
	public String execute()throws Exception{
		Staff staff = new Staff();
		staff.setId(id);
		staff.setPassword(password);
		
		StaffDao staffDao = new StaffBll();
		
		if(staffDao.login(staff)){
			return SUCCESS;
		}else{
			return INPUT;
		}
		
	}
	
	public String getStaff()throws Exception{
		ActionContext response = ActionContext.getContext();
		StaffDao staffDao = new StaffBll();
		JSONObject jsonObject = new JSONObject();
		jsonObject = staffDao.getStaff(id);
		System.out.println(jsonObject);
		response.put("stafflists", jsonObject);
		if(jsonObject!= null){
			return SUCCESS;
		}else{
			return INPUT;
		}	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

