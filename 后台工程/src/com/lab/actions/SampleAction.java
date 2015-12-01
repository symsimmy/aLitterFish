package com.lab.actions;

import com.lab.bean.Sample;
import com.lab.bll.SampleBll;
import com.lab.dao.SampleDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONObject;

public class SampleAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String company;
	private String type;
	
	public String samplelists()throws Exception{
		ActionContext actionContext = ActionContext.getContext();
		SampleDao sampleDao = new SampleBll();
		JSONObject samplelists = sampleDao.getSampleList();
		
		actionContext.getApplication().put("samplelists", samplelists);
		System.out.println(samplelists);
		if(samplelists.get("errorcode").equals("200")){
			return SUCCESS;
		}else{
			return INPUT;
		}
	}
	
	public String addSample()throws Exception{
		SampleDao sampleDao = new SampleBll();
		Sample sample = new Sample();
		sample.setId(id);
		sample.setCompany(company);
		sample.setType(type);
		JSONObject result = sampleDao.addSample(sample);
		System.out.println(result);
		if(result.get("errorcode").equals("200")){
			return SUCCESS;
		}else{
			return INPUT;
		}
	}
	
	public String getSample()throws Exception{
		SampleDao sampleDao = new SampleBll();
		JSONObject samplelists = sampleDao.getSample(id);
		System.out.println(samplelists);
		if(samplelists.get("errorcode").equals("200")){
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


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	

}
