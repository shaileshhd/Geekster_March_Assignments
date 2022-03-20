package week3.March_15;

class Employee {
	private int id;
	private String name;
	private String department;
	private String workLocation = "Bengaluru";

	// getter methods
	int getID() {
		return id;
	}

	String getName() {
		return name;
	}

	String getDepartment() {
		return department;
	}

	String getWorkLocation() {
		return workLocation;
	}

	// setter methods
	void setID(int id) {
		this.id = id;
	}

	void setName(String name) {
		this.name = name;
	}

	void setDepartment(String department) {
		this.department = department;
	}

	public String toString() {
		return "ID: " + getID() + "\nname: " + getName() + "\ndepartment: " + getDepartment() + "\nwork location: "
				+ getWorkLocation() + "\n";
	}
}

public class EmployeeClassDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setID(123456);
		e1.setName("John Wick");
		e1.setDepartment("IT");
		System.out.println(e1);

		Employee e2 = new Employee();
		e2.setID(654321);
		e2.setName("Jason Bourne");
		e2.setDepartment("IT Support");
		System.out.println("ID: " + e2.getID());
		System.out.println("Name: " + e2.getName());
		System.out.println("Department: " + e2.getDepartment());
		System.out.println("Work Location: " + e2.getWorkLocation());
	}
}
//OUTPUT
/*
	ID: 123456
	name: John Wick
	department: IT
	work location: Bengaluru
	
	ID: 654321
	Name: Jason Bourne
	Department: IT Support
	Work Location: Bengaluru
*/
