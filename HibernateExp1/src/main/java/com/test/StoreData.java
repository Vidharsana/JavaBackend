package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		
		//1 create configuration class object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//2 create SessionFactory object
		SessionFactory sf = cfg.buildSessionFactory();
		
		//3 create Session Object
		Session session = sf.openSession();
		
		//4 Transaction object
		Transaction t = session.beginTransaction();
		
		// transient state
		Book b = new Book();
		b.setB_name("SpringBoot");
		b.setB_author("Kingzz");
		b.setB_price(636);
		
		//5 execute the object
		//session.save(b);  //persistent state
		//t.commit();
		
		Book bobj = session.get(Book.class,2);
		session.delete(bobj);
		//System.out.println(bobj.getId()+" "+bobj.getB_name()+" "+bobj.getB_author()+" "+bobj.getB_price());
		//bobj.setB_name("Servlets");
		//session.save(bobj);
		
		t.commit();
		System.out.println("Done.");
		
		//6 close session object
		session.close();   //detached state
	}
}
