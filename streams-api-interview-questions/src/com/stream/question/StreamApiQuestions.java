package com.stream.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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

	}

}
