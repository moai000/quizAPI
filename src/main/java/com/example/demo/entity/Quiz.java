package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Quiz {

	@Id @GeneratedValue
	private Long id;
	private int titleCd;
	private int questionCd;
	private String content;
	private int answerCd;
	private int delFlg;
	
	public Quiz() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getAnswerCd() {
		return answerCd;
	}

	public void setAnswerCd(int answerCd) {
		this.answerCd = answerCd;
	}

	public int getDelFlg() {
		return delFlg;
	}

	public void setDelFlg(int delFlg) {
		this.delFlg = delFlg;
	}


	
}
