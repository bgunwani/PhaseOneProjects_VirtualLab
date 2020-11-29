package innerclassdemo;

class Outer {
	
	private int data = 100;
	
	class Inner {
		
		void display() {
			System.out.println("Data : " + data);
		}
		
	}
}

public class innerclassdemo {
	
	public static void main(String[] args) {
		
		// Outer.Inner obj = new Outer().new Inner();
		// obj.display();
		
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.display();
		
	}

}

// The name of class file for inner class would be Outer$Inner.

