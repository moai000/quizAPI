package com.example.demo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long> {

	Collection<Answer> findByTitleCd(int titleCd);
}
