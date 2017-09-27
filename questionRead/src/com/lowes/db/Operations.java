package com.lowes.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

import com.lowes.beans.Question;

public class Operations {
	Connection connection;

	public Operations() {
		// TODO Auto-generated constructor stub
		connection = DbConnection.getConnection();
	}

	public Question getQuestions(String serviceName) {
		Stack<Question> stack = new Stack();
		Question questions = new Question(0,serviceName,null,null,false);
		Question subQuestion = null;
		String dependsOn = "NULL";
		PreparedStatement query = null;
		ResultSet resultSet = null;
		try {
			query = connection.prepareStatement("SELECT * FROM "+serviceName+" WHERE depends_on IS NULL");
			resultSet = query.executeQuery();

			while (resultSet.next()) {
				subQuestion = new Question(resultSet.getInt("property_id"), resultSet.getString("property_name"),
						resultSet.getString("vals"), resultSet.getString("depends_on"), false);
				System.out.println(resultSet.getInt("property_id")+resultSet.getString("property_name")+
						resultSet.getString("vals")+resultSet.getString("depends_on"));
				stack.push(subQuestion);
				questions.getSubQuestions().add(subQuestion);
			}
			
			query = connection.prepareStatement("SELECT * FROM "+serviceName+" WHERE depends_on=?");

			while (stack.isEmpty() == false) {
				subQuestion = stack.pop();
				dependsOn = subQuestion.getName() + ":" + subQuestion.getValue();
				query.setString(1, dependsOn);
				resultSet = query.executeQuery();
				while (resultSet.next()) {
					Question question = new Question(resultSet.getInt("property_id"),
							resultSet.getString("property_name"), resultSet.getString("vals"),
							resultSet.getString("depends_on"), false);
					stack.push(question);
					subQuestion.getSubQuestions().add(question);
				}

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return questions;

	}
	
	
/*	public Question getQuestions(int id) {
		Stack<Question> stack = new Stack();
		Question questions = new Question(id,null,null,null,false);
		Question subQuestion = null;
		String dependsOn = "NULL";
		PreparedStatement query = null;
		ResultSet resultSet = null;
		try {
			query = connection.prepareStatement("SELECT * FROM questions WHERE depends_on IS NULL AND ");
			resultSet = query.executeQuery();

			while (resultSet.next()) {
				subQuestion = new Question(resultSet.getInt("property_id"), resultSet.getString("property_name"),
						resultSet.getString("vals"), resultSet.getString("depends_on"), false);
				System.out.println(resultSet.getInt("property_id")+resultSet.getString("property_name")+
						resultSet.getString("vals")+resultSet.getString("depends_on"));
				stack.push(subQuestion);
				questions.getSubQuestions().add(subQuestion);
			}
			
			query = connection.prepareStatement("SELECT * FROM "+serviceName+" WHERE depends_on=?");

			while (stack.isEmpty() == false) {
				subQuestion = stack.pop();
				dependsOn = subQuestion.getName() + ":" + subQuestion.getValue();
				query.setString(1, dependsOn);
				resultSet = query.executeQuery();
				while (resultSet.next()) {
					Question question = new Question(resultSet.getInt("property_id"),
							resultSet.getString("property_name"), resultSet.getString("vals"),
							resultSet.getString("depends_on"), false, null);
					stack.push(question);
					subQuestion.getSubQuestions().add(question);
				}

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return questions;

	}*/

}
