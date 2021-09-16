package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.example")
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer{
	
	private static Class applicationClass = DemoApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
