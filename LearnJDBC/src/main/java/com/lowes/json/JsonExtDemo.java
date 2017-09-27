package com.lowes.json;

import com.lowes.beans.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lowes.beans.User;

public class JsonExtDemo {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		User filo1 = new User(0,0,"Shantanu","shant@aaa","9856321",null);
		User filo2 = new User(0,0,"Syam Kakumani","peppy@pp","125411",null);
		User filo3 = new User(0,0,"naman","nammo@aa","9856321",null);
		
		List<User> users = Arrays.asList(filo1,filo2,filo3);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("filos.json"), users);
		
		List<User> user = mapper.readValue(new File("filos.json"),List.class);
		
		System.out.println(user.get(0));
		System.out.println("Json File Created Succesfully");
		
	}
}
