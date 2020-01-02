package com.struts.dao;  
  
import org.hibernate.Session;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  

import com.struts.action.User;

  
public class RegisterDao {  
  
public static void saveUser(User l){  
          
Session session=new Configuration().  
configure("hibernate.cfg.xml").buildSessionFactory().openSession();  

Transaction t=session.beginTransaction();  
session.save(l);  
t.commit();  
session.close();  
          

  
}  
  
}  