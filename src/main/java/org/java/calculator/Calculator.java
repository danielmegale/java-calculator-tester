package org.java.calculator;


public class Calculator  {

    public float add(float x , float y) {
    	return x+y;
	}
    
    public float subtract(float x, float y) {
    	return x-y;
    }
    
    public float divide(float x, float y) throws Exception {
    	 if (y == 0) {
             throw new Exception("Division by zero is not allowed");
         }
         return x / y;
    }
    
    public float multiply(float x, float y) {
    	return x*y;
    }
}
