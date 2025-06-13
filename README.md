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
		/* Solution: See the project*/
		// Expected: 37

//4.  Use Stream API to find the concatenation of the first two words that have even lengths.

		/* Given List: */
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

		/* Solution: See the project*/
		// Expected: bananacherry
		
//5.  Use Stream API to find the sum of the squares of even numbers in the list.

		/* Given List: */
		List<Integer> evenNumbSquarSum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		/* Solution: See the project*/
		// Expected: 220


//6.  System.out.println(" Given a list of strings, count how many of them have a length greater than 5.");

        /* Given List: */
        List<String> wordss = Arrays.asList("apple", "banana", "kiwi", "orange", "grape", "strawberry");
 
        /* Solution: */
        //Expected: [apple, banana, orange, grape, strawberry]
        //Expected: 5
	 
//7.  Filtering by City: Given the list of Person objects,
		// filter out the people who live in 'New York' and
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

        //Expected: [Alice, Charlie]

//8.  Finding the Average Age by City: Given the list of Person objects, 
//	  calculate the average age of people living in each city and store the result in a Map<String, Double>.

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

		//Expected: {New York=32.5, London=27.5, Paris=28.0}


//9.  Finding the Oldest Person: Given the list of Person objects, find the oldest person. 
//	  If there are multiple people with the same maximum age, you can return any one of them (or an Optional<Person>)

		//Expected: 35

			 