package jana60.registrazione;

import java.util.Scanner;

public class Registrazione {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Benvenuto alla registrazione utente");

		try {
			// chiedo dati all'utente
			System.out.print("Inserisci nome: ");
			String nomeUtente = scan.nextLine();

			System.out.print("Inserisci cognome: ");
			String cognomeUtente = scan.nextLine();

			System.out.print("Inserisci email: ");
			String emailUtente = scan.nextLine();

			System.out.print("Inserisci password: ");
			String passwordUtente = scan.nextLine();

			System.out.print("Inserisci età: ");
			int etaUtente = Integer.parseInt(scan.nextLine());

			// provo a costruire un oggetto Utente
			Utente nuovoUtente = new Utente(nomeUtente, cognomeUtente, emailUtente, passwordUtente, etaUtente);

			System.out.println("Grazie di esserti registrato " + nuovoUtente.getNome());

		} catch (NumberFormatException e) {
			System.out.println("Numero non valido");
		} catch (IllegalArgumentException e) {
			System.out.println("Parametro non valido: " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Parametro nullo: " + e.getMessage());
		} catch (Exception genericExc) {
			System.out.println("Errore imprevisto " + genericExc.getMessage());
		}

		scan.close();
	}

}
