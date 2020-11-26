package qanda;

public class QandA {
		//can we make main method final? -----answer is yes we can.
	public final static void main(String[] args) {
		
		int i = 3;
		System.out.println(i);
		//can we call main method inside a main method--answer is yes but parameter list must be different.
		//QandA ob = new QandA();
		//ob.main();
		//main(); // direct calling
		QandA.main();
	}
		static void main(){
		String name = "Ziaul Karim";
		System.out.println(name);
	}
	
}
