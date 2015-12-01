package com.lab.actions;
import java.sql.Timestamp;

import com.lab.bean.*;
import com.lab.bll.*;
import com.lab.dao.*;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONObject;

public class XueyaDataAction extends ActionSupport {
//	
	private String staffId;
	private String equipId;
	private String sampleId;
	private Timestamp testtime;
	private Double stanHigh;
	private Double stanLow;
	private Double sampleHigh;
	private Double sampleLow;
	
	/*添加血压数据信息*/
	public String addXueyaData()throws Exception{
		XueyaData xueyaData = new XueyaData();
		XueyaDataId xueyaDataId  = new XueyaDataId(staffId,equipId,sampleId,testtime);
		Staff staff = null;
		StaffDao staffDao = new StaffBll();
		JSONObject get_staff = staffDao.getStaff(staffId);
		if(get_staff.get("errorcode").equals("200")){
			staff = (Staff)get_staff.get("staff");
		}else {
			return INPUT;
		}
		Sample sample = null;
		SampleDao sampleDao = new SampleBll();
		JSONObject get_sample = sampleDao.getSample(sampleId);
		if (get_sample.get("errorcode").equals("200")) {
			sample = (Sample)get_sample.get("sample");
		}else {
			return INPUT;
		}
		StanEquip stanEquip = null;
		StanEquipDao stanEquipDao = new StanEquipBll();
		JSONObject get_stanEquip = stanEquipDao.getStanEquip(equipId);
		if (get_stanEquip.get("errorcode").equals("200")) {
			stanEquip = (StanEquip)get_staff.get("equip");
		} else {
			return INPUT;
		}
		xueyaData.setId(xueyaDataId);
		xueyaData.setSample(sample);
		xueyaData.setStaff(staff);
		xueyaData.setStanEquip(stanEquip);
		xueyaData.setSampleHigh(sampleHigh);
		xueyaData.setSampleLow(sampleLow);
		xueyaData.setStanHigh(stanHigh);
		xueyaData.setStanLow(stanLow);
		BloodDataDao bloodDataDao = new BloodDataBll();
		JSONObject get_addXYData = bloodDataDao.addBloodData(xueyaData);
		if (get_addXYData.get("errorcode").equals("200")) {
			return SUCCESS;
		} else {
			return INPUT;
		}
	}
	
	/*equipId,sampleId查询血压数据*/
	public String getXueyaData()throws Exception{
		BloodDataDao bloodDataDao = new BloodDataBll();
		JSONObject xueyaList = bloodDataDao.searchBloodData(equipId, sampleId);
		System.out.println(xueyaList);
		if(xueyaList.get("errorcode").equals("200")){
			//todo
			return SUCCESS;
		}else{
			return INPUT;
		}
	}
	
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getEquipId() {
		return equipId;
	}
	public void setEquipId(String equipId) {
		this.equipId = equipId;
	}
	public String getSampleId() {
		return sampleId;
	}
	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
	}
	public Timestamp getTesttime() {
		return testtime;
	}
	public void setTesttime(Timestamp testtime) {
		this.testtime = testtime;
	}
	public Double getStanHigh() {
		return stanHigh;
	}
	public void setStanHigh(Double stanHigh) {
		this.stanHigh = stanHigh;
	}
	public Double getStanLow() {
		return stanLow;
	}
	public void setStanLow(Double stanLow) {
		this.stanLow = stanLow;
	}
	public Double getSampleHigh() {
		return sampleHigh;
	}
	public void setSampleHigh(Double sampleHigh) {
		this.sampleHigh = sampleHigh;
	}
	public Double getSampleLow() {
		return sampleLow;
	}
	public void setSampleLow(Double sampleLow) {
		this.sampleLow = sampleLow;
	}
	
}
