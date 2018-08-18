package oop;

class person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	
	
	void eat(){
		System.out.println(email);
	}
	
	
	void sleep(){
		System.out.println(name + " is sleeping");
	}
	
}



public class Demo {

	public static void main(String[] args) {
		
		// Instantiating an object
		person person1 = new person(); //we create a variable person1 and point it to the class person & (new) keyword is used to allocating the space to this new variable. 
		
		// And then define sone properties 
		person1.name = "Ahmad";
		person1.email = "Ahmad@test.com";
		person1.phone = "12904820830";
		  
		
		// Abstraction (we only abstract the elements that are necessary for us this time)
		person1.walk();
		person1.eat();
		person1.sleep();
		
		
		person person2 = new person();
		person2.name = "Sarah";
		person2.sleep();
		
		
		
		
		/*
		// Person
		
		// Attributes, Variables, Adjectives, Descriptors.
		String name = "khan";
		String email = "khan@testmail.com";
		String phone = "385493728";
		
		// Actions, Activities, Behaviours.
		//System.out.println(name + " is walking"); //Let do the same work by calling the walking function and pass the name perameter to it.
		walking(name);
		System.out.println(name + " is eating");
		
		
		// But what if we want to do it for another person? we will copy the above section of code 
		String name2 = "ali";
		String email2 = "ali@testmail.com";
		String phone2 = "0001290028";
		
		// Actions, Activities, Behaviours.
		//System.out.println(name2 + " is walking");  ////System.out.println(name + " is walking"); //Let do the same work by calling the walking function and pass the name perameter to it.
		walking(name2);
		System.out.println(name2 + " is eating");
		

		
		// what about binding attributes and properties together 
	}
	
	// Let Enhance the above code by adding functions to minimize the code
	static void walking(String name) {
		System.out.println(name + " is walking");
		*/
		
		
	}

}




