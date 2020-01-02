package struts2.action.upload;
import java.util.Iterator;
import java.util.List;

import com.kclink.plugin.HibernatePlug;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;





public class RegisterDao {
	SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
	Session s=sf.openSession();
	
	/*SessionFactory factory = HibernatePlug.getFactory();
    Session session = factory.openSession();*/
	
    public  int saveUser(Image u){
    	System.out.println("hjkhkhkh");
    	s.beginTransaction();  
		int i=(Integer)s.save(u);  
		s.getTransaction().commit();
		return i;  
		  }
	/* @SuppressWarnings("unchecked")
	public boolean find(String Email, String password) {
		 String SQL_QUERY = " from User u  where u.Email='" + Email + "' and u.password='" + password + "'";
		 System.out.println(SQL_QUERY);
	        Query query = session.createQuery(SQL_QUERY);
	         Iterator<User> it = query.iterate();
	         List<User> list = query.list();
	         System.out.println(list);
	        if (list.size() > 0) {
	            session.close();
	            return true;
	        }
	        session.close();
	        return false;
	    }*/
		
}
