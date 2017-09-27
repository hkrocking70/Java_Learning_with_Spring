package com.lowes.beans;

import java.util.ArrayList;
import java.util.List;

public class Question {
	int id;
	String name;
	String value;
	String dependsOn;
	boolean isProperty;
	List<Question> subQuestions;
	
	
	public Question(){
		subQuestions = new ArrayList<Question>();
	}
	
	public Question(int id, String name, String value, String dependsOn, boolean isParent, List<Question> subQuestions){
		this.id = id;
		this.name = name;
		this.value = value;
		this.dependsOn = dependsOn;
		this.isProperty = isParent;
		this.subQuestions = subQuestions;
	}
	public Question(int id, String name, String value, String dependsOn, boolean isParent){
		this.id = id;
		this.name = name;
		this.value = value;
		this.dependsOn = dependsOn;
		this.isProperty = isParent;
		this.subQuestions = new ArrayList<>();
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDependsOn() {
		return dependsOn;
	}

	public void setDependsOn(String dependsOn) {
		this.dependsOn = dependsOn;
	}

	public boolean isParent() {
		return isProperty;
	}

	public void setParent(boolean isParent) {
		this.isProperty = isParent;
	}

	public List<Question> getSubQuestions() {
		return subQuestions;
	}

	public void setSubQuestions(List<Question> subQuestions) {
		this.subQuestions = subQuestions;
	}
	

	
}
