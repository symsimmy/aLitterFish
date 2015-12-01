package com.lab.dao;

import com.lab.bean.Sample;

import net.sf.json.JSONObject;

public interface SampleDao {
	/*
	    * 这是sample样品的接口定义类*/
		
		/*样品信息录入*/
		public JSONObject addSample(Sample sample)throws Exception;
		
		/*样品信息删除*/
		public JSONObject deleteSample(Sample sample)throws Exception;
		
		/*样品信息更新*/
		public JSONObject updateSample(Sample sample)throws Exception;
		
		/*全部样品信息获取*/
		public JSONObject getSampleList()throws Exception;
		
		/*指定样品信息获取*/
		public JSONObject getSample(String id)throws Exception;
}
