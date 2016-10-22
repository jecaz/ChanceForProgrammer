package collectionExamples;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		
		String[] things = {"apple", "bob", "ham", "bob", "bacon"};
		List<String> list = Arrays.asList(things);
		
		System.out.printf("%s\n\n", list);
		
		Set<String> set = new HashSet<>(list);
		// print out items without duplicates
		System.out.printf("%s\n ", set);
	}
}
