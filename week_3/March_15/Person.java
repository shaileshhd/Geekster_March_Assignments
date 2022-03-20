package week3.March_15;

// Modify the code below to add more constructors. Also modify the main method to test the new constructors.

public class Person {
	// fields
	private String name;
	private String email;
	private String phoneNumber;

	// constructor
	public Person(String theName) {
		this.name = theName;
	}

	Person(String firstName, String lastName, String email, String phoneNumber) { // <-- New CONSTRUCTOR
		this.name = firstName + " " + lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	// methods - getters
	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	// methods - setters
	public void setName(String theName) {
		this.name = theName;
	}

	public void setEmail(String theEmail) {
		this.email = theEmail;
	}

	public void setPhoneNumber(String thePhoneNumber) {
		this.phoneNumber = thePhoneNumber;
	}

	public String toString() {
		return this.name + " " + this.email + " " + this.phoneNumber;
	}

	// main method for testing
	public static void main(String[] args) {
		Person p1 = new Person("Sana");
		System.out.println(p1);

		Person p2 = new Person("Jean");
		p2.setEmail("jean@gmail.com");
		p2.setPhoneNumber("404 899-9955");
		System.out.println(p2);

		Person p3 = new Person("Shailesh", "H D", "shaileshhd.com@gmail.com", "998037529"); // <-- MODIFIED to test the
																							// new constructor
		System.out.println(p3);
	}
}
