package edu.learning.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Krishna
 *
 */
public class StreamApi {
	public static void main(String args[]) {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "Krishna"));
		persons.add(new Person(2, "John"));
		persons.add(new Person(3, "Doe"));
		persons.add(new Person(4, "Smith"));

		// Use stream to filter the persons based on the id condition and then
		// collect the results and return as a list
		persons = persons.stream().filter(person -> person.getId() > 1).collect(Collectors.toList());

		System.out.println("Filter person with ID greater than 1:" + persons);
		// Use stream to map the persons id's and then collect the results and
		// return as a list
		List<Long> ids = persons.stream().map(person -> person.getId()).collect(Collectors.toList());

		System.out.println(ids);

	}
}
