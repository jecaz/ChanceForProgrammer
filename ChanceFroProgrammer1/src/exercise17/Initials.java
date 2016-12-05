package exercise17;

// Write a program that computes your initials from your full name and displays them.

public class Initials {

	public static void main(String[] args) {
		
		String myName = "Jelena";
		String mySurname = "Zobenica";
		String myNameAndSurname = new String(myName + mySurname);
		
		
		for(int i = 0; i< myName.concat(mySurname).length(); i++){
			if(Character.isUpperCase(myName.charAt(i)) 
					&& Character.isUpperCase(mySurname.charAt(i))){
				System.out.println("My initials are: " + myName.charAt(i) 
				+ mySurname.charAt(i));
				break;
			}
		}
		System.out.println("\nAnother way \n");
		
    StringBuffer myInitials = new StringBuffer();
    int length = myNameAndSurname.length();

    for (int j = 0; j < length; j++) {
        if (Character.isUpperCase(myNameAndSurname.charAt(j))) {
            myInitials.append(myNameAndSurname.charAt(j));
        }
    }
    
    System.out.println("My initials are: " + myInitials.toString());
		
	}

}
