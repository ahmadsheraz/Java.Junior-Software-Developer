package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("234672387", 1000.50);
		BankAccount acc2 = new BankAccount("002948193", 2000);
		BankAccount acc3 = new BankAccount("981208472", 2500);
		
		
		acc1.setName("Khan");
		System.out.println(acc1.getname());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}



class BankAccount implements IInterest {
	
	// Properties of Bank Account
	/* So we will use Encapsulation here therefore we will use (Private) to make it private.
	   Encapsulation will ensure that client does not have access to these variable except 
	   through the methods we provide them. */
	
	private static int ID = 1000;   // Internal ID used by Bank to identify user, and for user AccountNumber 
	private String accountNumber; // ID + Random 2-digits number + First 2 of SSN
	private static final String routingNumber = "110022345";
	private String name;
	private String SSN; 
	private double balance;
	
	

	// Constructors: will have the same name as the class so,
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random =  (int) (Math.random() * 100);
		accountNumber = ID +""+ random + SSN.substring(0, 2); 
		System.out.println("Your Account Number is : "+accountNumber);
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	
	
	public void payBill(double amount) {
		System.out.println("Paying Bill: " + amount);
		balance = balance - amount;
		showBalance();
	}
	
	
	public void makeDeposit(double amount) {
		System.out.println("Making Deposit : " + amount);
		balance = balance + amount;
		showBalance();
	}
	
	
	public void showBalance() {
		System.out.println("Balance : " + balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance(); 
	}
	
	@Override 
	public String toString() {
		return "[Name : " + name + "]\n" + "[Account Number : " + accountNumber + "]\n" + "[Routing Number : " + routingNumber + "]\n" + "[Balance : " + balance + "]\n";   
	}
	
}






