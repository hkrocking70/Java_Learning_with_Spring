package com.example.ashokwa.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ashokwa.beans.Question;

import com.fasterxml.jackson.databind.ObjectMapper;

@EnableAutoConfiguration
@RestController
public class QuestionController {

	@RequestMapping(value = "/sendQuestions")
	public Question questionFetcher() throws IOException {
		
		Question qBean = new Question();
		byte[] jsonData = Files.readAllBytes(Paths.get("questions.json"));

		ObjectMapper objectMapper = new ObjectMapper();
		qBean = objectMapper.readValue(jsonData,Question.class);
		return qBean;
	}

}
