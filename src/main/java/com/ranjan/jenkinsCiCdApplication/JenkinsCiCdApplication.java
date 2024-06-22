package com.ranjan.jenkinsCiCdApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsCiCdApplication {

	@GetMapping("/greetings/{name}")
	public String greetings(String name){
		return "Hello " +name +" Congratulations you for successfully completed Jenkins CI/CD demo !";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsCiCdApplication.class, args);
	}

}
