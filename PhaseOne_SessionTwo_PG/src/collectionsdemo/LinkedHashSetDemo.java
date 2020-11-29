package collectionsdemo;


import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> set  = new LinkedHashSet<String>();
		set.add("Core Java");
		set.add("Advance Java");
		
		set.add("Core Java");
		set.add(null);
		set.add(null);
		
		System.out.println(set);
	}

}
