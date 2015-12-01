package com.lab.bll;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lab.bean.Sample;
import com.lab.dao.SampleDao;
import com.lab.hibernate.HibernateSessionFactory;
import com.lab.utils.HqlHelper;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class SampleBll implements SampleDao{

	@SuppressWarnings("finally")
	@Override
	public JSONObject addSample(Sample sample) throws Exception {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		
		JSONObject add_sample = new JSONObject();
		try {
			Sample back_data = (Sample) session.get(Sample.class, sample.getId());
			if(back_data != null){
				add_sample.put("errorcode", "2001");
				add_sample.put("details", "样品id已经存在");
			}else{
				session.save(sample);
				transaction.commit();
				transaction = null;
				add_sample.put("errorcode", "200");
				add_sample.put("details", "成功");
			}
			
		}catch (HibernateException e) {
		   System.out.println("插入样品信息出错"+e);
		   if (transaction!=null) {
			transaction.rollback();
		  }
	    }finally{
		  session.close();
		  return add_sample;
	   }
	}

	@SuppressWarnings({ "finally", "unchecked" })
	@Override
	public JSONObject getSampleList() throws Exception {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		
		JSONObject sample_list = new JSONObject();
		String hql = HqlHelper.Instance().get_sample_lists;
		try {
			List<Sample> samples = new ArrayList<>();
					samples = session.createQuery(hql).list();
			JSONArray jsonArray = JSONArray.fromObject(samples);
			sample_list.put("sample", jsonArray);
			if ( jsonArray != null){
				sample_list.put("errorcode", "200");
				sample_list.put("details", "成功");
			}else{
				sample_list.put("errorcode", "2002");
				sample_list.put("details", "get_sample_lists返回结果为空");
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
		  return sample_list;
	   }
	}

	@SuppressWarnings("finally")
	@Override
	public JSONObject getSample(String id) throws Exception {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		
		JSONObject sample = new JSONObject();
		String hql = HqlHelper.Instance().get_sample;
		try {
			Object exists_sample = session.createQuery(hql)
					             .setParameter("sid", id)
					             .uniqueResult();
			sample.put("sample", exists_sample);
			if ( exists_sample != null){
				sample.put("errorcode", "200");
				sample.put("details", "成功");
			}else{
				sample.put("errorcode", "2003");
				sample.put("details", "get_sample返回结果为空");
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
		  return sample;
	   }
	}

	@SuppressWarnings("finally")
	@Override
	public JSONObject deleteSample(Sample sample) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JSONObject updateSample(Sample sample) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



}
