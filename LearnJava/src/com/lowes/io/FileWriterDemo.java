package com.lowes.io;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		File companyFile = new File("C:\\Lowes Workspace\\LearnJava\\src\\com\\lowes\\io\\company.txt");
		
		FileWriter fileWrt = new FileWriter(companyFile);
		
		fileWrt.write("Lowe's India");
		
		fileWrt.flush();
		fileWrt.close();
		

	}

}
