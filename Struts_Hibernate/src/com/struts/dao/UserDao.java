package com.struts.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.struts.pojo.UserPojo;

public class UserDao {

	public static int saveUser(UserPojo u){  
        
		Session session=new Configuration().  
		configure("hibernate.cfg.xml").buildSessionFactory().openSession();  
		          
		Transaction t=session.beginTransaction();  
		int i=(Integer)session.save(u);  
		t.commit();  
		session.close();  
		          
		return i;  
		  
		} 
}
