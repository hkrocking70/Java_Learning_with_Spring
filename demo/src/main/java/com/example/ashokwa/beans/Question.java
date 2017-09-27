package com.example.ashokwa.beans;

public class Question {
	
	int pid;
	public Question(int pid, String pname, String vals, int isProperty, int linkedProperty, String dependsOn) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.vals = vals;
		this.isProperty = isProperty;
		this.linkedProperty = linkedProperty;
		this.dependsOn = dependsOn;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getVals() {
		return vals;
	}
	public void setVals(String vals) {
		this.vals = vals;
	}
	public int getIsProperty() {
		return isProperty;
	}
	public void setIsProperty(int isProperty) {
		this.isProperty = isProperty;
	}
	public int getLinkedProperty() {
		return linkedProperty;
	}
	public void setLinkedProperty(int linkedProperty) {
		this.linkedProperty = linkedProperty;
	}
	public String getDependsOn() {
		return dependsOn;
	}
	public void setDependsOn(String dependsOn) {
		this.dependsOn = dependsOn;
	}
	String pname;
	String vals;
	int isProperty;
	int linkedProperty;
	String dependsOn;
}
