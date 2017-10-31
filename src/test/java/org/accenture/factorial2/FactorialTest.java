package org.accenture.factorial2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

	private Factorial factorial;

	@Before
	public void init() {
		factorial = new Factorial();
	}

	@Test
	public void shouldFactorialOfZeroReturnOne() {
		long resultado = factorial.compute(0);
		long expectedValue = 1;

		assertEquals(expectedValue, resultado);
	}

	@Test
	public void shouldFactorialOfOneReturnOne() {
		long resultado = factorial.compute(1);
		long expectedValue = 1;

		assertEquals(expectedValue, resultado);
	}

	@Test
	public void shouldFactorialOfTwoReturnTwo() {
		long resultado = factorial.compute(2);
		long expectedValue = 2;

		assertEquals(expectedValue, resultado);
	}

	@Test
	public void shouldFactorialOfThreeReturnSix() {
		long resultado = factorial.compute(3);
		long expectedValue = 6;

		assertEquals(expectedValue, resultado);
	}

	@Test
	public void shouldFactorialOfFiveReturn120() {
		long resultado = factorial.compute(5);
		long expectedValue = 120;

		assertEquals(expectedValue, resultado);
	}
	
	@Test (expected = RuntimeException.class)
	public void shouldFactorialOfNegativesReturnException() {
		 factorial.compute(-1);
	}
}
