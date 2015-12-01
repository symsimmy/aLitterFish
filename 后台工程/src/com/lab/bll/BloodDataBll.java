package com.lab.bll;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lab.bean.XueyaData;
import com.lab.dao.BloodDataDao;
import com.lab.hibernate.HibernateSessionFactory;
import com.lab.utils.HqlHelper;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class BloodDataBll implements BloodDataDao{

	@SuppressWarnings("finally")
	@Override
	public JSONObject addBloodData(XueyaData xueyaData)throws Exception {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		JSONObject add_blood = new JSONObject();
		try{
		   	session.save(xueyaData);
		   	transaction.commit();
		   	transaction = null;
		   	add_blood.put("erroecode", "200");
		   	add_blood.put("details", "成功");
		}catch(Exception e){
			if(transaction != null){
				transaction.rollback();
			}
			add_blood.put("errorcode", "6001");
			add_blood.put("details", "添加血压计数据出错");
			System.out.println("添加血压计数据错误"+e);
		}finally {
			session.close();
			return add_blood;
		}
	}

	@SuppressWarnings({ "unchecked", "finally" })
	@Override
	public JSONObject searchBloodData(String equip_id,String sample_id)throws Exception {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		JSONObject search_blood = new JSONObject();
		String hql = HqlHelper.Instance().get_XueyaData;
		try{
			List<XueyaData> xueya_data = new ArrayList<>();
			xueya_data = session.createQuery(hql)
					               .setParameter("eid", equip_id)
			       				   .setParameter("sid", sample_id)
			       				   .list();
			JSONArray jsonArray = JSONArray.fromObject(xueya_data);
			search_blood.put("xueya_data", jsonArray);
			if(jsonArray != null){
				search_blood.put("errorcode", "200");
				search_blood.put("details", "成功");	
			}else{
				search_blood.put("errorcode", "6002");
				search_blood.put("details", "返回信息为空");	
			}
		}catch(Exception e){
			if(transaction != null){
				transaction.rollback();
			}
			search_blood.put("errorcode", "6003");
			search_blood.put("details", "查询血压计数据出错");
			System.out.println("查询血压计数据错误"+e);
		}finally {
			session.close();
			return search_blood;
		}
	}

}
