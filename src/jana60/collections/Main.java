package jana60.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// comparo due stringhe
		System.out.println("Compare ape e ciao");
		System.out.println("ape".compareTo("ciao"));

		// esempi con Collection e List

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

		// rimuovo l'elemento alla posizione 0
		String elementoRimosso = listaDiStringhe.remove(0);
		System.out.println("ho rimosso " + elementoRimosso);
		System.out.println(listaDiStringhe);

		// rimuovo l'elemento "due"
		boolean trovatoERimosso = listaDiStringhe.remove("due");
		// espressione ternaria: valuta la prima espressione ed applica quello che c'è
		// dopo il ? se è vera, altrimenti quello che c'è dopo il :
		System.out.println(trovatoERimosso ? "Trovato e rimosso" : "Non trovato");
//		if(trovatoERimosso) {
//			System.out.println("Trovato e rimosso");
//		} else {
//			System.out.println("Non trovato");
//		}
		System.out.println(listaDiStringhe);
		System.out.println("dimensione lista: " + listaDiStringhe.size());
		System.out.println(listaDiStringhe.isEmpty());

		// la lista contiene "tre"?
		System.out.println(listaDiStringhe.contains("tre"));

		// ordinare la lista
		Collections.sort(listaDiStringhe);
		System.out.println(listaDiStringhe);

		Integer[] arrayDiInteri = { 3, 5, 7, 8 };
		int x = 5;
		Integer x1 = 5;

//		ArrayList<Integer> listaDiInteri = new ArrayList<Integer>();
//		listaDiInteri.add(10);

		List<Integer> listaDiInteri = Arrays.asList(arrayDiInteri);
		System.out.println(listaDiInteri);

	}

}
