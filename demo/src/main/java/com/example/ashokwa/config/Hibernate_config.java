package com.example.ashokwa.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Hibernate_config {

	public static void main(String[] args) {
		
		System.out.println("HibernateDemo.main()");
		SessionFactory factory = new Configuration().configure("Hibernate-cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();
		
		//session.save();
		tc.commit();
		factory.close();
		
		System.out.println("Address inserted successful");
	}

}

