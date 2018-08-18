package oop;

public class LoanAccount implements IRate{

	@Override
	public void setRate() {
		System.out.println("Rate");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("Increase Rate");
		
	}
	
	public void setTerm(int term) {
		System.out.println("Setting the Terms to : " + term + " Years.");
	}
	
	public void setAmmortSchedule() {
		System.out.println("Ammorition Schedule : ");
	}



}
