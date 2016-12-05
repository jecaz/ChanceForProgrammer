package collectionExamples;

import java.util.*;

public class Stuffs {

	public static void main(String[] args) {
		
		String[] stuff = {"babies", "watermelon", "melons", "fudge"};
		// convert String array to LinkedList, so I can use sort() method from
		// Collections class
		LinkedList<String> theList = new LinkedList<>(Arrays.asList(stuff));
		
		// add at the end of the list
		theList.add("pumpkin");
		// add at the beginning of the list
		theList.addFirst("firstThing");
		
		// use sort method ascending order
		System.out.println("Use sort method from Collections class, " 
					+ "ascending and descending order: ");
		Collections.sort(theList);
		System.out.printf("%s\n", theList);
		
		// use sort method descending order
		Collections.sort(theList, Collections.reverseOrder());
		// or you can do the same on this way:
		// Collections.reverse(theList);
		System.out.printf("%s\n\n", theList);
		
		// create a new array of String and convert it to List
		String[] newRay = new String[6];
		List<String> listCopy = Arrays.asList(newRay);
		
		// copy contents of theList into listCopy
		System.out.println("Copy content of theList into listCopy");
		Collections.copy(listCopy, theList);
		System.out.printf("%s\n\n", listCopy);
		
		// fill collection with something
		System.out.println("Fill list with only babies: ");
		Collections.fill(listCopy, "babies");
		System.out.printf("%s\n\n", listCopy);
		
		// convert back to an array
		stuff = theList.toArray(new String[theList.size()]);
		 
		// print out items from stuff
		System.out.println("Printing string array:");
		for(String f : stuff){
			System.out.print(f + " ");
		}

	}

}