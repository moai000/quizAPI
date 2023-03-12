package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class AnswerPK implements Serializable{

	@Column(name="titleCd")
	private int titleCd;
	@Column(name="questionCd")
	private int questionCd;
	@Column(name="answerCd")
	private int answerCd;
	
	public AnswerPK() {
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
	
	
}
