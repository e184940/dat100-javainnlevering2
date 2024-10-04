package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {

		// matrise for å kjøre de fleste metodene
		int[][] matrise = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 5a)
		System.out.println("5a)");
		skrivUt(matrise);
		System.out.println();

		// 5b)
		System.out.println("5b) \n" + tilStreng(matrise));

		// 5c)
		int[][] skalertMatrise = skaler(2, matrise);
		System.out.println("5c)");
		skrivUt(skalertMatrise);
		System.out.println();

		// 5d)
		int[][] matrise2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("5d) Its " + erLik(matrise, matrise2) + "! Matrisene er like");

		// 6a)
		System.out.println();
		int[][] speiletMatrise = speile(matrise);

		System.out.println("6a)");
		skrivUt(speiletMatrise);
		System.out.println();

		// 6b)
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] b = { { 7, 8 }, { 9, 10 }, { 11, 12 } };

		int[][] resultat = multipliser(a, b);

		System.out.println("6b) ");
		skrivUt(resultat);

	}

	// 5a)
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

	// 5c)
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

	// 5d)
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

	// 6a)
	public static int[][] speile(int[][] matrise) {

		int n = matrise.length;

		int[][] nyMatrise = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				nyMatrise[i][j] = matrise[i][j];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int tmp = nyMatrise[i][j];
				nyMatrise[i][j] = nyMatrise[j][i];
				nyMatrise[j][i] = tmp;
			}
		}
		return nyMatrise;
	}

	// 6b)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int m = a.length;
		int n = a[0].length;
		int p = b[0].length;

		// lager en ny matrise med dimensjonene m * p
		// der m er antall rader i a, og p er antall kolonner i b
		int[][] nyMatrise = new int[m][p];

		// den ytre løkken går gjennom hver rad i a
		for (int i = 0; i < m; i++) {
			// den midtre løkken går gjennom hver kolonne i
			for (int j = 0; j < p; j++) {
				// den innerste løkken går gjennom hver kolonne i a (eller rad i b) og beregner
				// summen av produktene som utgjør c[i][j]
				for (int k = 0; k < n; k++) {
					nyMatrise[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return nyMatrise;
	}

}
