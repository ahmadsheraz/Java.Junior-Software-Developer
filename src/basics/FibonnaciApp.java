package basics;
import java.util.Scanner;

public class FibonnaciApp {

	public static void main(String[] args) {
		
		
/*..........................................................................................
		// Fibonnaci number is defined by the sum of previous 2 Fibonnaci numbers
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(1) + fib(0) = 0 + 1 = 1
		// fib(3) = fib(2) + fib(1) = 1 + 1 = 2
		// fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		// fib(5) = fib(4) + fib(3) = 3 + 2 = 5
		
		System.out.println(fib(9));

	}
	
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		return (fib(n - 1) + fib(n - 2));
		
	...................................................................................	*/
		
		// Programe to find Factorial of a number
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to find its Factorial = ");
		int num = scan.nextInt();
		
		int i;
		int fact = 1;
		for (i = 1; i<=num ; i++) {
			fact = fact*i;
		}
		
		System.out.println("Factorial of given number is = " + fact);
	}

}




