package com.devsuperior.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Codificando 123456 = " + passwordEncoder.encode("123456"));
		
		//testando a encriptação
		boolean result = passwordEncoder.matches("123456", "$2a$10$XTE7jFPZXgoGDGAqgshULuBXtIUbmRAVBUU62VFqbj4QBrYqYnuQq");
		System.out.println("Teste do encoder = " + result);
				
		
	}

}
