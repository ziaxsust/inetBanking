package javaBasics2;

public class IncrementalDecremental2 {

	public static void main(String[] args) {
		
		//post increment
		int i = 1;
		int j = i++;
		System.out.println("value of i is "+i);
		System.out.println("value of j is "+j);
		//pre-increment
		int m =1;
		int n = ++m;
		System.out.println("value of m is "+m);
		System.out.println("value of n is "+n);
		//post decrement
		int x = 1;
		int y = x--;
		System.out.println("value of x is "+x);
		System.out.println("value of y is "+y);
		//pre decrement
		int p = 1;
		int q = --p; // decrease the value of p by 1
		System.out.println("value of p is "+p);
		System.out.println("value of q is "+q);
	}
	
}
