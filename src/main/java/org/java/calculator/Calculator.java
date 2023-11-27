package org.java.calculator;

public class Calculator {
	
	public float add(float x,float y) {
		return x+y;
	}
	
	public float subtract(float x ,float y) {
		return x-y;
	}
	
	public float divide(float x, float y) throws Exception {
		if (y != 0) {
			return x / y;
		} else {
			throw new ArithmeticException("Cannot divide by zero");
		}
	}
	
	public float multiply(float x, float y) {
		return x*y;
	}
}
