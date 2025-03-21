package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  
	@Autowired
	PasswordEncoder config;


	@Override
	public void run(String... args) throws Exception {


		String cript = config.encode("123");
		System.out.print("\n a senha é: "+ cript + "\n") ;
		
		boolean result = config.matches("1234", cript);
		
		System.out.println(" As senhas são iguais ? " + result);
		
		
	}
}