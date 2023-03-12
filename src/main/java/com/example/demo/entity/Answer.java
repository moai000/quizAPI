package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(AnswerPK.class)
public class Answer {

	@Id private int titleCd;
	@Id private int questionCd;
	@Id private int answerCd;
	private String answer;
	
	public Answer() {
		super();
	}
	public int getTitleCd() {
		return titleCd;
	}
	public void setTitleCd(int titleCd) {
		this.titleCd = titleCd;
	}
	public int getQuestionCd() {
		return questionCd;
	}
	public void setQuestionCd(int questionCd) {
		this.questionCd = questionCd;
	}
	public int getAnswerCd() {
		return answerCd;
	}
	public void setAnswerCd(int answerCd) {
		this.answerCd = answerCd;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
