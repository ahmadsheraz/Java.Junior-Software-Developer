

package basics;

import java.util.Scanner;
public class Weather {
	
	
/*................................................................................................
	// This Programe will give you suggestions what to weare based on Temperature and sun condation
	public static void main(String[] args) {
		
		// This Programe will give you suggestions what to weare based on Temperature and sun condation 
		int temp = 25;
		String  suncondation= "sunny";
		
		
		if (temp > 20 && temp <= 30 && suncondation == "sunny"){
		System.out.println("Temperature is Normal so weare normal clothes");
	}
		else if(temp < 0 && temp <= 20) {
			System.out.println("Temperature is very coold so weare coold clothes e.g. sweaters and jackets etc ");
		}
		else {
			System.out.println("Temperature is hot so weare lite, e.g shorts and half slaves T-shorts");
		}
}
................................................................................................*/ 
	
	                               
//	                                  2nd Programe
	
//................................................................................................
	
	// This is University admission system based on Evalovation on Grades 	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter Marks = ");
		int Marks = scan.nextInt();
		System.out.println("The Obtined Marks is = " + Marks + " SO");
		
		if(Marks >= 900 && Marks <= 1050){
		System.out.println("Student is suitable for Medical");
		}
		
		else if(Marks >= 800 && Marks < 900){
			System.out.println("Student is suitable for Engineering ");
			}
		
		else if(Marks >= 700 && Marks <800) {
			System.out.println("Student is suitable for Computer Science ");
			}
		
		else if(Marks >= 600 && Marks < 700) {
			System.out.println("Student is suitable for Law ");
		}
		else
			System.out.println("Student is not Eligible for Admission");
//...............................................................................................

	}
}






