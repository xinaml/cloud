package com.xinaml.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo2Application {
	@GetMapping("test")
	public String test() {
		return "this is test2";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
}
