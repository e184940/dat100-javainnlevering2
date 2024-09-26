package no.hvl.dat100.tabeller;

import java.util.*;

public class Tabeller {

	// private static final boolean = false;

	public static void main(String[] args) {

		int[] tabell = { 6, 1, 4, 3, 9, -3 };

		skrivUt(tabell);
		System.out.println("b) " + '"' + tilStreng(tabell) + '"');
		int sum = summer(tabell);
		System.out.println("c) Summen av tallene i tabellen er: " + sum);

		int tall = 4;
		boolean finnes = finnesTall(tabell, tall);

		if (finnes) {
			System.out.println("d) it's " + finnes + "! Tallet " + tall + " er i tabellen!");
		} else {
			System.out.println("d) it's " + finnes + "! Tallet " + tall + " er ikke i tabellen!");
		}

		int posisjon = posisjonTall(tabell, tall) + 1;

		if (posisjon != -1) {
			System.out.println("e) Tallet " + tall + " finnes på posisjon: " + posisjon);
		} else {
			System.out.println("e) Tallet " + tall + " finnes ikke i tabellen.");
		}

		reverser(tabell);
	}

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("a) [");
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

		for (int element : tabell) {
			if (element == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int lengde = tabell.length;
		int[] reversertTabell = new int[lengde];

		for (int i = 0; i < lengde; i++) {
			reversertTabell[i] = tabell[lengde - 1 - i];
		}

		System.out.print("f) [");
		for (int i = 0; i < reversertTabell.length; i++) {
			System.out.print(reversertTabell[i]);
			if (i < reversertTabell.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
		System.out.println();

		return reversertTabell;
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
