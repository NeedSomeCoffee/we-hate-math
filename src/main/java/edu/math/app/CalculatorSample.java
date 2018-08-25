package edu.math.app;

import edu.math.app.exceptions.ZeroDivisorException;

public class CalculatorSample {

	public double divide(double numerator, double divisor) throws ZeroDivisorException  {
		if (divisor == 0) {
			throw new ZeroDivisorException("Cant divide by zero", new IllegalArgumentException());
		}

		return numerator / divisor;
	}
}
