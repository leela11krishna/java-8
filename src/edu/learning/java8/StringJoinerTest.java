package edu.learning.java8;

import java.util.StringJoiner;

/**
 * 
 * Used to join strings with delimiter with prefix and suffix
 * 
 * @author Krishna
 *
 */
public class StringJoinerTest {

	public static void main(String[] args) {
		StringJoiner name = new StringJoiner(",", "[", "]");
		name.add("Krishna");
		name.add("Golla");
		System.out.println(name);

		StringJoiner country = new StringJoiner(";", "{", "}");
		country.add("India");
		country.add("USA");
		System.out.println(country);

		System.out.println(name.merge(country));

		System.out.println(country.merge(name));
	}

}
