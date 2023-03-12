package com.example.demo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Title;

public interface TitleRepository extends JpaRepository<Title, Long> {
	
	Collection<Title> findByTitleCdAndDelFlg(int titleCd, int delFlg);
	Collection<Title> findByDelFlgOrderByRecommend(int delFlg);
	Title findByTitleCd(int titleCd);
	
	@Modifying
	@Transactional
	@Query("update Title t set t.recommend = :recommend where t.titleCd = :titleCd")
	int updateRecommend(int titleCd, int recommend);
		
}
