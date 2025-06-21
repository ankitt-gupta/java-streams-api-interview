# Stream API Question for Interview in Service based companies


1. Use Stream API to square each number in the list and collect the result into a new list.

		 /* Given List: */
		 
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		 
		 /* Solution: See the project*/
		 
         // Expected: [1, 4, 9, 16, 25]

2. Use Stream API to find the length of the longest name in the list.

		 /* Given List: */
		 
		 List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
		 
		 /* Solution: See the project*/
		 
		 // Expected: 7

3. Use Stream API to count the total number of distinct words (case-insensitive) in all the sentences.

		 /* Given List: */
		 List<String> sentences = Arrays.asList(
                "Java Stream API provides a fluent interface for processing sequences of elements.",
                "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
                "In this exercise, you need to count the total number of words in all sentences."
         );
		 /* Solution: See the project*/
		 // Expected: 37

4.  Use Stream API to find the concatenation of the first two words that have even lengths.

		 /* Given List: */
		 List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		 
		 /* Solution: See the project*/
		 // Expected: bananacherry

5.  Use Stream API to find the sum of the squares of even numbers in the list.

		 /* Given List: */
		 List<Integer> evenNumbSquarSum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 
		 /* Solution: See the project*/
		 // Expected: 220


6.  System.out.println(" Given a list of strings, count how many of them have a length greater than 5.");

         /* Given List: */
         List<String> wordss = Arrays.asList("apple", "banana", "kiwi", "orange", "grape", "strawberry");
		 
         /* Solution: */
         //Expected: [apple, banana, orange, grape, strawberry]
         //Expected: 5

7.  Filtering by City: Given the list of Person objects, filter out the people who live in 'New York' and collect their names into a new list.

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

8.  Finding the Average Age by City: Given the list of Person objects, calculate the average age of people living in each city and store the result in a Map<String, Double>.

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


9.  Finding the Oldest Person: Given the list of Person objects, find the oldest person. If there are multiple people with the same maximum age, you can return any one of them (or an Optional<Person>)
         
		 //Expected: 35

10.  Sort by age

		 Map<Integer, List<Person>> people2 = new HashMap<>();
         people2.put(1, Arrays.asList(new Person("Alice", 31, "New York"), new Person("Alice", 30, "New York")));
         people2.put(2, Arrays.asList(new Person("Alice", 32, "New York"), new Person("Alice", 33, "New York")));
         people2.put(3, Arrays.asList(new Person("Alice", 35, "New York"), new Person("Alice", 34, "New York")));
         people2.put(4, Arrays.asList(new Person("Alice", 36, "New York"), new Person("Alice", 37, "New York")));
         people2.put(5, Arrays.asList(new Person("Alice", 38, "New York"), new Person("Alice", 39, "New York")));	

         //Expected: Map with internal lists sorted by Age (Ascending):
				1: [Person{name='Alice', age=30, city='New York'}, Person{name='Alice', age=31, city='New York'}]
				2: [Person{name='Alice', age=32, city='New York'}, Person{name='Alice', age=33, city='New York'}]
				3: [Person{name='Alice', age=34, city='New York'}, Person{name='Alice', age=35, city='New York'}]
				4: [Person{name='Alice', age=36, city='New York'}, Person{name='Alice', age=37, city='New York'}]
				5: [Person{name='Alice', age=38, city='New York'}, Person{name='Alice', age=39, city='New York'}]
				----------------------------------------

11.  Remove duplicates from String and returns in the same order   

         //Given:
         String s = "dabcadefg";
        
         //Expected: dabcefg

12.   Find the word that has the second or nth highest length

			 //Given:
			 String s = "I am learing Streams API in Java";
			 //Expected: Streams

13.  Given a sentence, find the occurrence of each word

		 // Given:
		 String sent = "I am learning Streams API in Java Java";
		 // Expected: {Java:2, in:1, API:1, streams:1, learning:1, am:1, I:1} 
		
14.  Given a sentence, find the words with a specified number of vowels and words with exacly output no. of vowels

		 //Given: specified number of vowles: 2
		 String sen = "I am learning Streams API in Java";
		 
		 //Expected: Stream, Java, API  -> contains 2 vowles

15.  Given a list of Integers, divide it into two lists one having an even number and the other having an odd number
		
		 // Given: 
		 int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		
		 //Expected: [[1,3,5,7], [2,4,6,8]]

16.  Given a word, find the occurrence of each character

		 // Given: 
		 String a = "Mississippi";
		 
		 //Expected: {p=2, s=4, i=4, M=1}

17.  Arrange the numbers in Descending/Ascending Order
	
	     // Given: 
		 int[] numI= {1, 2, 3, 4, 5};
		
		 // Expected: 12345 / 54321

18.  Given an array, find the sum of unique elements
		
		 //Given: 
		 int[] arr = {1,6,7,8,1,1,8,8,7};
		
		 //Expected: 22

19. Given a string, find the first non-repeated character

		 //Given: 
		 String ss = "HHello World";
		
		 //Expected: e

20.  Given a string, find the first repeated character

		 // Given:
		 String sss = "Heello  Worrld";
		 
		 // Expected:e

21.   Given an array of integers, group the numbers by the rangein which they belong

			 //Given:
			 int[] arry = {2,3,10,14,20,24,30,34,40,44,50,54};
			 
			 //Expected: {0=[2,3], 10=[10,14], 20=[20,24], 30=[30,34], 40=[40,44], 50=[50,54] }

22.  Given a list of strings, create a list that contains only integers

		 //Given:
		 String[] sing = {"abc", "123", "456", "xyz"};
		 
		 //Expected: [123, 456]

23.  Find the products of the first two elements in an array.

		 //Given:
		 int[] arrr = {12,5,6,9,2,4};
		
		 //Expected: 60
	
24.  Group /Pair anagrams froma list of strings. For 1 word consider only 1 anagram.
       
	     //Given
	     String[] ssss = {"pat", "tap", "pan", "nap",
					  "Team", "tree", "meat"};
	     //Expected: [[pan,nap], [pat, tap], [Team, meat], [tree]]

25.  Write a stream program to multiply alternative numbers in an array

			//Given:
			int[] ar = {4,5,1,7,2,9,2};
			
			//Expected: 48

26.  Write a program to multiply 1st and last element, 2nd and 2nd last element etc.

			// Given:
			int[] ar2 = { 4, 5, 1, 7, 2, 9};

			// Expected:36
			//          10
			//          7

27. Write a stream program to move all zero’s to beginning of array

			// Given:
			int[] a27 = { 5, 0, 1, 0, 8, 0 };
			// Expected: {0,0,0,5,1,8}

28. In a given array of integers, return true if it contains distinct values

			// Give:
			int[] a28 = { 5, 0, 1, 0, 8, 0 };
			// Expected: false

29.  Given the string[] group the strings based on the middle character

			// Given:
			String[] str29 = { "ewe", "jjj", "jhj", "kwk", "aha" };
			// Expected: O/P: { w = [ewe, kwk], h = [jhj, aha], j = [jjj] }

30. Find the sum of all the elements in a list.

			//Given:
			List<Integer> num30 = Arrays.asList(1,2,3,4,5);
			//Expected: O/P: 15

31. Sort a list of strings in alphabetical order.

			//Given I/P: 
			List<String> str31 = Arrays.asList("Zudio", "Puma", "Addidas", "MAC", "H&M");
			//O/P: [Addidas, H&M, MAC, Puma, Zudio]

32. Find the kth smallest element in a list of integers.

			//Given I/P: 
			List<Integer> list1 = Arrays.asList(7,1,6,2,1,3,4,5);
			k=3
			//Expected O/P: [2]

33.







