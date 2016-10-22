package collectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
	
	private int id;
	private String name;
	
	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		return id + ": " + name;
	}
}

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 > len2){
			return 1;
		}
		else if(len1 < len2){
			return -1;
		}
		return 0;
	}
}

class AlphabeticalComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
}
class ReverseAlphabeticalComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}
}

public class App {

	public static void main(String[] args) {
		
		////////////////////// Sorting Strings ///////////////////////////
		System.out.println("Sorting strings");
		List<String> animals = new ArrayList<>();
		
		animals.add("tiger");
		animals.add("lion");
		animals.add("cat");
		animals.add("snake ");
		animals.add("dog");
		animals.add("elephant");
		
		// Collections.sort(animals, new StringLengthComparator());
		// Collections.sort(animals, new AlphabeticalComparator());
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		
		for(String animal : animals){
			System.out.println(animal);
		}
		
		//////////////////////Sorting Numbers ///////////////////////////
		System.out.println("Sorting numbers");
		List<Integer> numbers = new ArrayList<>(); 
		
		numbers.add(37);
		numbers.add(3);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);
		
		// Anonymous class
		Collections.sort(numbers, new Comparator<Integer>(){

			@Override
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
		});
		
		for(Integer number : numbers){
			System.out.println(number);
		}
		
		//////////////////////Sorting arbitrary objects ///////////////////////////
		System.out.println("Sorting arbitrary objects");
		List<Person> people = new ArrayList<>();
		
		people.add(new Person(1, "Joe"));
		people.add(new Person(3, "Bob"));
		people.add(new Person(4, "Clare"));
		people.add(new Person(2, "Sue"));
		
		for(Person person : people){
			System.out.println(person);
		}
		
		// Sort in order of ID
		System.out.println("Sort in order of ID");
		Collections.sort(people, new Comparator<Person>(){
			@Override
			public int compare(Person p1, Person p2) {
				
				if(p1.getId() > p2.getId()){
					return 1;
				} else if(p1.getId() < p2.getId()){
					return -1;
				}
				return 0;
			}
		});
		
		for(Person person : people){
			System.out.println(person);
		}
		
		// Sort in order of name
		System.out.println("Sort in order of name");
		Collections.sort(people, new Comparator<Person>(){
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		
		for(Person person : people){
			System.out.println(person);
		}

	}

}
