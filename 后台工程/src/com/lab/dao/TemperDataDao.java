package com.lab.dao;

import com.lab.bean.WenshijiData;

import net.sf.json.JSONObject;

public interface TemperDataDao {

	/*插入温湿计数据*/
	public JSONObject addTemperData(WenshijiData wenshijiData)throws Exception;
	
	/*查询温湿计数据*/
	public JSONObject searchTemperData(String equip_id,String sample_id)throws Exception;
}
