package qanda;

public class StaticNonStatic1 {
	StaticNonStatic2 ob = new StaticNonStatic2();
	static void nonstatic() {
		
		System.out.println("It's a static method");
	}
	
	void static1() {
		ob.hello();
		StaticNonStatic2.hello2();
		System.out.println("It's a non-static method");
	}
	
	static{
		int x = 5;
		String name = "Kamal";
		System.out.println("It's a static block where name = "+name+" and value of x::"+x);
	}
}
