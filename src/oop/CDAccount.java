package oop;

public class CDAccount extends BankAccount implements IRate{
	String interestRate;
	
	void compountd() {
		System.out.println("Compounding Interest : ");
	}

}
