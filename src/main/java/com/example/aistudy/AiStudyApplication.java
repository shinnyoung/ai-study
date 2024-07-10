package com.example.aistudy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AiStudyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AiStudyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!");

		String c = "";
		for(int i = 0 ; i < 100 ; i++){
			System.out.println("i : " + i);
			c  = c + String.valueOf(i);
			System.out.println("c : " + c);
		}
	}
}
