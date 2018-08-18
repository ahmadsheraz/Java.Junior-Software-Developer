package basics;
import java.util.Scanner;


/* This programe will take FirstName, lastName and Social Security Number and
   will generate Ficial code which will be a combo of of the first, last and SSN
*/

public class Strings {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the word to search");
		//String wordchoice = scan.toString();
		String bookTitle;
		String wordchoice = "Ring";
		bookTitle = "The Lord of the Rings";
		if(bookTitle.contains(wordchoice)) {
			System.out.println("The book contains the word " + wordchoice);
		}
		else {
			System.out.println("The word you are looking for does not found");
		}
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter First Name = ");
		String firstName = scan.nextLine();
		
		
		//Scanner scan = new Scanner (System.in);
		System.out.println("Enter Last Name = ");
		String lastName = scan.nextLine();
		
		//System.out.println("Enter 9 Digits SSN = ");
		//int SSN = scan.nextInt();
		//System.out.println("SSN is = " + SSN);
		
		System.out.println("First Name is = " + firstName );
		System.out.println("Last Name is = " + lastName);
		//System.out.println("SSN is = " + SSN);
		//String firstName = "Sheraz";
		//String lastName = "Ahmad";
		String SSN = "174930295";
		
		System.out.println("Computer Generated Fiscial Code is = ");
		// Print initials plus the last 4 digits of SSN
		System.out.print(firstName.substring(0,3));
		System.out.print(SSN.substring(5));
		System.out.print(lastName.substring(0,2));
		
 
	}

}





