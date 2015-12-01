package com.lab.bll;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lab.bean.TianpingData;
import com.lab.dao.TianpinDataDao;
import com.lab.hibernate.HibernateSessionFactory;
import com.lab.utils.HqlHelper;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TianpinDataBll implements TianpinDataDao{

	@SuppressWarnings("finally")
	@Override
	public JSONObject addTianpingData(TianpingData tianpingData) throws Exception {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		JSONObject add_tianping = new JSONObject();
		try{
		   	session.save(tianpingData);
		   	transaction.commit();
		   	transaction = null;
		   	add_tianping.put("erroecode", "200");
		   	add_tianping.put("details", "成功");
		}catch(Exception e){
			if(transaction != null){
				transaction.rollback();
			}
			add_tianping.put("errorcode", "4001");
			add_tianping.put("details", "添加天平数据出错");
			System.out.println("添加天平数据错误"+e);
		}finally {
			session.close();
			return add_tianping;
		}
	}

	@SuppressWarnings({ "unchecked", "finally" })
	@Override
	public JSONObject searchTianpingData(String equip_id, String sample_id) throws Exception {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		JSONObject search_tianping = new JSONObject();
		String hql = HqlHelper.Instance().get_TianPingData;
		try{
			List<TianpingData> tianping_data = new ArrayList<>();
			tianping_data = session.createQuery(hql)
					               .setParameter("eid", equip_id)
			       				   .setParameter("sid", sample_id)
			       				   .list();
			JSONArray jsonArray = JSONArray.fromObject(tianping_data);
			search_tianping.put("tianpin_data", jsonArray);
			if(jsonArray != null){
				search_tianping.put("errorcode", "200");
				search_tianping.put("details", "成功");	
			}else{
				search_tianping.put("errorcode", "4002");
				search_tianping.put("details", "返回信息为空");	
			}
		}catch(Exception e){
			if(transaction != null){
				transaction.rollback();
			}
			search_tianping.put("errorcode", "4003");
			search_tianping.put("details", "查询天平数据出错");
			System.out.println("查询天平数据错误"+e);
		}finally {
			session.close();
			return search_tianping;
		}
	}

}
