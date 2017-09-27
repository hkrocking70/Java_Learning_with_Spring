package com.lowes.concepts;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.lowes.beans.User;


public class XMLDemo {

	public static void main(String[] args) throws JAXBException {
		User u = new User(1, "Himanshu", "abc@abc.com", "1234", null);
		System.out.println(u);
		
		JAXBContext jc = JAXBContext.newInstance(User.class);
		Marshaller ms = jc.createMarshaller();
		
		ms.marshal(u, new File("u.xml"));
	}

}
