package constructordemo;

class Person {
	
	String name;
	int age;
	
	public Person() {
		this(34);
		System.out.println("Default Constructor Called");
		this.name = "Unknown";
		this.age = 18;
	}

	public Person(String name, int age) {
		this();
		System.out.println("Paramterized Construcor with 2 params Called");
		this.name = name;
		this.age = age;
	}

	public Person(int age) {
		System.out.println("Paramterized Constructor with One Param Called");
		this.age = age;
	}
	
	void displayDetails() {
		System.out.println(this.name + " : " + this.age);
	}
	
	
}

public class ConstructorDemoTwo {
	
	public static void main(String[] args) {
		
		// Constructor chaining in same class.
		
		Person obj = new Person("King", 23);
		obj.displayDetails();
	}

}
