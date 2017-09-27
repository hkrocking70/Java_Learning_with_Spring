package com.lowes.mgmt;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.lowes.beans.User;

public class UserMgmtDemo {
	public static void main(String[] args) {
		/*
		 * UserMgmt mgmt = new UserMgmt() ; List<User> users = mgmt.getUsers();
		 * System.out.println(users.size());
		 */

		//FileSystemXmlApplicationContext fCon = new FileSystemXmlApplicationContext("C:\\U");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dep-beans.xml");
		UserMgmt userMgmt = (UserMgmt) context.getBean("mgmt");
		List<User> springUsers = userMgmt.getUsers();
		System.out.println(springUsers.size());
		// context.close();
	}
}
