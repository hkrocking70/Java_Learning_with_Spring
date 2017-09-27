package com.lowes.json;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.lowes.beans.User;

public class JsonCon {
	
	public static void main(String[] args) {
		
		User xxx = new User(0,0,"Shantanu","shant@aaa","9856321",null);
		
		JAXBContext jc = JAXBContext.newInstance(User.class);
		Marshaller ms = jc.createMarshaller();
		
	}
}
