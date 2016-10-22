package exercise9;

import java.util.Iterator;
import java.util.function.Function;

public class DataStructure {

    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    
    // Assign values to each element of the array through constructor
    public DataStructure() {
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    // return constant variable SIZE
    public int size() {
        return SIZE;
    }
    // return element of the array with given index
    public int get(int index) {
        return arrayOfInts[index];        
    }
    
    interface DataStructureIterator extends Iterator<Integer> { }
    
    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    private class EvenIterator implements DataStructureIterator {
        
        private int nextIndex = 0;
        // Override hasNext and next methods from interface Iterator
        @Override
        public boolean hasNext() {
            return (nextIndex <= SIZE - 1);
        }        
        @Override
        public Integer next() {
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            nextIndex += 2;
            return retValue;
        }
    }
    
    // Here is defined a method in DataStructure that creates and returns 
    // a new instance of EvenIterator
    public DataStructureIterator getEvenIterator() {
        return new EvenIterator();
    }
    
    // I invoke method getEvenIterator() and assigned it to a reference iterator of type
    // DataStructureIterator-interface (which is a member of outer class DataStructure) 
    public void printEven() {
        DataStructureIterator iterator = getEvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    /* print method  will be invoked with an instance of the class EvenIterator.
       Also this method will use an anonymous class as the method's
       argument instead of the parameter of type DataStructureIterator.
     */
    public void print(DataStructureIterator iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    // print method for using lambda expressions. For parameter use functional interface Function,
    // and implement its method apply 
    public void print(Function<Integer, Boolean> function) {
        for (int i = 0; i < SIZE; i++) {
            if (function.apply(i)) {
                System.out.print(arrayOfInts[i] + " ");
            }
        }
        System.out.println();
    }
    // Following two methods are created for applying  method references
    // for even and odd numbers
    public static Boolean isEvenIndex(Integer index) {
        if (index % 2 == 0) return Boolean.TRUE;
        return Boolean.FALSE;
    }
    
    public static Boolean isOddIndex(Integer index) {
        if (index % 2 == 0) return Boolean.FALSE;
        return Boolean.TRUE;
    }

    public static void main(String [] args) {
        
        DataStructure ds = new DataStructure();
        
        System.out.println("printEven()");
        ds.printEven();
        
        System.out.println("print(DataStructureIterator) with "    
            + "getEvenIterator");
        ds.print(ds.getEvenIterator());
        
        System.out.println("print(DataStructureIterator) with "
            + "anonymous class, odd indices");
        ds.print(
            new DataStructure.DataStructureIterator() {
                private int nextIndex = 1;
                public boolean hasNext() {
                    return (nextIndex <= ds.size() - 1);
                }
                public Integer next() {
                    int retValue = ds.get(nextIndex);
                    nextIndex += 2;
                    return retValue;
                }
            }
        );
        
        System.out.println("print(Function) with lambda expressions, even indices");
        ds.print(index -> {
            if (index % 2 == 0) return Boolean.TRUE;
            return Boolean.FALSE;
        });
        System.out.println("print(Function) with lambda expressions, odd indices");
        ds.print(index -> {
            if (index % 2 == 0) return Boolean.FALSE;
            return Boolean.TRUE;
        });
        
        System.out.println("print(Function) with method references");
        ds.print(DataStructure::isEvenIndex);
        ds.print(DataStructure::isOddIndex);
        
    }
}