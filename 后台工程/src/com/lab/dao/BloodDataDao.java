package com.lab.dao;

import com.lab.bean.XueyaData;

import net.sf.json.JSONObject;

public interface BloodDataDao {
	
	/*插入血压及数据*/
	public JSONObject addBloodData(XueyaData xueyaData)throws Exception;
	
	/*查询血压计数据*/
	public JSONObject searchBloodData(String equip_id,String sample_id)throws Exception;
	

}
