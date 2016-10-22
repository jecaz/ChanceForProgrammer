package exercise17;

// Show two ways to concatenate the following two strings 
// together to get the string "Hi, mom." (I choose tree ways :) )

public class StringConcatenate {

	public static void main(String[] args) {
		
		String hi = "Hi, ";
		String mom = "mom.";
		
		// first way using StringBuilder class 
		StringBuilder sb = new StringBuilder(hi);
		
		System.out.println("Implementation of append method: " + sb.append(mom));
		
		System.out.println("The length of sb is: " + sb.length() 
				+ ", and capacity is: " + sb.capacity());
		
		System.out.println("Implementation of insert method: " 
							+ sb.insert(sb.length()-1, " and dad"));
		
		System.out.println("Implementation of reverse method:" + sb.reverse());
		
		// Now I convert StringBuilder object to a string  
		System.out.println(sb.toString() + "\n");
	
		// second way using String method concat()
		System.out.println(hi.concat(mom) + "\n");
		
		// third way with + operator
		System.out.println(hi + mom);

	}
}
