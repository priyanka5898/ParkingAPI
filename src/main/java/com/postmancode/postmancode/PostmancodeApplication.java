package com.postmancode.postmancode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PostmancodeApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(PostmancodeApplication.class, args);
	}

}
