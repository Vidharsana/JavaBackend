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
				
				//transient state
				Address adr1 = new Address();
				adr1.setCity("Chennai");
				adr1.setState("TN");
				adr1.setCountry("IN");
				Employee emp1 = new Employee();
				emp1.setEmp_name("Dhoni");
				emp1.setEmp_email("dhoni@gmail.com");
				emp1.setAddress(adr1);
				
				
				//5 execute the object
				session.save(emp1);  //persistent state
				t.commit();
				System.out.println("Done.");
				
				//6 close session object
				session.close();   //detached state
	}
}
