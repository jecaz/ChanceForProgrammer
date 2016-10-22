package exercise18;

import java.util.Arrays;
import java.util.Collection;

public class Test {

	public static void main(String[] args) {
		
		Collection<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = Algorithm.countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
    }
}
