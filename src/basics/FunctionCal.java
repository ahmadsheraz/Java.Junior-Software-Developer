package basics;

public class FunctionCal {
	
	public static void main(String[] args) {
		printName();
		int numA = 30;
		int numB = 50;
		addNumbers(numA, numB);
		System.out.println("The product of " +numA + " and " + numB+ " is " +multipleNumbers(numA, numB));
	}
	
	static void printName() {
		System.out.println("My name is Sheraz");
	}
	
	static void addNumbers(int numberA , int numberB){
		// This function will add two Numbers.
		int sum = numberA + numberB;
		System.out.println("The sum of Numbers " + numberA + " and " + numberB + " is " + sum);
	}
	
	static int multipleNumbers(int valueA , int valueB) {
		int product = valueA * valueB;
		return product;
	}

}
