package jana60.biglietteria;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Benvenuto in Trenitalia!");
		boolean finito = false;

		while (!finito) {
			System.out.print("Inserire l'età del passeggero: ");
			int inputEta = Integer.parseInt(scan.nextLine());
			System.out.print("Inserire il numero di km da percorrere: ");
			int inputKm = Integer.parseInt(scan.nextLine());
			Biglietto biglietto = new Biglietto(inputKm, inputEta);
			System.out.println("Il prezzo del biglietto è " + biglietto.prezzoFormattato());

			System.out.println("Cosa vuoi fare ora?");

			boolean sceltaValida = true;
			do {
				System.out.println("1 per comprare un nuovo biglietto - 2 per terminare");
				String sceltaUtente = scan.nextLine();
//				if (sceltaUtente.equals("1")) {
//					// ricomincio il ciclo while
//					sceltaValida = true;
//				} else if (sceltaUtente.equals("2")) {
//					// terminare ciclo while
//					sceltaValida = true;
//					finito = true;
//				} else {
//					// input non gestito
//					System.out.println("Scelta non valida. Riprova");
//					sceltaValida = false;
//				}
				switch (sceltaUtente) {
				case "1":
					// ricomincio ciclo whilw
					sceltaValida = true;
					break;
				case "2":
					// terminare ciclo while
					sceltaValida = true;
					finito = true;
					break;
				default:
					// input non gestito
					System.out.println("Scelta non valida. Riprova");
					sceltaValida = false;
					break;
				}
			} while (!sceltaValida);
		}
		System.out.println("Grazie di aver usato il programma");
		scan.close();
	}

}
