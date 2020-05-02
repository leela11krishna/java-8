package edu.learning.java8;

/**
 * 
 * Lambda expression is basically an express instance of functional interface
 * 
 * @author Krishna
 *
 */
@FunctionalInterface
public interface LambdaExpression {
	/**
	 * @param s
	 * @return square of the number
	 */
	public int square(int s);
}
