package jana60.valutazioni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Quanti studenti nella classe?");
		int numStudenti = Integer.parseInt(scan.nextLine());

		// creo array vuoto di studente
		Studente[] studenti = new Studente[numStudenti];

		// per ogni posizione dell'array chiedo all'utente i dati
		for (int i = 0; i < studenti.length; i++) {
			int idStudente = i + 1;
			System.out.println("Dati dello studente " + idStudente);
			System.out.print("Percentuale assenze: ");
			int percentualeAssenze = Integer.parseInt(scan.nextLine());
			System.out.print("Media voti:");
			double mediaVoti = Double.parseDouble(scan.nextLine());

			studenti[i] = new Studente(idStudente, percentualeAssenze, mediaVoti);
		}

		// contatore promossi
		int counter = 0;
		// stampo per ogni studente se è promosso o bocciato
		for (int i = 0; i < studenti.length; i++) {
			System.out.print("Lo studente " + studenti[i].idStudente);
			if (studenti[i].isPromosso()) {
				counter++;
				System.out.println(" è promosso");
			} else {
				System.out.println(" è bocciato");
			}
		}

		System.out.println("Numero di promossi totali: " + counter);

		scan.close();
	}

}
