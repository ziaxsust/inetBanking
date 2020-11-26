package javaBasics2;

public class DataTypes1 {

	public static void main(String[] args) { // main method is the starting or execution point of the program
		
		//primitive data type: int, char, double and boolean
		// integer
		int i = 20;
		System.out.println(i);
		i = 30; // this value of i will replace the previous value of i, so the latest value of i is 30.
		System.out.println(i);
		int j =5;
		int k = 0;
		int l = -3;
		System.out.println(k);
		System.out.println(j+l);
		System.out.println(l);
		// double
		double d1 = 12.33;
		double d2 = 12;
		System.out.println(d2);
		System.out.println(d1);
		//character--only single digit value and should be written within single quote
		char c1 = 'a';
		char c2 = '$';
		char c3 = '2';
		System.out.println(c3);
		System.out.println(c1);
		System.out.println(c2);
		//boolean
		boolean b1 = true; // these two are values but also these two are keyword in java.
		boolean b2 = false;
		System.out.println(b1);
		
		// Non-primitive data type -- String 
		String s1 = "100";
		String s2 = "12.33";
		String s3 = "Ziaul Karim";
		String s4 = " Java Programmer";
		String s5 = "Selenium is easy to learn";
		String s6 = "Ziaul Karim";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1+s2);
		System.out.println(s2+s1);
		System.out.println(10+s1);
		System.out.println(s3.length());
		System.out.println(s3.length()-1);
		System.out.println(s3.concat(s4));
		System.out.println(s4.toLowerCase());
		System.out.println(s5.toUpperCase());
		System.out.println(s3.endsWith("m"));
		System.out.println(s4.startsWith("j"));
		System.out.println(s5.contains("elenium"));
		System.out.println(s3.equals(s6));
		System.out.println(s3.equals("s6"));
		System.out.println(s3==s6);
		System.out.println(s6.indexOf("l"));
		System.out.println(s6.indexOf("S"));
		System.out.println(s6.indexOf("m"));
		System.out.println(s4);
		System.out.println(s4.trim());
			
		
	}
}
