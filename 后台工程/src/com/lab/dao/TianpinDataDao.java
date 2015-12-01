package com.lab.dao;

import com.lab.bean.TianpingData;

import net.sf.json.JSONObject;

public interface TianpinDataDao {

	/*插入天平数据*/
	public JSONObject addTianpingData(TianpingData tianpingData)throws Exception;
	
	/*查询天平数据*/
	public JSONObject searchTianpingData(String equip_id,String sample_id)throws Exception;
}
