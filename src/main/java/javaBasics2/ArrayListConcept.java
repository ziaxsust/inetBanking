package javaBasics2;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// non-generic
		ArrayList a = new ArrayList();
		a.add(32);
		a.add("Zia");
		a.add(22.33);
		a.add('M');
		a.add("2/2/2019");
		a.add("Dallas");
		System.out.println("Size of Array: " + a.size());
		System.out.println("value of 1 index: " + a.get(1));
		System.out.println(a.get(3));
		System.out.println(a.get(4));
		System.out.println(a.get(5));
		a.remove(0);
		System.out.println("Size of Array: " + a.size());
		System.out.println("value of 1 index: " + a.get(1));
		for (int j = 0; j < 5; j++) {
			System.out.print(a.get(j) + ", ");
		}
		// generic
		System.out.println();
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Karim");
		a2.add("Male");
		a2.add("London");
		System.out.println("Size of generic Array: " + a2.size());
		System.out.println("value of 1 index: " + a2.get(1));
		System.out.println(a2.get(1));
		for (int i = 0; i < 3; i++) {
			System.out.print(a2.get(i) + ", ");
		}

	}

}
