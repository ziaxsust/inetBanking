package javaBasics2;

public class LoopConcept4 {

	public static void main(String[] args) {
		
		//while loop
		//disadvantage--it will generate infinite loop if we don't give incremental or decremental part.
		int i = 1;//initialization part
		while(i<5) {//conditional part
			System.out.print(i+" ");
			i++;//incremental or decremantal part
		}
		//for loop
		System.out.println();
		for(int j=1;j<5;j++) {
			System.out.print(j+" ");
		}
		// problem-1
		System.out.println();
		System.out.println("**************");
		int a = 1;
		for (int b=1; b<=4; b++) {
			for (int c=1; c<=5-b; c++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
		//problem-2
		System.out.println("**************");
		int p=1;
		for (int q=1; q<5; q++) {
			for (int r=1; r<=q; r++) {
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
		}
	}
	
}
