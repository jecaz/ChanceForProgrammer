package exercise12;



// CharSequenceDemo presents a String value -- backwards.

public class CharSequenceDemo implements CharSequence {
	
	private String s;

	public CharSequenceDemo(String s) {
		this.s = s;
	}

	//If the string is backwards, the end is the beginning!
	private int fromEnd(int i) {
		return s.length() - 1 - i;
	}
	// Override charAt, subSequence, length and toString method from interface CharSequence 
	@Override
	public char charAt(int i) {
		if ((i < 0) || (i >= s.length())) {
			throw new StringIndexOutOfBoundsException(i);
		}
		return s.charAt(fromEnd(i));
	}

	public int length() {
		return s.length();
	}
	/* If start less then 0 or greater then end, and end is greater then sting s length
	   method will throw an exception. Otherwise it will build object of StringBuilder and 
	   present it in the reverse order
	*/
	public CharSequence subSequence(int start, int end) {
		if (start < 0) {
			throw new StringIndexOutOfBoundsException(start);
		}
		if (end > s.length()) {
			throw new StringIndexOutOfBoundsException(end);
		}
		if (start > end) {
			throw new StringIndexOutOfBoundsException(start - end);
		}
		StringBuilder sub = 
				new StringBuilder(s.subSequence(fromEnd(end), fromEnd(start)));
		return sub.reverse();
	}

	public String toString() {
		StringBuilder s = new StringBuilder(this.s);
		return s.reverse().toString();
	}

	//Random int from 0 to max. As random() generates values between 0 and 0.9999
	private static int random(int max) {
		return (int) Math.round(Math.random() * (max+1));
	}

	public static void main(String[] args) {
		CharSequenceDemo s =
				new CharSequenceDemo("Write a class that implements the CharSequence " 
									+"interface found in the java.lang package.");
   	//System.out.println(s.length());
   //exercise charAt() and length()
   for (int i = 0; i < s.length(); i++) {
       System.out.print(s.charAt(i));
   }
   
   System.out.println("");

   //exercise subSequence() and length();
   int start = random(s.length() - 1);
   int end = random(s.length() - 1 - start) + start;
   System.out.println(s.subSequence(start, end));

   //exercise toString();
   System.out.println(s);

}
}
