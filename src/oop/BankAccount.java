package oop;

public class BankAccount implements IRate {
	// Define variables.
	String accountnumber;
	private static final String routingnumber = "012345"; // Static belongs to the class not to the single object so it is constant for all object.
	                                             // Final : is constant often static final.
	// Instance variables 
	//String name;   
	private String name;        //with the Encapsulation 
	private String ssn;
	String accountType;
	double blance = 0;
	
	// Constructor Definition: Are unique methods OR functions having the following charasterastics 
	   // 1: They are used to define / setup / initialise properties of an object. 
	   // 2: Constructors are IMPLICATLY called upon instantiation.
	   // 3: The same name as the class itself. (our class is called BankAccount, then constructor will also called BankAccount e.g. see below)
	   // 4: Constructors have no return type.
	
	
	// our constructor OR method is BankAccount, and Method have perantises() and body{} as below
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	
	// Overloading: When we call same method with different arguments.
	BankAccount(String accountType){
		System.out.println("New Account : " + accountType);
		
	}
	 
	
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType, Msg are all Local variables, which are define in blocks
		System.out.println("New Account : " + accountType);
		System.out.println("INITIAL DEPOSITE OF : $ " + initDeposit);
	    String Msg = null;
		if(initDeposit < 1000) {
			Msg =  "ERROR : Initial Deposite must be grater than $1000";
		}
		else {
			Msg = "Thanks for your initial Deposit of = $" + initDeposit;
		}
		System.out.println(Msg);
		blance = initDeposit;
	}
	
	// Getters / setters
	
	// Allow the user to define the Name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return "Mr." + name;
	}
	
	
	public String getSsn() {
		return ssn;
	}


	// Interface Methods
	public void setRate() {
		System.out.println("Setting RATE:");
	}
	public void increaseRate() {
		System.out.println("Increasing RATE:");
	}
	
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	// Define Methods: are the terms we use in OOP as functions.
	public void deposit(double amount) {
		blance = blance + amount;
		showActivity ("DEPOSIT");
	}

	
	
	void withdraw(double amount) {
		blance = blance + amount;
		showActivity ("WITHDRAW");
	}
	
	// Private : can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT ACTIVITY : " + activity);
		System.out.println("YOUR NEW BLANCE = $ " + blance);
	}
	
	
	
	void checkBalance() {
		System.out.println("Blance is = " + blance);
	}
	
	
	
	void getstatus() {
		
	}
	
	@Override
	public String toString() {
		return "[NAME :" + name + ". ACCOUNT : " + accountnumber + ". ROUTING =" + routingnumber + ". BALANCE : $" + blance + "]";  
	}
	
	
	
}



