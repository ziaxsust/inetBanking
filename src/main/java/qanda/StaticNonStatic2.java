package qanda;

public class StaticNonStatic2 {

	public static void main(String[] args) {
		
		StaticNonStatic2 obj = new StaticNonStatic2();
		StaticNonStatic1 obj2 = new StaticNonStatic1();
		obj.hello();
		obj2.static1();
		StaticNonStatic1.nonstatic();
	}
	
	void hello() {
		System.out.println("hello non static");
	}
	
	static void hello2() {
		System.out.println("hello static");
	}
	
}
