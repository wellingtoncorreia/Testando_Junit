package com.example.TestandoJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.TestandoJunit.Calc.Calculadora;

public class CalcTest {
	@Test
	@DisplayName("Test  4 +  4.2 = 8.2")
	void testSum() {
		Calculadora calc = new Calculadora();
		
		double valor1=4D;
		double valor2= 4.2D;
		double esperado = 8.2D;
		
		double resultado = calc.sum(valor1, valor2);
		
		assertEquals(esperado, resultado, "4 + 4.2 não gerou o valor 8.2");
	}
}
