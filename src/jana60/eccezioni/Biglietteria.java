package jana60.eccezioni;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("Inserisci numero di km: ");
			int numeroKm = Integer.parseInt(scan.nextLine());

			System.out.print("Inserisci età passeggero: ");
			int etaPasseggero = Integer.parseInt(scan.nextLine());

			Biglietto nuovoBiglietto = new Biglietto(numeroKm, etaPasseggero);
			System.out.println("Grazie, biglietto creato correttamente");

		} catch (NumberFormatException nfe) {
			System.out.println("L'input non è un numero valido");
			System.out.println(nfe.getMessage());
		} catch (Exception e) {
			System.out.println("Impossibile creare il biglietto");
			System.out.println(e.getMessage());
		} finally {
			// codice che deve essere eseguito sempre
			System.out.println("Arrivederci");
		}

		scan.close();
	}

}
