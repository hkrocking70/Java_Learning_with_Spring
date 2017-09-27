package com.lowes.orm;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import com.lowes.beans.Address;

public class HibernateDemo {

	public static void main(String[] args) {
		
		System.out.println("HibernateDemo.main()");
		SessionFactory factory = new Configuration().configure("Hibernate-cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();
		session.save(new Address(6,"domlur","bangalore","KA"));
		tc.commit();
		factory.close();
		
		System.out.println("Address inserted successful");
	}

}
