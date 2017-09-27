package com.lowes.io;

import java.io.*;

public class FileReadStreamDemo {

	public static void main(String[] args) throws IOException {
		
		File namesFile = new File("C:\\Lowes Workspace\\LearnJava\\src\\com\\lowes\\io\\names.txt");
		
		BufferedInputStream iStream = new BufferedInputStream(new FileInputStream(namesFile));
		
		while (iStream.available() > 0) {
			System.out.print((char)iStream.read());
		}
		
		/*
		int value = iStream.read();
		
		while(value != -1) {
			System.out.print((char) value);
			value = iStream.read();
		}
		*/
	}

}
