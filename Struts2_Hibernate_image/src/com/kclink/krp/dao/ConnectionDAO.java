package com.kclink.krp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.kclink.krp.pojo.ImgPojo;
import com.kclink.krp.pojo.imagePojo;

public class ConnectionDAO {

	SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
	
	public String addImg(ImgPojo img) {


		/*SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();*/
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(img);
		s.getTransaction().commit();
		System.out.println("successs..................");

	
		return "inserted";

	}
	public List<imagePojo> retImg() {
		List<imagePojo> l = new ArrayList<imagePojo>();
		/*SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();*/
		Session s=sf.openSession();
		Query q =s.createQuery("from imagePojo");
		l=q.list();
		
		
		
		System.out.println("successs..................");

		return l;
	}
	
	@SuppressWarnings("unchecked")
	public List<ImgPojo> getCollegeDetails() {

		Session session = sf.openSession();

		List<ImgPojo> lista = null;
		try {
			System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
			Query query = session.createQuery("from ImgPojo where Id=27");
			System.out.println("queryyyyyyyyyyyyyyyyyyyyyyyyyyyyy");

			lista = query.list();
			System.out.println("ihishishh");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;

	}

	
}
