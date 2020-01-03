package com.hibernate.image;

import java.io.File;
import java.io.FileInputStream;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class main1 {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpId(101);
		emp.setEmpName("gang");
		
		File file=new File("C:/Users/Gangadhar/Desktop/ans.txt");
		byte[] byteFile=new byte[(int)file.length()];
		
		try {
			FileInputStream fs=new FileInputStream(file);
			fs.read(byteFile);
			fs.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		emp.setEmpImage(byteFile);
		
		SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(emp);
		s.getTransaction().commit();
		System.out.println("successs..................");

	}

}
