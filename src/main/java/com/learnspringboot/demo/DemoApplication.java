package com.learnspringboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication // When you launch your app, this line in your main class runs
// only scans the current package and its subpackages for components like:
@RestController // @service, @repository, @component
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping // this is going to be our REST endpoint
	public String helloWorld() {
		return "Hello world, spring Boot here!";
	}

}
