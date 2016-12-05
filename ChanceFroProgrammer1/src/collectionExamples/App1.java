package collectionExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class SomePerson implements Comparable<SomePerson>{
	
	private String name;
	
	public SomePerson(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SomePerson other = (SomePerson) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(SomePerson person) {
		// return -name.compareTo(person.name);
		int len1 = name.length();
		int len2 = person.name.length();
		
		if(len1 > len2){
			return 1;
		} else if(len1 < len2){
			return -1;
		} 
		// This will be executed only if two names have equal length. In that case, 
		// because of Set, we have to do some more comparing 
		else {
			return name.compareTo(person.name);
		}
	}
}

public class App1 {

	public static void main(String[] args) {
		
		List<SomePerson> list = new ArrayList<>();
		SortedSet<SomePerson> set = new TreeSet<>();
		
		addElements(list);
		addElements(set);
		
		Collections.sort(list);
		
		showElements(list);
		System.out.println();
		showElements(set);

	}
	// add elements in the collection
	private static void addElements(Collection<SomePerson> col){
		col.add(new SomePerson("Joe"));
		col.add(new SomePerson("Sue"));
		col.add(new SomePerson("Juliet"));
		col.add(new SomePerson("Clare"));
		col.add(new SomePerson("Mike"));
	}
	// show elements iterating through collection
	private static void showElements(Collection<SomePerson> col){
		for(SomePerson element : col){
			System.out.println(element);
		}
	}
}
