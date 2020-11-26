package javaBasics2;

public class IfElseConcept3 {

	public static void main(String[] args) {
		
		int a = 22;
		int b = 14;
		if(a<b) {
			System.out.println("a is smaller than b");
		}
		else {
			System.out.println("b is smaller than a");
		}
		//comparison operator are: <, >, <=, >=, ==, !=
		
		int c = 10;
		int d = 10;
		if(c==d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		// write a logic to find out the largest value among three variables.
		
		int i = 6;
		int j = 4;
		int k = 8;
		if(i>j & i>k) {
			System.out.println("i is the largest number");
		}
		else if(j>k){
			System.out.println("j is the largest number");
		}
		else {
			System.out.println("k is the largest number");
		}
		
	}
	
}
