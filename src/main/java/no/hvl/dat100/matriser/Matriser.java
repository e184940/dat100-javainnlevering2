package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {

		// matrise for å kjøre de fleste metodene
		int[][] matrise = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// a)
		System.out.println("a)");
		skrivUt(matrise);
		System.out.println();

		// b)
		System.out.println("b) \n" + tilStreng(matrise));

		// c)
		int[][] skalertMatrise = skaler(2, matrise);
		System.out.println("c)");
		skrivUt(skalertMatrise);
		System.out.println();

		// d)
		int[][] matrise2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("d) Its " + erLik(matrise, matrise2) + "! Matrisene er like");
		
		// e)
		System.out.println();
		int[][] speiletMatrise = speile(matrise);

        System.out.println("e)");
        skrivUt(speiletMatrise);
	}

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

	public static String tilStreng(int[][] matrise) {
		String streng = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				streng += matrise[i][j] + " ";
			}
			streng += "\n";
		}
		return streng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][];
		for (int i = 0; i < matrise.length; i++) {
			nyMatrise[i] = new int[matrise[i].length];
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
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
			if (a[i].length != b[i].length) {
				return false;
			}
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

		// lager ny matrise
		int nyMatrise[][];
		nyMatrise = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {
			nyMatrise[i] = new int[matrise[i].length];

			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j];
			}

		}
		// speiler matrisen
		for (int i = 0; i < nyMatrise.length; i++) {
			for (int j = 0; j < nyMatrise[i].length / 2; j++) {

				int tmp = nyMatrise[i][j];
				nyMatrise[i][j] = nyMatrise[i][nyMatrise.length - j - 2];
				nyMatrise[i][nyMatrise.length - j - 2] = tmp;
			}
		}

		return nyMatrise;

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

	}
}
