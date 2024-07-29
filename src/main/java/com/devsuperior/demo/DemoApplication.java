package com.devsuperior.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class DemoApplication  {
	
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	

}
