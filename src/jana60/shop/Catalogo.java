package jana60.shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// creo l'arrey vuoto di Prodotto
		Prodotto[] catalogo = new Prodotto[5];

		// valorizzo l'array di Prodotto
		for (int i = 0; i < catalogo.length; i++) {
			// chiedo all'utente i dettagli del prodotto
			System.out.print("Inserisci marca: ");
			String marca = scan.nextLine();
			System.out.print("Inserisci nome: ");
			String nome = scan.nextLine();
			System.out.print("Inserisci prezzo: ");
			double prezzo = Double.parseDouble(scan.nextLine());
			System.out.print("Inserisci iva: ");
			int iva = Integer.parseInt(scan.nextLine());

			// con quei dettagli creo un Prodotto e lo assegno alla posizione corrente
			catalogo[i] = new Prodotto(marca, nome, prezzo, iva);
		}

		System.out.println("Il nostro catalogo");

		String format = "%15s %15s %15s";
		String intestazione = String.format(format, "Marca", "Nome", "Prezzo");
		System.out.println(intestazione);

		for (int i = 0; i < catalogo.length; i++) {
			// System.out.println(catalogo[i].infoProdotto());

//			String infoProdotto = String.format("%15s %15s %15s", catalogo[i].marca, catalogo[i].nome,
//					catalogo[i].formattaPrezzo());
			String infoProdotto = catalogo[i].infoProdottoFormat(format);
			System.out.println(infoProdotto);
		}

		scan.close();
	}

}
