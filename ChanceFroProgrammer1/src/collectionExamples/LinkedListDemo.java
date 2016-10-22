package collectionExamples;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		String[] things1 = {"courage", "love", "soul", "respect", "savvy","envy", "disrespect"};
		List<String> list1 = new LinkedList<String>();
		
		for(String x : things1)
			list1.add(x);

		String[] things2 = {"envy","unbelief","selfish","freedom","peace", "faith", "support"};
		List<String> list2 = new LinkedList<String>();
		
		for(String y : things2)
			list2.add(y);
		
		list1.addAll(list2);
		list2 = null;
		
		// Mixture of things, this is life, but you choose things :)
		printMe(list1);
		
		// remove bad things from your life
		removeStuff(list1, 4,10);
		
		System.out.println("I am looking only for these things, the order" 
					+ " does not matter (as you can see): ");
		printMe(list1);
		reverseMe(list1);
		
	}
	
	// printMe method
	private static void printMe(List<String> l) {
		for(String a : l)
			System.out.printf("%s ", a);
		System.out.println();
	}
	// removeStuff method
	private static void removeStuff(List<String> l, int from, int to) {
		l.subList(from, to).clear();
	}
	// reverseMe method
	private static void reverseMe(List<String> l) {
		ListIterator<String> li = l.listIterator(l.size());
		while(li.hasPrevious()){
			System.out.printf("%s ", li.previous());
		}
		
		
	}

}
