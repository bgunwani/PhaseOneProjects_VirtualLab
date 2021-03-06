package collectionsdemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		// Vector maintains insertion order.
		// Vector allows the duplicate elements
		// Vector is synchronized collection.
		// Empty Vector with default initial capacity of 10.
		// Capacity will be doubled after adding 11th element.
		
		
		Vector<String> vector = new Vector<String>();
		 
	  
	      vector.addElement("c");
	      vector.addElement("c++");
	      vector.addElement("java");
	   
	      System.out.println("Size of Vector is: "+vector.size());
	      
	      System.out.println("Capacity before increment is: "+vector.capacity());
	      
	      vector.addElement("machine learning");
	      vector.addElement("big data");
	      vector.addElement("cloud 1");
	      vector.addElement("cloud 2");
	      vector.addElement("cloud 3");
	      vector.addElement("cloud 4");
	      vector.addElement("cloud 5");
	      vector.addElement("cloud 6");
	 
	   
	      System.out.println("Size after addition: "+vector.size());
	      System.out.println("Capacity after increment is: "+vector.capacity());
	 
	      Enumeration<String> en = vector.elements();
	      
	      System.out.println("\nElements are:");
	      while(en.hasMoreElements())
	         System.out.print(en.nextElement() + " ");
		
	}

}
