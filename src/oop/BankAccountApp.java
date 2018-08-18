package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// This App will be able to Create a new Bank Account.>> Think instantiate an object
		BankAccount acc1 = new BankAccount();
		
		// acc1.name = "Ali Khan";
		// With Encapsulation : Public API method
		acc1.setName("Ali khan");
		System.out.println(acc1.getName());
		acc1.setSsn("3423463245");
		System.out.println("SSN : " + acc1.getSsn());
		
		acc1.accountnumber = "0183598219 , ";
		//acc1.name = "Ali Khan";
		acc1.blance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		
		/*acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);*/
		
		// Polymorphism through Overriding 
		System.out.println(acc1.toString());
		
		// Polymorphism through Overloading 
		BankAccount acc2 = new BankAccount("checking Account");
		acc2.accountnumber = "0948571720";
		
		BankAccount acc3 = new BankAccount("Savings Account" , 5000 );
		acc3.accountnumber = "0183598219";
	
		/*
		acc3.checkBalance();
		
		/*
		System.out.println("Routing Number for Account 1 = "+ acc1.routingnumber);
		System.out.println("Routing Number for Account 2 = " + acc2.routingnumber);
		System.out.println("Routing Number for Account 3 = " + acc3.routingnumber);
		*/

		/*
		// Demo for Inheritance 
		CDAccount cd1 = new CDAccount();
		cd1.blance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "jan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compountd();
		*/
	}

}




