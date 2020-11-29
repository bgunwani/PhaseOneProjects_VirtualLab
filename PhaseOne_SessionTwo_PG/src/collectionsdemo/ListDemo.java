package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("King");
		list.add("Kochhar");
		list.add("John");
		list.add("Smith");

		System.out.println("----------------------");

		for (String name : list) {
			System.out.println(name);
		}

		list.add("Bhawna");
		list.add(1, "Gunwani");
		list.remove("King");
		list.remove(1);

		System.out.println("----------------------");

		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println("Size of ArrayList : " + list.size());

		if (list.contains("Gunwani")) {
			System.out.println("Your Name exists..!!");
		}

		list.clear();

		System.out.println("----------------------");
		
		for (String name : list) {
			System.out.println(name);
		}

	}

}
