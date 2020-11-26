package javaBasics2;

public class TwoDArray {

	public static void main(String[] args) {

		String x[][] = new String[3][4];
		System.out.println("Total number of rows: " + x.length);
		System.out.println("Total number of column: " + x[0].length);

		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";

		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";

		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";

		System.out.println(x[0][2]);
		System.out.println(x[1][1]);
		System.out.println(x[2][3]);
		System.out.println("Two dimentional Array:");
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 4; j++) {

				System.out.print(x[i][j] + ", ");

			}
		}

	}

}
