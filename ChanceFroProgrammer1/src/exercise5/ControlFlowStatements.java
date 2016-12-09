package exercise5;

// Use if-else statement to see which statement will be printed

public class ControlFlowStatements {

	public static void main(String[] args) {
		
		int aNumber = 3;
		
		if(aNumber >= 0){
			if(aNumber == 0){
				System.out.println("first string");
		} else {
			System.out.println("second string");
			}
		}
		System.out.println("third string");
		
		/* a. What output do you think the code will produce if aNumber is 3?
		-----------------------------------------------------------------------  
		   Answer:
		   
		 * 		second string
		 * 		third string
		 
		   b. Explain what is the control flow for the code snippet?
		  ----------------------------------------------------------- 
		   Answer:
		 
		 * 		First if condition is true (3 >= 0) and second one isn't, so else 
		 * 		statement will be printed. The third string is always displayed because
		 * 		it is completely outside of any if statement.
		  
		 
		   c. Using only spaces and line breaks, reformat the code snippet to make 
		   the control flow easier to understand.
		   -------------------------------------------------------------------------
		   Answer:
		   
		 * if(aNumber >= 0)
			if(aNumber == 0)
				System.out.println("first string");
			else
				System.out.println("second string");
				
			System.out.println("third string");
			
			d. Use braces {} to further clarify the code.
			----------------------------------------------
			Answer:
			
			if(aNumber >= 0){
				if(aNumber == 0){
				System.out.println("first string");
				}else{
				System.out.println("second string");
				}
			  }	
			System.out.println("third string");
		 */

	}

}
