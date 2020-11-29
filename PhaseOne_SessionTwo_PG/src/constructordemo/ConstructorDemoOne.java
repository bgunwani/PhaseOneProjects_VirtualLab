package constructordemo;

class Employee {

	String name;
	int age;

	// Default Constructor
	public Employee() {
		this.name = "Unknown";
		this.age = 18;
	}

	// Parameterized Constructor
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void displayDetails() {
		System.out.println(this.name + " : " + this.age);
	}
}

public class ConstructorDemoOne {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.displayDetails();

		Employee emp2 = new Employee("King", 34);
		emp2.displayDetails();
		
		
	}

}
