package javaBasics2;

public class PractisePurposeTest {//extends PractisePurpose2{//extends PracticePurpose1{

	public static void main(String[] args) {
		
		//PracticePurpose1 obj = new PracticePurpose1();
		//obj.hello();
		//System.out.println(obj.i);
		System.out.println(PracticePurpose1.i);
		PracticePurpose1.hello();
		
		
		PractisePurpose2 obj1 = new PractisePurpose2();
		obj1.test();
		PractisePurpose2.test();
		obj1.test1();
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		System.out.println(PractisePurpose2.x);
		
		
	}
	
}
