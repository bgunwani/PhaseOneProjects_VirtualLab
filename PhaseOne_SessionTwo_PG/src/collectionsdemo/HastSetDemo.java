package collectionsdemo;

import java.util.HashSet;

public class HastSetDemo {

	public static void main(String[] args) {
		
		
		HashSet<String> set  = new HashSet<String>();
		set.add("Core Java");
		set.add("Advance Java");
		
		set.add("Core Java");
		set.add(null);
		set.add(null);
		
		System.out.println(set);
	}
}
