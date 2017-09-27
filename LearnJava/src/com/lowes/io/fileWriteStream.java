package com.lowes.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileWriteStream {

	public static void main(String[] args) throws IOException {

		File deptFile = new File("C:\\Lowes Workspace\\LearnJava\\src\\com\\lowes\\io\\departments.txt");

		BufferedOutputStream br = new BufferedOutputStream(new FileOutputStream(deptFile, true));
		String dept = "Human Resources\nFinance\nEngineering\nMarketing";

		br.write(dept.getBytes());
		br.flush();
		br.close();
		
		System.out.println("File Generation Completed.");
	}

}
