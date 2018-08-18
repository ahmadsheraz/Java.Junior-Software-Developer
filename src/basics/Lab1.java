package basics;

public class Lab1 {
	public static void main(String[] args) {
		// Write a function that takes a value N and returns the sum of 1 to N
		System.out.println(sum(6));
		
		// Write a function that computes Factorial, Hints: use recursion, where fact n = n*(n-1)! = n*(n-1)*(n-2)! = n*(n-1)*(n-2)*(n-3).....    
		System.out.print("factorial = " + fact(5));
		
		// Write 3 functions that returns the min, avg and max of an array
		int[] numbers = {5, 10 , -3 , 40};
		System.out.println("min = " + findMin(numbers));
		
	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i = 0 ; i <= arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int sum(int n) {
		int sum = 0;
		for (int i = 1 ; i <= n ; i++) {
			System.out.print(sum + " + " + i +  " = ");
			sum = sum + i;
			System.out.println(sum);
		}
		return sum;
	}
	
	
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		return fact(n -1)* n ;
	}

}
