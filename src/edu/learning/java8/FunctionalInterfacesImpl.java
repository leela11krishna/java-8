package edu.learning.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Krishna
 *
 */
public class FunctionalInterfacesImpl implements FunctionalInterfaces {

	@Override
	public int addition(int[] numbers) {
		List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
		Integer sum = list.stream().reduce(0, (a, b) -> a + b);
		return sum;
	}

	@Override
	public int multiplication(int a, int b) {
		int m = a * b;
		return m;
	}

	public static void main(String args[]) {
		FunctionalInterfacesImpl obj = new FunctionalInterfacesImpl();
		System.out.println("Addition of array numbers: " + obj.addition(new int[] { 1, 2, 3, 4, 11 }));
		System.out.println("Addition: " + obj.addition(2, 3));
		System.out.println("Multiplication: " + obj.multiplication(2, 7));
	}

}
