package qanda;

public class QAofAbstract extends OneAbstractClass {

	public static void main(String[] args) {

		// OneAbstractClass.methodA();
		// can an abstract class be private?----no
		// can we have constructor in abstract class? ----yes but not in an interface
		// can an abstract method be private?----no but it can protected, public and default.
		//
		QAofAbstract obj = new QAofAbstract();
		obj.methodA();
		obj.methodB();
	}

	@Override
	void methodB() {
		System.out.println("I am an abstract method");
	}

}
