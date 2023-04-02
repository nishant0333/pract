package com.jtc.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.*;
@Entity
public class Question {
	@Id
	private int questionId;
	private String question;
	
	@OneToMany(mappedBy="question")
	private List<Answer>answer;
	
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Question(int questionId, String question, List<Answer> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}



	public int getQuestionId() {
		return questionId;
	}



	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}



	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}



	public List<Answer> getAnswer() {
		return answer;
	}



	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	
	
	
	
}
