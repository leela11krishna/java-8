package edu.learning.java8;

/**
 * @author Krishna
 *
 */
public class LambdaTest {

	public static void main(String[] args) {
		LambdaExpression lambdaInterface = (int x) -> x * x;
		System.out.println("Square value: " + lambdaInterface.square(25));
	}
}
