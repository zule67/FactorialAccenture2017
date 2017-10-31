package org.accenture.factorial2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {
	@Test
	public void test1() {
		Factorial factorial = new Factorial();
		
		long resultado = factorial.compute(0);
		long expectedValue = 1;
		
		assertEquals(expectedValue, resultado);
	}
	
	@Test
	public void test2() {
		Factorial factorial = new Factorial();
		
		long resultado = factorial.compute(1);
		long expectedValue = 1;
		
		assertEquals(expectedValue, resultado);
	}
	
	@Test
	public void test3() {
		Factorial factorial = new Factorial();
		
		long resultado = factorial.compute(2);
		long expectedValue = 2;
		
		assertEquals(expectedValue, resultado);
	}
	
	@Test
	public void test4() {
		Factorial factorial = new Factorial();
		
		long resultado = factorial.compute(3);
		long expectedValue = 6;
		
		assertEquals(expectedValue, resultado);
	}
}
