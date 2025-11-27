package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.CPFException;
import com.example.demo.exception.UserIdException;
import com.example.demo.exception.UserNameException;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@GetMapping("/user-id/{id}")
	public String findUserById(@PathVariable int id) {

		if (id <= 0 || id >= 100) {
			throw new UserIdException("ID " + id);
		}

		return "You have entered valid ID";
	}

	@GetMapping("/user-name/{userName}")
	public String findUserByName(@PathVariable String userName) {

		if (userName.length() <= 3 || userName.length() >= 15) {
			throw new UserNameException("USERNAME " + userName);
		}

		return "You have entered valid USERNAME";
	}

	@GetMapping("/user-cpf/{cpf}")
	public String findUserByCPF(@PathVariable String cpf) {

		if (!isCPF(cpf)) {
			throw new CPFException("CPF " + cpf);
		}

		return "You have entered valid CPF";
	}

	public boolean isCPF(String CPF) {
		return CPF.length() > 3 && CPF.length() < 15;
	}
}
