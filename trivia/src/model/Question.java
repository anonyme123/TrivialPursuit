package model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.derby.jdbc.EmbeddedDriver;

public class Question {
	///
	Statement stmt;
	ResultSet rs = null;
	AbstractCase case1;
	

	private String question;
	private String answer1;
	private String answer2;
	private String answer3;
	private String category;
	private int correctanswer;

	public Question(String question, String answer1, String answer2, String answer3, String category,
			int correctanswer) {
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.category = category;
		this.correctanswer = correctanswer;
	}

	public Question() {
		
	//	if(case1.)
		try {
			Connection conn = null;
			Driver derbyEmbeddedDriver = new EmbeddedDriver();
	         DriverManager.registerDriver(derbyEmbeddedDriver);
	         conn = DriverManager.getConnection("jdbc:derby:database;create=true");
	         conn.setAutoCommit(false);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(
					"select * from questions where category like 'Informatique' order by random() fetch first row only");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				try {
					question = rs.getString(2);
					answer1 = rs.getString(3);
					answer2 = rs.getString(4);
					answer3 = rs.getString(5);
				//	category = rs.getString(6);
					correctanswer = rs.getInt(7);
					
			//		System.out.printf(" %s %s %s %s  \n", question, answer1,
				//			answer2, answer3);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "La question est : \n" + question +"\n" + " réponse 1 : " + answer1 + "\n" + " réponse 2 : " + answer2 + "\n" + " réponse 3 :"
				+ answer3 + "";
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public String getAnswer3() {
		return answer3;
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCorrectanswer() {
		return correctanswer;
	}

	public void setCorrectanswer(int correctanswer) {
		this.correctanswer = correctanswer;
	}

}
