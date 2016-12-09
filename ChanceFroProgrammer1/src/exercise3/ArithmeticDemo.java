package exercise3;

//Using compound assignments

public class ArithmeticDemo {

	public static void main(String[] args) {
		
		int result = 1+2;
		System.out.print(result + "\t");
		
		result = result - 1;
		System.out.print(result + "\t");
		
		result = result * 2;
		System.out.print(result + "\t");
		
		result = result / 2;
		System.out.print(result + "\t");
		
		result = result + 8;
		result = result % 7;
		System.out.print(result + "\t\n\n");
		
		System.out.println("After using compound assignments the result is same:\n");
		
		int result1 = 3;
		System.out.print(result1 + "\t");
		
		result1 -= 1;
		System.out.print(result1 + "\t");
		
		result1 *= 2;
		System.out.print(result1 + "\t");
		
		result1 /= 2;
		System.out.print(result1 + "\t");
		
		result1 += 8;
		result1 %= 7;
		System.out.print(result1 + "\t");
		
	}
}
