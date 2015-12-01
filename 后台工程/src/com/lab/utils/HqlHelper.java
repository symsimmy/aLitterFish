package com.lab.utils;



public class HqlHelper {

	/*sample*/
	public final String get_sample_lists = "from Sample s";
	public final String get_sample = "from Sample s where s.id=:sid";
	
	/*stanequip*/
	public final String get_equip_lists = "from StanEquip e";
	public final String get_equip = "from StanEquip e where e.id=:eid";
	
	/*wensiduji*/
	//通过标准仪器Id,样例Id检索温湿计的数据
	public final String get_WenshijiData = "from WenshijiData wsj where wsj.id.equipId=:eid and wsj.id.sampleId=:sid";
	
	/*tinping*/
	//通过标准仪器Id,样例Id检索天平的数据
	public final String get_TianPingData = "from TianpingData tp where tp.id.equipId=:eid and tp.id.sampleId=:sid";
	
	/*xueya*/
	//通过标准仪器Id,样例Id检索血压的数据
	public final String get_XueyaData = "from XueyaData xy where xy.id.equipId=:eid and xy.id.sampleId=:sid";

	
	private static HqlHelper instance;
	public static HqlHelper Instance(){
		if(instance==null){
			instance=new HqlHelper();
		}
		return instance;
	}
}

