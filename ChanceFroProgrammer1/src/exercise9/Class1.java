package exercise9;

public class Class1 {
	
	// Declare outer class variable
	private int numberOfStatement = 0;
	
	// Declare variable of inner class
	protected InnerClass1 ic;
	 
	// Instantiate inner class in constructor
    public Class1() {
    ic = new InnerClass1();
    }
    
    // Display strings from invoking two inner class methods
    public void displayStrings() {
    System.out.println(ic.getString() + ".");
    System.out.println(ic.getAnotherString() + ".");
    }
    
    protected class InnerClass1 {
    	
    	// Create two inner class methods returning string representation
        public String getString() {
        	numberOfStatement = 1;
            return numberOfStatement + ". InnerClass1: getString invoked";
        }
     
        public String getAnotherString() {
        	numberOfStatement = 2;
            return numberOfStatement + ". InnerClass1: getAnotherString invoked";
        }
    }
    
    public static void main(String[] args) {
		
		// Create instance from outer class Class1
        Class1 c1 = new Class1();
        // Invoke method from outer class on its reference variable
        c1.displayStrings();
        
    }
}
  
    
    /* What is the output?
     
     Answer: InnerClass1: getString invoked.
			 InnerClass1: getAnotherString invoked.
			 
     		The method displayStrings() is invoked on the reference of the outer class
     		Class1 (c1). This method invoked two other from inner class InnerClass1, 
     		getString() and getAnotherString(). These two are applied on ic reference 
     		of InnerClass1 which is created by constructor of outer class.
     */
    

