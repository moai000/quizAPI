package com.example.demo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Answer;
import com.example.demo.entity.Quiz;
import com.example.demo.entity.Title;
import com.example.demo.repository.AnswerRepository;
import com.example.demo.repository.QuizRepository;
import com.example.demo.repository.TitleRepository;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class QuizController {

	@RequestMapping("/title")
	Collection<Title> getTitleAll(){
		return this.titleRepository.findByDelFlgOrderByRecommend(1);
	}
	
	@GetMapping("/quiz")
	Map<String, Collection> getQuiz(@RequestParam("titleCd") int titleCd){
		
		Map<String, Collection> quiz = new HashMap<>();
		
		Collection<Title> title = this.titleRepository.findByTitleCdAndDelFlg(titleCd, 1);
		Collection<Quiz> question = this.quizRepository.findByTitleCdAndDelFlg(titleCd, 1);
		Collection<Answer> answer = this.answerRepository.findByTitleCd(titleCd);
		quiz.put("title", title);
		quiz.put("question", question);
		quiz.put("answer", answer);
		
		return quiz;
	}
	
	@RequestMapping(value = "/recommend/{titleCd}", method = RequestMethod.PUT)
	int updateRecommend(@PathVariable("titleCd") int titleCd, @ModelAttribute Title t){
		int result = this.titleRepository.updateRecommend(titleCd, t.getRecommend());
		Title title = this.titleRepository.findByTitleCd(titleCd);
//		model.addAttribute("recommend", title.getRecommend());
		return title.getRecommend();
	}
	 
	@Autowired QuizRepository quizRepository;
	@Autowired TitleRepository titleRepository;
	@Autowired AnswerRepository answerRepository;
}
