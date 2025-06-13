package com.stream.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ToDoubleBiFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApiQuestions {

	public static void main(String[] args) {

// 1. Use Stream API to square each number in the list and
		// collect the result into a new list.
		/* Given List: */
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		/* Solution: */
		System.out.println(numbers.stream().map(e -> e * e).collect(Collectors.toList()));

		// Expected: [1, 4, 9, 16, 25]

// 2. Use Stream API to find the length of the longest name in the list.
		/* Given List: */
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");

		/* Solution: */
		System.out.println(names.stream().map(e -> e.length()).max(Comparator.naturalOrder()).get());

		// Expected: 7

// 3. Use Stream API to count the total number of distinct words (case-insensitive) in all the sentences.

		/* Given List: */
		List<String> sentences = Arrays.asList(
				"Java Stream API provides a fluent interface for processing sequences of elements.",
				"It supports functional-style operations on streams of elements, such as map-reduce transformations.",
				"In this exercise, you need to count the total number of words in all sentences.");

		/* Solution: */
		System.out.println(sentences.stream().flatMap(e -> Arrays.stream(e.split(" "))).distinct().count());

		// Expected: 37

//4.  Use Stream API to find the concatenation of the first two words that have even lengths.

		/* Given List: */
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

		/* Solution: */
		System.out.println(words.stream().filter(e -> e.length() % 2 == 0).limit(2).collect(Collectors.joining()));

		// Expected: bananacherry

// 5.  Use Stream API to find the sum of the squares of even numbers in the list.

		/* Given List: */
		List<Integer> evenNumbSquarSum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		/* Solution: */
		System.out
				.println(evenNumbSquarSum.stream().filter(e -> e % 2 == 0).collect(Collectors.summingInt(e -> e * e)));
		System.out.println(evenNumbSquarSum.stream().filter(e -> e % 2 == 0).mapToInt(e -> e * e).sum());

		// Expected: 220

//6.  System.out.println(" Given a list of strings, count how many of them have a length greater than 5.");
		/* Given List: */
		List<String> wordss = Arrays.asList("apple", "banana", "kiwi", "orange", "grape", "strawberry");

		/* Solution: */
		System.out.println(wordss.stream().filter(e -> e.length() > 5).collect(Collectors.toList()));
		System.out.println(wordss.stream().filter(e -> e.length() > 5).count());

		// Expected: [apple, banana, orange, grape, strawberry]
		// Expected: 5

//7.  Filtering by City: Given the list of Person objects, "
		// filter out the people who live in 'New York' and "
		// collect their names into a new list.

		class Person {
			String name;
			int age;
			String city;

			public Person(String name, int age, String city) {
				this.name = name;
				this.age = age;
				this.city = city;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public String getCity() {
				return city;
			}

			public void setCity(String city) {
				this.city = city;
			}

		}

		/* Given List: */
		List<Person> people = Arrays.asList(new Person("Alice", 30, "New York"), new Person("Bob", 25, "London"),
				new Person("Charlie", 35, "New York"), new Person("David", 28, "Paris"),
				new Person("Eve", 30, "London"));

		System.out.println(people.stream().filter(e -> e.city.equals("New York")).map(e -> e.getName())
				.collect(Collectors.toList()));
       //Expected: [Alice, Charlie]

//8.  Finding the Average Age by City: Given the list of Person objects, 
//	  calculate the average age of people living in each city and store the result in a Map<String, Double>.

		Map<String, Double> avgAgePerCity = new HashMap();
		avgAgePerCity = people.stream()
				.collect(Collectors.groupingBy(Person::getCity, Collectors.averagingDouble(Person::getAge)));
		System.out.println(avgAgePerCity);

		//Expected: {New York=32.5, London=27.5, Paris=28.0}

//9.  





		//// 5. Use Stream API to match the expected pattern.
		//
//        		/* Given List: */
//        		String countChars = "AANKKIIITGGGUPTA";
		//
//        		/* Solution: */
//        		System.out.println(countChars.chars().collect(null, null, null));
		//
//        		// Expected: 2A3B1C

	}

}
