package com.lab.actions;

import java.sql.Timestamp;

import com.lab.bean.Sample;
import com.lab.bean.Staff;
import com.lab.bean.StanEquip;
import com.lab.bean.TianpingData;
import com.lab.bean.TianpingDataId;
import com.lab.bean.WenshijiData;
import com.lab.bean.WenshijiDataId;
import com.lab.bll.SampleBll;
import com.lab.bll.StaffBll;
import com.lab.bll.StanEquipBll;
import com.lab.bll.TemperDataBll;
import com.lab.bll.TianpinDataBll;
import com.lab.dao.SampleDao;
import com.lab.dao.StaffDao;
import com.lab.dao.StanEquipDao;
import com.lab.dao.TemperDataDao;
import com.lab.dao.TianpinDataDao;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONObject;

public class WenshijiDataAction extends ActionSupport {
	private Double stanWendu;
	private Double stanShidu;
	private Double sampleWendu;
	private Double sampleShidu;
	private String staffId;
	private String equipId;
	private String sampleId;
	private Timestamp testtime;
	
	/*添加温湿计数据信息*/
	public String addWenshijiData()throws Exception{
		WenshijiData wenshijiData = new WenshijiData();
		WenshijiDataId wenshijiDataId = new WenshijiDataId(staffId,equipId,sampleId,testtime);
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
		wenshijiData.setId(wenshijiDataId);
		wenshijiData.setSample(sample);
		wenshijiData.setStaff(staff);
		wenshijiData.setStanEquip(stanEquip);
		wenshijiData.setSampleShidu(sampleShidu);
		wenshijiData.setSampleWendu(sampleWendu);
		wenshijiData.setStanShidu(stanShidu);
		wenshijiData.setStanWendu(stanWendu);
		TemperDataDao temperDataDao = new TemperDataBll();
		JSONObject get_addWSJData = temperDataDao.addTemperData(wenshijiData);
		if (get_addWSJData.get("errorcode").equals("200")) {
			return SUCCESS;
		} else {
			return INPUT;
		}
	}
	
	/*equipId,sampleId查询温湿计数据*/
	public String getWenshijiData()throws Exception{
		TemperDataDao temperDataDao = new TemperDataBll();
		JSONObject wenshijiDataList = temperDataDao.searchTemperData(equipId, sampleId);
		System.out.println(wenshijiDataList);
		if(wenshijiDataList.get("errorcode").equals("200")){
			//todo
			return SUCCESS;
		}else{
			return INPUT;
		}
	}
	
	public Double getStanWendu() {
		return stanWendu;
	}
	public void setStanWendu(Double stanWendu) {
		this.stanWendu = stanWendu;
	}
	public Double getStanShidu() {
		return stanShidu;
	}
	public void setStanShidu(Double stanShidu) {
		this.stanShidu = stanShidu;
	}
	public Double getSampleWendu() {
		return sampleWendu;
	}
	public void setSampleWendu(Double sampleWendu) {
		this.sampleWendu = sampleWendu;
	}
	public Double getSampleShidu() {
		return sampleShidu;
	}
	public void setSampleShidu(Double sampleShidu) {
		this.sampleShidu = sampleShidu;
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
	
}
