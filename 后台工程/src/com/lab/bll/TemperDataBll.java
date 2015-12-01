package com.lab.bll;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lab.bean.WenshijiData;
import com.lab.dao.TemperDataDao;
import com.lab.hibernate.HibernateSessionFactory;
import com.lab.utils.HqlHelper;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TemperDataBll implements TemperDataDao{


	@SuppressWarnings("finally")
	@Override
	public JSONObject addTemperData(WenshijiData wenshijiData) throws Exception {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		JSONObject add_temper = new JSONObject();
		try{
		   	session.save(wenshijiData);
		   	transaction.commit();
		   	transaction = null;
		   	add_temper.put("erroecode", "200");
		   	add_temper.put("details", "成功");
		}catch(Exception e){
			if(transaction != null){
				transaction.rollback();
			}
			add_temper.put("errorcode", "5001");
			add_temper.put("details", "添加温湿计数据出错");
			System.out.println("添加温湿计数据错误"+e);
		}finally {
			session.close();
			return add_temper;
		}
	}

	@SuppressWarnings({ "unchecked", "finally" })
	@Override
	public JSONObject searchTemperData(String equip_id, String sample_id) throws Exception {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		JSONObject search_temper = new JSONObject();
		String hql = HqlHelper.Instance().get_WenshijiData;
		try{
			List<WenshijiData> wenshiji_data = new ArrayList<>();
			wenshiji_data = session.createQuery(hql)
					               .setParameter("eid", equip_id)
			       				   .setParameter("sid", sample_id)
			       				   .list();
			JSONArray jsonArray = JSONArray.fromObject(wenshiji_data);
			search_temper.put("temper_data", jsonArray);
			if(jsonArray != null){
				search_temper.put("errorcode", "200");
				search_temper.put("details", "成功");	
			}else{
				search_temper.put("errorcode", "5002");
				search_temper.put("details", "返回信息为空");	
			}
		}catch(Exception e){
			if(transaction != null){
				transaction.rollback();
			}
			search_temper.put("errorcode", "5003");
			search_temper.put("details", "查询温湿计数据出错");
			System.out.println("查询温湿计数据错误"+e);
		}finally {
			session.close();
			return search_temper;
		}
	}

}
