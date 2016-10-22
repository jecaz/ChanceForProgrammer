package collectionExamples;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		
		String[] animals = {"hourse", "dolphin", "shark", "snake", "squirrel"};
		List<String> list1 = new ArrayList<String>();
		
		// add array items to list
		for(String x : animals){
			list1.add(x);
		}
		
		String[] moreAnimals = {"shark", "snake"};
		List<String> list2 = new ArrayList<String>();
		
		// add array items to list
		for(String y : moreAnimals){
			list2.add(y);
		}
		
		// print out list2
		System.out.println("Printing list2: ");
		for(int i = 0; i < list2.size(); i++)
			System.out.printf("%s ", list2.get(i));
			System.out.println();
		
		
		// print out list1
		System.out.println("Printing list1 before applying editList method: ");
		for(int i = 0; i < list1.size(); i++){
			System.out.printf("%s ", list1.get(i));
		}
		
		editList(list1, list2);
		System.out.println();
		
		// print out list1
		System.out.println("Printing list1 after applying editList method: ");
		for(int i = 0; i < list1.size(); i++){
			System.out.printf("%s ", list1.get(i));
		}

	}
	
	// move from l1 items which are in l2
	public static void editList(Collection<String> l1, Collection<String> l2){
		Iterator<String> it = l1.iterator();
		while(it.hasNext()){
			if(l2.contains(it.next()))
				it.remove();
		}
	}

}
