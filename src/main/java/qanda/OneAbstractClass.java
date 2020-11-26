package qanda;

public abstract class OneAbstractClass {

	//OneAbstractClass obj = new OneAbstractClass();---not possible
	final static int i = 5;
	void methodA(){
		System.out.println("Hello");
		System.out.println(i);
	}
	public OneAbstractClass() {
		System.out.println("I am a constructor");
	}
	
	abstract void methodB();
	
}
