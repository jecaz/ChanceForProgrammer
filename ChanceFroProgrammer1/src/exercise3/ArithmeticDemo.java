package exercise3;

//Using compound assignments

public class ArithmeticDemo {

	public static void main(String[] args) {
		/*
		int result = 1+2;
		System.out.println(result);
		
		result = result - 1;
		System.out.println(result);
		
		result = result * 2;
		System.out.println(result);
		
		result = result / 2;
		System.out.println(result);
		
		result = result + 8;
		result = result % 7;
		System.out.println(result);
		*/
		System.out.println(" After using compound assignments the result is same:\n");
		
		int result = 3;
		System.out.print(result + "\t");
		
		result -= 1;
		System.out.print(result + "\t");
		
		result *= 2;
		System.out.print(result + "\t");
		
		result /= 2;
		System.out.print(result + "\t");
		
		result += 8;
		result %= 7;
		System.out.print(result + "\t");
		
	}
}
