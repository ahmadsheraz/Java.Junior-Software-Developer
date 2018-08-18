package labs;

public class Lab2 {

	public static void main(String[] args) {
		// Create a Student  OR new object
		Student stu1 = new Student("Ali", "552861093");
		Student stu2 = new Student("Ahmad", "0039912203");
		Student stu3 = new Student("Shoaib", "444336655");
		
		
		stu1.enroll("English151");
		stu1.enroll("Math525");
		stu1.enroll("CS414");
		
		stu1.showCourses();
		stu1.checkBalance();
		stu1.payTuition(600);
		stu1.checkBalance();
		System.out.println(stu1.toString());
		
	}

}
 

class Student{
	// Properties
	private static int iD = 1000;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	

	public String courses = "";
	private static final int costofCourse = 800;
	private int balance = 0;
	
	
	// Constructors
	 public Student(String name, String ssn) {
		 iD++;
		 this.name = name;
		 this.ssn = ssn;
		 setUserId();
		 setEmail();
	}
	 
	 public String getPhone() {
			return phone;
		}



		public void setPhone(String phone) {
			this.phone = phone;
		}



		public String getCity() {
			return city;
		}



		public void setCity(String city) {
			this.city = city;
		}



		public String getState() {
			return state;
		}



		public void setState(String state) {
			this.state = state;
		}
	 
	 
	 private void setEmail() {
		 email = name.toLowerCase() + "." + iD + "@student.unicam.it";
		 System.out.println("Your Email is :" + email);
	 }
	 
	 
	 
	 public String getEmail() {
		 return email;
	 }
	 
	 
	 
	 private void setUserId() {
		int  max = 9000;
		int  min = 1000;
		 int randNum = (int) (Math.random()  * (max - min));
		 randNum = randNum + min;
		 userId = iD + "" + randNum + ssn.substring(6);
		 System.out.println("Your User ID : " + userId);
	 }
	 
	 
	 
	 
	 public void enroll(String course) {
		 this.courses = this.courses + " , " + course;
		 System.out.println(courses);
		 balance = balance + costofCourse;
	 }
	
	 
	 
	 
	 public void payTuition(int amount) {
		 System.out.println("Payment : " + amount);
		balance = balance - amount; 
	 }
	 
	 
	 
	 
	 public void checkBalance() {
		 System.out.println("Balance : $" + balance);
	 }
	 
	 
	 
	 
	 public void showCourses() {
		 System.out.println(courses);
	 }
	 
	 
	 
	 
	 public String toString() {
		 return "[Name : " + name + " ]\n[Courses : " + courses + " ]\nBalance : " + balance + " ]";
	 }
	 
	 
	 
}




