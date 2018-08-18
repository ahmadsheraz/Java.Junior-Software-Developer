package basics;

public class salaryCalculator {
	public static void main(String[] args) {
		
		// let's create a Veriable to define our career
		// Declare a Veriable
		String career;
		System.out.println("Programe is Starting....");
		
		// Define a Veriable
		career = "software Developer";
		System.out.println("My career is " + career);
		
		// Declare and Define a veriable in the same line
		int hoursperWeek = 40;
		int weeksperYear = 50;
		double rate = 42.50;
		
		System.out.println("As " + career + " My company is paying 42.50$ per hour");
		System.out.println("And i can work 40 hours per week, while 50 weeks per Year");
		
		double salary = hoursperWeek * weeksperYear * rate;  
		System.out.println("My salary as " + career + " at the rate of " + rate + " per hour is " + salary);
		
		//compute our annul salary.
		// rate * hoursperWeek * weeksperYear
		
	}

}




