package com.lab.actions;
import java.sql.Timestamp;

import com.lab.bean.*;
import com.lab.bll.*;
import com.lab.dao.*;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONObject;
public class TianpingDataAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String staffId;
	private String equipId;
	private String sampleId;
	private Timestamp testtime;
	private Double stanPressure;
	private Double samplePressure;
	
	
	/*添加天平数据星系*/
	public String addTianpingData()throws Exception{
		TianpingData tianpingData = new TianpingData();
		TianpingDataId tianpingDataId = new TianpingDataId(staffId,equipId,sampleId,testtime);
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
		tianpingData.setId(tianpingDataId);
		tianpingData.setSample(sample);
		tianpingData.setStaff(staff);
		tianpingData.setStanEquip(stanEquip);
		tianpingData.setStanPressure(getStanPressure());
		tianpingData.setSamplePressure(getSamplePressure());
		TianpinDataDao tianpinDataDao = new TianpinDataBll();
		JSONObject get_addTPData = tianpinDataDao.addTianpingData(tianpingData);
		if (get_addTPData.get("errorcode").equals("200")) {
			return SUCCESS;
		} else {
			return INPUT;
		}
	}
	
	/*equipId,sampleId查询天平数据*/
	public String getTianpingData()throws Exception{
		TianpinDataDao tianpinDataDao = new TianpinDataBll();
		JSONObject tianpingList = tianpinDataDao.searchTianpingData(equipId, sampleId);
		System.out.println(tianpingList);
		if(tianpingList.get("errorcode").equals("200")){
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
	public Double getStanPressure() {
		return stanPressure;
	}

	public void setStanPressure(Double stanPressure) {
		this.stanPressure = stanPressure;
	}

	public Double getSamplePressure() {
		return samplePressure;
	}

	public void setSamplePressure(Double samplePressure) {
		this.samplePressure = samplePressure;
	}

}
