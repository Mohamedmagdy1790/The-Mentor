package com.mentor.v1;

import com.mentor.v1.services.MentorService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class V1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(V1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

	}
}
