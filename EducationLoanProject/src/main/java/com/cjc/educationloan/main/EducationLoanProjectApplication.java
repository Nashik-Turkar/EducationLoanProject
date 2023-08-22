package com.cjc.educationloan.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class EducationLoanProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EducationLoanProjectApplication.class, args);
		
		System.out.println("Project Running! ");
	}

}
