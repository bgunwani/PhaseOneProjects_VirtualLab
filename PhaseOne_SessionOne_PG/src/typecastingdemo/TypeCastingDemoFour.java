package typecastingdemo;

public class TypeCastingDemoFour {

	public static void main(String[] args) {
		
//		Type Promotion:
		
//		1. Java automatically promotes each byte, 
//		short or char operand to int when evaluating an expression.
		
//		2. If one operand is a long, float or double, the whole expression is 
//		protomted to long, float or double respectively.
		
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = 0.1234;
		
		double result = (f*b) + (i/c) - (d*s);
		
		System.out.println("Result : " + result);

	}

}
