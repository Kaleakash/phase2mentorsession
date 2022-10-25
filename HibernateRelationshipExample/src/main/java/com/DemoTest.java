package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			
			
			
			Trainer t1 = new  Trainer();
			t1.setTid(2);
			t1.setTname("Ravi");
			t1.setTech("Python");
			//t1.setListOfStd(null);
			
			Student s1 = new Student();
			s1.setSid(103);
			s1.setSname("Meeta");
			s1.setAge(23);
			//s1.setTsid(4);
			
			tran.begin();
			//	session.save(t1);
			session.save(s1);
			tran.commit();
			
			System.out.println("record saved... ");
	}

}
