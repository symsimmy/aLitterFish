package com.lab.bll;

import javax.security.auth.login.LoginException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lab.bean.Staff;
import com.lab.dao.StaffDao;
import com.lab.hibernate.HibernateSessionFactory;
import com.lab.utils.StringUtil;

public class StaffBll implements StaffDao{

	 /*
	  * 登录
	  * */
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
		   e.printStackTrace();
		   if (transaction!=null) {
			transaction.rollback();
		  }
	    }finally{
		  session.close();
		  return result;
	   }
	}

}
