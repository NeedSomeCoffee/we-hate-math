package edu.math.app;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.math.app.exceptions.ZeroDivisorException;

public class CalculatorSampleTest {	
	
	@Test
	public void givenTwoNumbers_WhenDividingWithoutRemainder_ThenShouldReturnValidResult() throws ZeroDivisorException {
		CalculatorSample calc = new CalculatorSample();
		
		double one = 35;
		double two = 5;
		
		double result = calc.divide(one, two);
		
		assertTrue(result >= 6.99 && result <= 7.01);
	}
	
	
	@Test
	public void givenTwoNumbers_WhenDividingWithRemainder_ThenShouldReturnValidResult() throws ZeroDivisorException {
		CalculatorSample calc = new CalculatorSample();
		
		double one = 47;
		double two = 5;
		
		double result = calc.divide(one, two);
		
		assertTrue(result >= 9.39 && result <= 9.41);
	}
	
	@Test(expected = ZeroDivisorException.class)
	public void givenTwoNumbers_WhenDividingByZero_ThenShouldThrowException() throws ZeroDivisorException {
		CalculatorSample calc = new CalculatorSample();
		
		double one = 47;
		double two = 0;
		
		calc.divide(one, two);		
	}	
}
