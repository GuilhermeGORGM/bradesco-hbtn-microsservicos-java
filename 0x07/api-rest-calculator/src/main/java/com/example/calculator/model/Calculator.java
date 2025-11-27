package com.example.calculator.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Calculator {

	public Double sum(Double number1, Double number2) {
		if (number1 == null || number2 == null)
			throw new NullPointerException("Numero 1 e Numero 2 sao obrigatorios.");
		return number1 + number2;
	}

	public Double sub(Double number1, Double number2) {
		if (number1 == null || number2 == null)
			throw new NullPointerException("Numero 1 e Numero 2 sao obrigatorios.");
		return number1 - number2;
	}

	public Double divide(Double number1, Double number2) {
		if (number1 == null || number2 == null)
			throw new NullPointerException("Numero 1 e Numero 2 sao obrigatorios.");
		if (number2 == 0)
			throw new ArithmeticException("Divisao por zero nao e permitido.");
		return number1 / number2;
	}

	public Integer factorial(Integer number) {
		if (number == null)
			throw new NullPointerException("Numero e obrigatorio.");
		if (number < 0)
			throw new IllegalArgumentException("Numero deve ser positivo.");

		int result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}

	public Integer integerToBinary(Integer integer) {
		if (integer == null)
			throw new NullPointerException("Numero e obrigatorio.");

		return Integer.parseInt(Integer.toBinaryString(integer));
	}

	public String integerToHexadecimal(Integer integer) {
		if (integer == null)
			throw new NullPointerException("Numero e obrigatorio.");

		return Integer.toHexString(integer).toUpperCase();
	}

	public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {
		if (date1 == null || date2 == null)
			throw new NullPointerException("Datas sao obrigatorias.");

		return (int) ChronoUnit.DAYS.between(date1, date2);
	}
}
