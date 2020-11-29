package typecastingdemo;

public class TypeCastingDemoOne {

	public static void main(String[] args) {
		
//		Case 1: 
//		int myAge = 34;
//		int HerAge = myAge;	// Type Casting : Not Required
		
//		Case 2:
//		byte myAge = 34;
//		int HerAge = myAge;	// Type Casting :Implicit (Widening)
		
//		Case 3:	
		int myAge = 340;
		byte HerAge = (byte)myAge;	// Type Casting: Explicit (Narrowing)
		
		System.out.println("My Age : " + myAge);
		System.out.println("Her Age : " + HerAge);
	}

}
