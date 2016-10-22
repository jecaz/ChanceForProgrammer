package exercise18;

import java.util.Collection;
import java.util.List;

public class Algorithm {
	
	// Show number of odd numbers
	public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {

        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
        return count;
    }
	//Write a generic method to exchange the positions of two 
	//different elements in an array.
	public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
	
	// Write a generic method to find the maximal element in the range 
	// [begin, end) of a list.
	
	public static <T extends Object & Comparable<? super T>>
    T max(List<? extends T> list, int begin, int end) {

    T maxElem = list.get(begin);

    for (++begin; begin < end; ++begin)
        if (maxElem.compareTo(list.get(begin)) < 0)
            maxElem = list.get(begin);
    return maxElem;
}
}
