package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Title;
import com.example.demo.repository.TitleRepository;

@SpringBootApplication
public class QuizApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApiApplication.class, args);
	}

}

@Component
class QuizCommandLineRunner implements CommandLineRunner {
	
	@Override
	public void run(String ... args) throws Exception {
		for (Title t : this.titleRepository.findAll())
			System.out.println(t.getTitleCd() +": "+ t.getTitle());
	}
	
	@Autowired TitleRepository titleRepository;
}
