package typecastingdemo;

public class TypeCastingDemoThree {

	public static void main(String[] args) {
		
		// Type Conversion from integer to String
		
		// int num = 100;
		// System.out.println("Number(int) : " + num);
		
		// String data = String.valueOf(num);
		// System.out.println("Number(String) : " + data);
		
		// Type Conversion from String to integer

		String data = "100";
		System.out.println("Number(String) : " + data);
		
		int num = Integer.parseInt(data);
		System.out.println("Number(int) : " + num);
		
	}

}
