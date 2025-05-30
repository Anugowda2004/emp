package collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer>lset=new LinkedHashSet<Integer>();
		lset.add(10);
		lset.add(30);
		lset.add(5);
		lset.add(90);
		System.out.println("linkedHashset"+lset);
		
		TreeSet<String>t=new TreeSet<String>();
		t.add("HTML");
		t.add("java");
		t.add("null");
		t.add("HTML");
		System.out.println("course are"+t);
		


	}

}
