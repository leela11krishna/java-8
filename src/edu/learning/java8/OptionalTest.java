package edu.learning.java8;

import java.util.Optional;

/**
 * 
 * Optional is used to deal with Null pointer exceptions
 * 
 * @author Krishna
 *
 */
public class OptionalTest {

	public static void main(String args[]) {
		String[] arr = new String[5];
		Optional<String> optionalObj = Optional.ofNullable(arr[3]);
		// This avoids null pointer exception
		if (optionalObj.isPresent()) {
			System.out.println(arr[3].toString());
		}
		arr[3] = "Testing";// value is set to verify the isPresent check
		Optional<String> optionalObj2 = Optional.ofNullable(arr[3]);
		if (optionalObj2.isPresent()) {
			// prints value as arr[3].toString is not null
			System.out.println(arr[3].toString());
		}
	}

}
