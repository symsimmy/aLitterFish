package com.lab.bll;

import javax.security.auth.login.LoginException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lab.bean.Staff;
import com.lab.dao.StaffDao;
import com.lab.hibernate.HibernateSessionFactory;
import com.lab.utils.StringUtil;

import net.sf.json.JSONObject;

public class StaffBll implements StaffDao{

	 /*
	  * 登录
	  * */
	@SuppressWarnings("finally")
	@Override
	public boolean login(Staff staff) throws LoginException {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		boolean result = false;

		try {
			/*通过staff的id从后台获取持久化对象*/
			Staff backstageStaff = (Staff)session.get(Staff.class, staff.getId());
			if (backstageStaff == null) {
				result = false;
			}else{
				result = StringUtil.loginCheck(backstageStaff, staff);//判断两个staff是否相同
			}
			transaction.commit();
			transaction=null;
		}catch (HibernateException e) {
		   System.out.println("用户登陆出错："+e);
		   if (transaction!=null) {
			transaction.rollback();
		  }
	    }finally{
		  session.close();
		  return result;
	   }
	}

	@SuppressWarnings("finally")
	@Override
	public JSONObject getStaff(String staff_id) throws Exception {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		
		JSONObject my_profile = new JSONObject();
		Staff staff = null;
		try {
			staff = (Staff)session.get(Staff.class, staff_id);
			if (staff == null){
				my_profile.put("errorcode", "1001");
				my_profile.put("details", "查询用户信息为空");
				my_profile = null;
			}else{
				my_profile.put("errorcode", "200");
				my_profile.put("details", "成功");
				my_profile.put("staff", staff);
			}
			transaction.commit();
			transaction=null;
		}catch (HibernateException e) {
		   System.out.println("查询用户信息出错:"+e);
			my_profile.put("errorcode", "1002");
			my_profile.put("details", "查询用户信息出错");
			if (transaction!=null) {
				transaction.rollback();
			}
	    }finally{
		  session.close();
		  return my_profile;
	   }
	}

}
