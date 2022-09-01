package com.ieti.tasksms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ( basePackages = "com.ieti" )
public class TasksmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksmsApplication.class, args);
	}

}
