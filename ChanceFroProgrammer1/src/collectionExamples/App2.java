package collectionExamples;

import java.util.*;

public class App2 {

	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<>();
		
		animals.add("fox");
		animals.add("dog");
		animals.add("cat");
		animals.add("rabbit");
		
		Iterator<String> it = animals.iterator();
		
		while(it.hasNext()){
			String value = it.next();
			System.out.println(value);
			
			if(value.equals("cat")){
				it.remove();
			}
		}
		
		System.out.println();
		
		/// Modern iteration, Java 5 and later
		
		for(String animal : animals){
			System.out.println(animal);
			
			// If you want to remove item from the list you must use Iterator. 
			// Otherwise, this code will cause run-time error -> animals.remove();
		}

	}

}
