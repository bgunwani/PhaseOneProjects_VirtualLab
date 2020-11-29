package methoddemo;

class Calculation {
	
	int addition(int num1, int num2) {
		return num1 + num2;
	}
	
	int addition(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	float addition(float num1, float num2) {
		return num1 + num2;
	}
	
	int factorial(int n) {
		if( n != 0) 
			return n * factorial(n-1);
		else 
			return 1;
	}
	
}

public class MethodDemoOne {

	public static void main(String[] args) {

		Calculation calc = new Calculation();
		
		System.out.println("Addition : " + calc.addition(1000, 2000));
		System.out.println("Addition : " + calc.addition(100, 200, 300));
		System.out.println("Addition : " + calc.addition(10.5F, 20.3F));
		
		System.out.println("Factorial : " + calc.factorial(5));
	}

}
