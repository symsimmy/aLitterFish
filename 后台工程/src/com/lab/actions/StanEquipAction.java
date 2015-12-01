package com.lab.actions;

import com.lab.bean.StanEquip;
import com.lab.bll.StanEquipBll;
import com.lab.dao.StanEquipDao;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONObject;

public class StanEquipAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String type;
	
	/*添加标准仪器*/
	public String addEquip()throws Exception{
		StanEquipDao stanEquipDao = new StanEquipBll();
		StanEquip stanEquip = new StanEquip();
		stanEquip.setId(id);
		stanEquip.setType(type);
		JSONObject result = stanEquipDao.addStanEquip(stanEquip);
		System.out.println(result);
		if(result.get("errorcode").equals("200")){
			return SUCCESS;
		}else{
			return INPUT;
		}
		
	}
	
	/*获取所有标准仪器列表*/
	public String getEquipList()throws Exception{
		StanEquipDao stanEquipDao = new StanEquipBll();

		JSONObject equiplists = stanEquipDao.getStanEquipList();
		System.out.println(equiplists);
		if(equiplists.get("errorcode").equals("200")){
			return SUCCESS;
		}else{
			return INPUT;
		}
	
	}
	
	/*获取指定标准仪器信息*/
	public String getEquip()throws Exception{
		StanEquipDao stanEquipDao = new StanEquipBll();
		JSONObject equip = stanEquipDao.getStanEquip(id);
		System.out.println(equip);
		if(equip.get("errorcode").equals("200")){
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
