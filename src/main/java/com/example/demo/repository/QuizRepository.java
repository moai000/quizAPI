package com.example.demo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

	Collection<Quiz> findByTitleCdAndDelFlg(int titleCd, int delFlg);
}
