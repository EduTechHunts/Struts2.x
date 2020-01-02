package com.panelcoder.RegisterDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.panelcoder.pojo.User;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class RegisterDao {
	Session session=new Configuration().  
			configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	
  @SuppressWarnings("unchecked")
	public boolean find(String Email, String password) {
		 String SQL_QUERY = " from User u  where u.Email='" + Email + "' and u.password='" + password + "'";
		 System.out.println(SQL_QUERY);
	        Query query = session.createQuery(SQL_QUERY);
	         @SuppressWarnings("unused")
			Iterator<User> it = query.iterate();
	         List<User> list = query.list();
	         System.out.println(list);
	        if (list.size() > 0) {
	            session.close();
	            return true;
	        }
	        session.close();
	        return false;
	    }
	 
	 @SuppressWarnings("unchecked")
	public List<User> ret() {
			List<User> l = new ArrayList<User>();
			/*SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();*/
		System.out.println("hghjhbjhbj");
			Query q =session.createQuery("select u.Email from User u");
			
			l=q.list();
			
			System.out.println("successs..................");

			return l;
		}
		
}
