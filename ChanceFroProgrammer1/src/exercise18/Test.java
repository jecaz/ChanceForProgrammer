package exercise18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		// Using countIf method
		Collection<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = Algorithm.countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
        
        // Using swap method 
        Integer[] numbers = {1, 2, 3, 4};
        for(Integer num : numbers)
        	System.out.print(num + " ");
        
        Algorithm.swap(numbers, 1, 2);
        System.out.println();
        
        System.out.println("Swap method works");
        for(Integer num : numbers)
        	System.out.print(num + " ");
        
        System.out.println();
        
        // Using max method
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < 6; i++){
        	list.add(i);
        }
        
        int begin = list.get(0);
        int end = list.get(list.size() - 1); 
        
        int maxNumber = Algorithm.max(list, begin, end);
        System.out.println("Max number is: " + maxNumber);
    }
}
