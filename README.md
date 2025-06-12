Stream API Question for Interview in Service based companies


// 1. Use Stream API to square each number in the list and
// collect the result into a new list.

		/* Given List: */

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		/* Solution: See the project*/

        // Expected: [1, 4, 9, 16, 25]

// 2. Use Stream API to find the length of the longest name in the list.

		/* Given List: */

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");

		/* Solution: See the project*/

		// Expected: 7


// 3. Use Stream API to count the total number of distinct words (case-insensitive) in all the sentences.

		/* Given List: */
		List<String> sentences = Arrays.asList(
                "Java Stream API provides a fluent interface for processing sequences of elements.",
                "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
                "In this exercise, you need to count the total number of words in all sentences."
        );

		/* Solution: */
		System.out.println(sentences
				.stream().flatMap(e -> Arrays.stream(e.split(" "))).distinct().collect(Collectors.toList()));

		// Expected: 37
