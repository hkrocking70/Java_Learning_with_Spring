package com.lowes.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lowes.beans.User;

public class JsonDemo {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		User filo = new User(0,0,"Shantanu","shant@aaa","9856321",null);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("filo.json"), filo);
		
		User uso = mapper.readValue(new File("filo.json"),User.class);
		
		System.out.println(uso);
		System.out.println("Json File Created Succesfully");
		
	}
}
