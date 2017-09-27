package com.lowes.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
	public static void main(String[] args) throws IOException {
		File namesFile = new File("C:\\Lowes Workspace\\LearnJava\\src\\com\\lowes\\io\\names.txt");
		FileReader reader = new FileReader(namesFile);

		BufferedReader br = new BufferedReader(reader);
		while (br.ready()) {
			System.out.println(br.readLine());
		}
	}
}
