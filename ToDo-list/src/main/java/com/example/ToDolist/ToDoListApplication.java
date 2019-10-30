package com.example.ToDolist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.example.ToDolist.domain.Project;
import com.example.ToDolist.domain.ProjectRepository;
import com.example.ToDolist.domain.TaskRepository;


@SpringBootApplication
public class ToDoListApplication {
	private static final Logger log = LoggerFactory.getLogger(ToDoListApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}
	@Bean
	public CommandLineRunner TodoDemo(ProjectRepository pRepository, TaskRepository tRepository) {
		return (args) -> {
			
			log.info("create some projects");
			pRepository.save(new Project(null, "testi", null));
		

		
		};
		}
	
}

