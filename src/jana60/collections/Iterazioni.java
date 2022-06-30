package jana60.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterazioni {

	public static void main(String[] args) {
		// creo una lista vuota di stringhe
//		ArrayList<String> listaDiStringhe = new ArrayList<String>();
		List<String> listaDiStringhe = new ArrayList<String>();
		System.out.println(listaDiStringhe);

		// aggiungo degli elementi
		listaDiStringhe.add("uno");
		listaDiStringhe.add("due");
		listaDiStringhe.add("tre");
		listaDiStringhe.add("quattro");
		listaDiStringhe.add("cinque");
		System.out.println(listaDiStringhe);

		Iterator<String> iter = listaDiStringhe.iterator();
		while (iter.hasNext()) {
			String current = iter.next();
			System.out.println(current);
		}

		for (String el : listaDiStringhe) {
			System.out.println(el);
		}

		// array
		int[] arrayInt = { 3, 5, 8, 1, 0 };
		// ciclo for normale
		int somma = 0;
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.println(arrayInt[i]);
			somma += arrayInt[i];
		}
		System.out.println("Somma: " + somma);

		// ciclo for each
		somma = 0;
		for (int current : arrayInt) {
			System.out.println(current);
			somma += current;
		}
		System.out.println("Somma: " + somma);

		// stampo elementi in posizione dispari
		for (int i = 1; i < arrayInt.length; i = i + 2) {
			System.out.println(arrayInt[i]);
		}

	}

}
