package com.stream.question;

import java.lang.reflect.Array;
import java.security.Identity;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
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

			// --- IMPORTANT: Override the toString() method ---
			@Override
			public String toString() {
				return "Person{" + "name='" + name + '\'' + ", age=" + age + ", city='" + city + '\'' + '}';
			}

		}

		/* Given List: */
		List<Person> people = Arrays.asList(new Person("Alice", 30, "New York"), new Person("Bob", 25, "London"),
				new Person("Charlie", 35, "New York"), new Person("David", 28, "Paris"),
				new Person("Eve", 30, "London"));

		System.out.println(people.stream().filter(e -> e.city.equals("New York")).map(e -> e.getName())
				.collect(Collectors.toList()));
		// Expected: [Alice, Charlie]

//8.  Finding the Average Age by City: Given the list of Person objects, 
//	  calculate the average age of people living in each city and store the result in a Map<String, Double>.

		Map<String, Double> avgAgePerCity = new HashMap();
		avgAgePerCity = people.stream()
//				.sorted(Comparator.comparing(Person::getAge))
				.collect(Collectors.groupingBy(Person::getCity, Collectors.averagingDouble(Person::getAge)));
		System.out.println(avgAgePerCity);

		// Expected: {New York=32.5, London=27.5, Paris=28.0}

//9.  Finding the Oldest Person: Given the list of Person objects, find the oldest person. 
//	  If there are multiple people with the same maximum age, you can return any one of them (or an Optional<Person>)

		System.out.println(people.stream().max(Comparator.comparingInt(Person::getAge)).map(e -> e.age).get());
		// Expected: 35

//10.  Sort by age

		Map<Integer, List<Person>> people2 = new HashMap<>();
		people2.put(1, Arrays.asList(new Person("Alice", 31, "New York"), new Person("Alice", 30, "New York")));
		people2.put(2, Arrays.asList(new Person("Alice", 32, "New York"), new Person("Alice", 33, "New York")));
		people2.put(3, Arrays.asList(new Person("Alice", 35, "New York"), new Person("Alice", 34, "New York")));
		people2.put(4, Arrays.asList(new Person("Alice", 36, "New York"), new Person("Alice", 37, "New York")));
		people2.put(5, Arrays.asList(new Person("Alice", 38, "New York"), new Person("Alice", 39, "New York")));

		System.out.println("Original Map:");
		people2.forEach((key, value) -> System.out.println(key + ": " + value));
		System.out.println("----------------------------------------");

		// Sort the List<Person> within each map entry by age (Ascending)
		Map<Integer, List<Person>> mapWithListsSortedByAgeAsc = people2.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey, // Keep the original key
						entry -> entry.getValue().stream() // Get the list of people
								.sorted(Comparator.comparingInt(Person::getAge)) // Sort people in the list by age
								.collect(Collectors.toList()), // Collect the sorted people back into a new list
						(oldValue, newValue) -> oldValue, // Merge function for duplicate keys (not relevant here as
															// keys are unique)
						HashMap::new
				// You can use HashMap or LinkedHashMap if you want to preserve iteration order
				// based on key insertion
				// HashMap doesn't guarantee order of its entries, but the lists within will be
				// sorted.
				));

		System.out.println("\nMap with internal lists sorted by Age (Ascending):");
		mapWithListsSortedByAgeAsc.forEach((key, value) -> System.out.println(key + ": " + value));

		System.out.println("----------------------------------------");

//11.  Remove duplicates from String and returns in the same order   

		// Given:
		String s = "dabcadefg";
		// First way:
		s.chars().distinct().forEach(e -> System.out.print((char) e));
		System.out.println(""); // added System.out.println(""); to saparate previous output
		// Second Way:
		s.chars().distinct().mapToObj(e -> (char) e).forEach(System.out::print);
		System.out.println("");
		// 3rd Way:
		Arrays.stream(s.split("")).distinct().forEach(System.out::print);
		System.out.println("");
		// EPAM interview asked way
		String l = Arrays.stream(s.split("")).distinct().collect(Collectors.joining());
		System.out.println(l);
		// Expected: dabcefg

//12.   Find the word that has the second or nth highest length

		// Given:
		String s2 = "I am learning Streams API in Java";

		System.out.println(Arrays.stream(s2.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1)
				.findFirst().get());
		// Expected: Streams

//13.    Given a sentence, find the occurrence of each word

		// Given:
		String sent = "I am learning Streams API in Java Java";

		// Ist way
		System.out
				.println(Arrays.stream(sent.split(" ")).collect(Collectors.groupingBy(e -> e, Collectors.counting())));

		// 2nd way:
		System.out.println(Arrays.stream(sent.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

		// Expected: {Java:2, in:1, API:1, streams:1, learning:1, am:1, I:1}

//14.  Given a sentence, find the words with a specified number of vowels and words with exacly output no. of vowels

		// Given: number of vowels: 2
		String sen = "I am learning Streams API in Java";

		System.out.println(Arrays.stream(sen.split(" ")).filter(e -> e.replaceAll("[^aeiouAEIOU]", "").length() == 2)
				.collect(Collectors.joining(" ")));
		// Expected: Stream, Java, API

//15.  Given a list of Integers, divide it into two lists one having an even number and the other having an odd number

		// Given:
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// one way
		System.out.println(Arrays.stream(a).boxed().collect(Collectors.partitioningBy(e -> e % 2 == 0)).values()
				.stream().collect(Collectors.toList()));
		// 2nd way
		Map<Boolean, List<Integer>> intList = Arrays.stream(a).boxed()
				.collect(Collectors.partitioningBy(e -> e % 2 == 0));

		System.out.println(intList.values().stream().collect(Collectors.toList()) + " OR "
				+ intList.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList()));
		// Expected: [[1,3,5,7], [2,4,6,8]]

//16.  Given a word, find the occurrence of each character

		// Given:
		String str = "Mississippi";
		
		//1st way
		System.out.println(
				Arrays.stream(str.split("")).collect(Collectors.groupingBy(e -> e)).entrySet().stream().map((e) -> {
					return e.getKey() + "=" + e.getValue().size();
				}).collect(Collectors.toList()));
		
		//2nd way
		System.out.println(
				Arrays.stream(str.split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting()))
		);
		
		// Expected: {p=2, s=4, i=4, M=1}
		
//17.  Arrange the numbers in Descending/Ascending Order
		
	   // Given: 
		int[] numI= {1, 2, 4, 3, 5};
		System.out.println(
							Arrays.stream(numI).boxed().sorted(Comparator.comparing(Function.identity())).collect(Collectors.toList())
							+" / "+
							Arrays.stream(numI).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
							);
		// Expected: 12345 / 54321

//18.  Given an array, find the sum of unique elements
		
		//Given: 
		int[] arr = {1,6,7,8,1,1,8,8,7};
		System.out.println(
							Arrays.stream(arr).distinct().sum()
							);
		//Expected: 22
		
// 19. Given a string, find the first non-repeated character

		// Given:
		String ss = "HHeello  Worrld";

		// 1st way
		System.out
				.println(Arrays.stream(ss.split("")).filter(e -> ss.indexOf(e) == ss.lastIndexOf(e)).findFirst().get());

		// 2nd way
		System.out.println(Arrays.stream(ss.split(""))
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).map(e -> e.getKey()).findFirst().get());
		// Expected:W

//20.  Given a string, find the first repeated character
		
		// Given:
		 String sss = "Heello  Worrld";
		 System.out.println(
		 Arrays.stream(sss.split("")).collect(Collectors.groupingBy(Function.identity(),
				 LinkedHashMap::new,
				 Collectors.counting())).entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).findFirst().get()
		 );

		// Expected:e

//21.   Given an array of integers, group the numbers by the rangein which they belong

		//Given:
		int[] arry = {2,3,10,14,20,24,30,34,40,44,50,54};
	System.out.println(
		Arrays.stream(arry).boxed().collect(Collectors.toList())
		.stream().collect(
				Collectors.groupingBy(
						e -> e/10*10,
						LinkedHashMap::new,
						Collectors.toList()
						))
			);
		
		//Expected: {0=[2,3], 10=[10,14], 20=[20,24], 30=[30,34], 40=[40,44], 50=[50,54] }

//22.  Given a list of strings, create a list that contains only integers

		//Given: 
		String[] sing = {"abc", "123", "456", "xyz"};
		System.out.println(
							Arrays.stream(sing).filter(e -> e.matches("[0-9]+")).map(Integer::valueOf).collect(Collectors.toList())
							);
		//Expected: [123, 456]

	
//23.  Find the products of the first two elements in an array.
	
		//Given:
		int[] arrr = {12,5,6,9,2,4};
		System.out.println(
							Arrays.stream(arrr) // IntStream
			                .boxed()      // Stream<Integer>
			                .limit(2)     // Stream<Integer> with first 2 elements: {12, 5}
			                .reduce((xx, yy) -> xx*yy) // Optional<Integer> (contains 60)
			                .get()
							);
		
		//Expected: 60
	
//24.  
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
