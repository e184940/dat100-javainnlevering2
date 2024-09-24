package no.hvl.dat100.tabeller;

import java.util.*;

public class Tabeller {

	public static void main(String[] args) {

		int[] tabell = { 1, 3, 4, 7, 9, 10 };

		skrivUt(tabell);
		System.out.println('"' + tilStreng(tabell) + '"');
		int resultat = summer(tabell);
		System.out.println("Summen av tallene i tabellen er: " + resultat);

	}

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]);
			if (i < tabell.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
		System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String streng = "[";
		for (int i = 0; i < tabell.length; i++) {

			streng += tabell[i];
			if (i < tabell.length - 1) {
				streng += ",";
			}
		}
		streng += "]";
		return streng;

	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;

		for (int tall : tabell) {
			sum += tall;
		}

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
