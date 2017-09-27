package com.lowes.concepts;

import com.lowes.beans.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializationDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		User user = new User(0,"Rohit Thakur","rohit@chu.com","985641233",null);
		
		File newFile = new File("lowes.txt");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(newFile));
		
		oos.writeObject(user);
		oos.flush();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(newFile));
		User newUser = (User) ois.readObject();
		System.out.println(newUser);		
		
	}
}
