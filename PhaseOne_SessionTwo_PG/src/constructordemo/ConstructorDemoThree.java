package constructordemo;


class Per {
	

	String name;
	int age;
	
	public Per(String name, int age)  {
		System.out.println("Paramterized Construcor with 2 params Called");
		this.name = name;
		this.age = age;
	}
	
	void displayDetails() {
		System.out.println(this.name + " : " + this.age);
	}
	

}

class Emp extends Per {
	
	float salary;

	public Emp(String name, int age, float salary) {
		super(name, age);
		this.salary = salary;
	}


	void displayDetails() {
		super.displayDetails();
		System.out.println(this.salary);
	}
	
	
}


public class ConstructorDemoThree {
	
	public static void main(String[] args) {
		
		// Constructor Chaining in multiple classes (Inheritance)
	
		Emp obj = new Emp("King", 23, 2000);
		obj.displayDetails();
	
	}

}
