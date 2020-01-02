package com.sample.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.sample.pojo.PojoClass;

public class DaoClass {

	Session session = new Configuration().configure("hibernate.cfg.xml")
			.buildSessionFactory().openSession();
	
	public List<PojoClass> add(String email_id, String password) {
		List<PojoClass> l=new ArrayList<PojoClass>(); 
		
		PojoClass p=new PojoClass();
		p.setEmail_id(email_id);
		p.setPassword(password);
		
		Transaction tx = session.beginTransaction();
		session.save(p);
		tx.commit();
		return l;

	}

}
