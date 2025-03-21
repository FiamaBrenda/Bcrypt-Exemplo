package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("enconde")
public class Controller  {

	@Autowired
	PasswordEncoder config;

	@GetMapping
	public void mostrarSenha() {
		String crip = config.encode("123");
		System.out.print(" a senha é "+ crip) ;
	}

}
