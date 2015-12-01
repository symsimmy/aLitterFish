package com.lab.bll;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lab.bean.StanEquip;
import com.lab.dao.StanEquipDao;
import com.lab.hibernate.HibernateSessionFactory;
import com.lab.utils.HqlHelper;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class StanEquipBll implements StanEquipDao{

	@SuppressWarnings("finally")
	@Override
	public JSONObject addStanEquip(StanEquip equip) throws Exception {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		
		JSONObject add_stan_equip = new JSONObject();
		try {
			StanEquip back_data = (StanEquip) session.get(StanEquip.class, equip.getId());
			if(back_data != null){
				add_stan_equip.put("errorcode", "3001");
				add_stan_equip.put("details", "标准仪器id已经存在");
			}else{
				session.save(equip);
				transaction.commit();
				transaction = null;
				add_stan_equip.put("errorcode", "200");
				add_stan_equip.put("details", "成功");
			}
			
		}catch (HibernateException e) {
		   e.printStackTrace();
		   if (transaction!=null) {
			transaction.rollback();
		  }
	    }finally{
		  session.close();
		  return add_stan_equip;
	   }
	}
	
	@SuppressWarnings({ "finally", "unchecked" })
	@Override
	public JSONObject getStanEquipList() throws Exception {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		
		JSONObject equip_list = new JSONObject();
		String hql = HqlHelper.Instance().get_equip_lists;
		try {
			List<StanEquip> equipments = new ArrayList<>();
			equipments = session.createQuery(hql).list();
			JSONArray jsonArray = JSONArray.fromObject(equipments);
			equip_list.put("equip_list", jsonArray);
			if ( jsonArray != null){
				equip_list.put("errorcode", "200");
				equip_list.put("details", "成功");
			}else{
				equip_list.put("errorcode", "3002");
				equip_list.put("details", "get_equip_lists返回结果为空");
			}
			transaction.commit();
			transaction=null;
		}catch (HibernateException e) {
		   e.printStackTrace();
		   if (transaction!=null) {
			transaction.rollback();
		  }
	    }finally{
		  session.close();
		  return equip_list;
	   }
	}
	
	@SuppressWarnings("finally")
	@Override
	public JSONObject getStanEquip(String id) throws Exception {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		
		JSONObject get_equip = new JSONObject();
		String hql = HqlHelper.Instance().get_equip;
		try {
			Object exists_equip = session.createQuery(hql)
					             .setParameter("eid", id)
					             .uniqueResult();
			get_equip.put("equip", exists_equip);
			if ( exists_equip != null){
				get_equip.put("errorcode", "200");
				get_equip.put("details", "成功");
			}else{
				get_equip.put("errorcode", "3003");
				get_equip.put("details", "get_equip返回结果为空");
			}
			transaction.commit();
			transaction=null;
		}catch (HibernateException e) {
		   e.printStackTrace();
		   if (transaction!=null) {
			transaction.rollback();
		  }
	    }finally{
		  session.close();
		  return get_equip;
	   }
	}

}
