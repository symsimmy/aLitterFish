package com.lab.dao;

import com.lab.bean.StanEquip;

import net.sf.json.JSONObject;

public interface StanEquipDao {
	/*
	 * 这是标准仪器的接口定义*/
	
	/*添加标准仪器*/
	public JSONObject addStanEquip(StanEquip equip)throws Exception;
	
	/*获取全部标准仪器列表*/
    public JSONObject getStanEquipList()throws Exception;
    
	/*获取指定实验仪器*/
    public JSONObject getStanEquip(String id)throws Exception;
}
