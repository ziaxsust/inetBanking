package javaBasics2;

public class ArrayConcept {

	public static void main(String[] args) {

		// array--array is a variable where we store similar data type multiple values.
		// advantage--we can store multiple values in a variable.
		// disadvantage-1.store only similar data type values, 2. size is fixed
		// int array
		int i[] = new int[4];
		i[0] = 3;
		i[1] = 4;
		i[2] = -2;
		i[3] = 5;
		System.out.println(i[3]);
		System.out.println(i[2]);
		System.out.println("size of Array: " + i.length);
		for (int j = 0; j <= 3; j++) {
			System.out.print(i[j] + ", ");
		}
		// double array
		System.out.println();
		double d[] = new double[3];
		d[0] = 23.22;
		d[1] = 21;
		d[2] = -3.32;
		System.out.println(d[2]);
		System.out.println("size of Array: " + d.length);
		for (int k = 0; k < 3; k++) {
			System.out.print(d[k] + ", ");
		}
		// char array
		char c[] = new char[3];
		c[0] = '$';
		c[1] = '2';
		c[2] = 'D';
		System.out.println();
		System.out.println(c[0]);
		System.out.println("size of Array: " + c.length);
		for (int p = 0; p < 3; p++) {
			System.out.print(c[p] + ", ");
		}
		// similarly do it for boolean and String
		String[] names = { "Zia", "Karim", "Mamun" };
		System.out.println();
		System.out.println(names[1]);
		for (String eachnames : names) {
			System.out.print(eachnames + ", ");
		}
		System.out.println();
		System.out.println("------------------");
		for (int m = 0; m < names.length; m++) {
			System.out.print(names[m] + ", ");
		}
		// object array--is used to store different data types values.
		Object ob[] = new Object[5];
		ob[0] = "Ziaul";
		ob[1] = 'M';
		ob[2] = 33;
		ob[3] = 5.10;
		ob[4] = "11/23/1923";
		System.out.println();
		System.out.println(ob[0]);
		System.out.println("size of the Object Array: " + ob.length);
		for (int q = 0; q < 5; q++) {
			System.out.print(ob[q] + ", ");
		}

	}

}
