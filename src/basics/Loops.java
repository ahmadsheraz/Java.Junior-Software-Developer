package basics;

public class Loops {
	public static void main(String[] args) {
		// For loop: best structure for iterating through an array
		// Simple For loop program
		System.out.println("This is Simple program using For Loop");
		int a = 5;
		for(a=0; a<=5; a++) {
			System.out.println(a);
		}
		System.out.println("................................................................");
		
		// For loop for accesing index of an Array
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "New York";
		states[2] = "Texas";
		states[3] = "Hawaii";
		states[4] = "Pennsylvania";
		for(int x=0; x<=4; x++) {
			System.out.println(states[x]);
		}
		
		//...................................................................................
		// While Loop
		int i = 1;
		while (i < 5){
		System.out.println(i);
		i=i+1;
		}
		
		//....................................................................................
		// Do While Loop
		String[] city = new String[5];
		city[0] = "Vasteras";
		city[1] = "Malmo";
		city[2] = "Stockholm";
		city[3] = "Oribro";
		city[4] = "Upssala";
		int c = 0;
		do {
			System.out.println(city[c]);
			c = c + 1;
		} while(c < 5);
	}
 
}







