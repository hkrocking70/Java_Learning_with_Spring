package com.lowes.orm;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import com.lowes.beans.Address;
import com.lowes.beans.User;

public class HibernateDemo2 {

	public static void main(String[] args) {
		
		System.out.println("HibernateDemo.main()");
		SessionFactory factory = new Configuration().configure("hibernate-cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();
		User u = new User(1, 9, "Mukul", "mukul@chutiya.com", "007", null);
		Address addr = new Address(0,"btm stage 2","bangalore","KA");
		
		u.setAddress(addr);
		session.save(u);
		tc.commit();
		factory.close();
		
		System.out.println("User inserted successful");
	}

}
