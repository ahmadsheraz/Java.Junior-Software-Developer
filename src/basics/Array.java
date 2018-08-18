package basics;

public class Array {

	public static void main(String[] args) {
		//Declare and Define an Array
		String[] cities = {"Stockholm", "Vasteras", "Malmo", "Uppsala", "Lund"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		System.out.println(cities[4]);
		
		
		// Declare and Define Array Explicity the size
		String[] states = new String[6];
		states[0] = "california";
		states[1] = "Florida";
		states[2] = "Texas";
		states[3] = "New York";
		states[4] = "Hawaii";
		states[5] = "Pennsylvania";
		System.out.println(states[3]);
		
		
		// Declare Array
		String[] countries;
		
		
		//Define the Arrays
		countries = new String[5];
		countries[0] = "Canada";
		countries[1] = "Austrilia";
		countries[2] = "USA";
		countries[3] = "UK";
		countries[4] = "Sweden";
		System.out.println(countries[3]);
		

	}

}
