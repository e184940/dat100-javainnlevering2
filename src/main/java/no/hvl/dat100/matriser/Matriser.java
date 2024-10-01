package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		System.out.print("{");

		for (int i = 0; i < matrise.length; i++) {
			System.out.print("{");

			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j]);

				if (j < matrise[i].length - 1) {
					System.out.print(", ");
				} else {
					System.out.print("}");
				}

			}
			if (i < matrise.length - 1) {
				System.out.println();
			} else {
				System.out.println("}");
			}

		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String streng = "";

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				streng += matrise[i][j];
				streng += " ";

			}
			streng += "\n";

		}
		return streng;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int nyMatrise[][];
		nyMatrise = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {
			nyMatrise[i] = new int[matrise[i].length];

			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j];
			}

		}

		for (int i = 0; i < nyMatrise.length; i++) {
			for (int j = 0; j < nyMatrise[i].length; j++) {
				nyMatrise[i][j] *= tall;
				System.out.println(matrise[i][j] + " " + nyMatrise[i][j]);
			}

		}

		return nyMatrise;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}

		return true;

	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

	}
}
