package com.lowes.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lowes.beans.User;

public class UserDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lowes-beans.xml");
		User mukul = (User)context.getBean("mukul");
		System.out.println(mukul);
		
		User ashok = (User)context.getBean("ashok");
		System.out.println(ashok);
		
		User name1 = new User(1,"Anmol","anmol@google.com","987654123",null);
		System.out.println(name1);
		
		User name2 = new User();
		name2.setUserId(2);
		name2.setUserName("Himanshu");
		name2.setUserMail("himanshu@apple.com");
		name2.setContactNumber("987321456");
		name2.setAddress(null);
		System.out.println(name2);
	}

}
