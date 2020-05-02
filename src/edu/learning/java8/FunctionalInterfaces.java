package edu.learning.java8;

/**
 * 
 * 
 * Functional interface is an interface with only one abstract class. It is also
 * called as Single Abstract Method It can have any number of default and static
 * methods.
 * 
 * @author Krishna
 * 
 *
 */
@FunctionalInterface
public interface FunctionalInterfaces {

	// Mandatory to override this abstract method in the implementation class
	/**
	 * @param numbers
	 */
	public int addition(int[] numbers);

	// Optional to override default methods in the implementing class
	/**
	 * @param a
	 * @param b
	 * @return a+b
	 */
	public default int addition(int a, int b) {
		return a + b;
	}

	public static int addition(int a, int b, int c) {
		return a + b + c;
	}

	/**
	 * @param a
	 * @param b
	 * @return a*b
	 */
	public default int multiplication(int a, int b) {
		return a * b;
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return a*b*c
	 */
	public static int multiplication(int a, int b, int c) {
		return a * b * c;
	}

}
