package javaBasics2;

public class WrapperConcept5 {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		// data conversion: string to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		// String to double
		String x1 = "12.33";
		System.out.println(x1+10);
		
		double d = Double.parseDouble(x1);
		System.out.println(d+10);
		
		//String to boolean
		String s = "true";
		boolean b = Boolean.parseBoolean(s);
		System.out.println(b);
		
		//int to String
		int a = 10;
		System.out.println(a+20);
		
		String s1 = String.valueOf(a);
		System.out.println(s1+20);
		
		// NumberFormatException -- for input String: 100A;
		//String e = "100A";
		//int e1 = Integer.parseInt(e);
		//System.out.println(e1); // it will generate an exception
		
	}
}
