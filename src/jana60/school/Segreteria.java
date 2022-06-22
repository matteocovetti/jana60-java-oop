package jana60.school;

import java.util.Random;
import java.util.Scanner;

public class Segreteria {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		boolean finito = false;

		while (!finito) {
			System.out.println("Cosa vuoi fare? 1 per inserire un docente, 2 per inserire uno studente, 3 per uscire");
			String scelta = scan.nextLine();

			switch (scelta) {
			case "1":
				// inserire docente
				System.out.print("Inserisci nome:");
				String nomeInput = scan.nextLine();
				System.out.print("Inserisci cognome:");
				String cognomeInput = scan.nextLine();
				System.out.print("Inserisci materia:");
				String materiaInput = scan.nextLine();
				Docente nuovoDocente = new Docente(nomeInput, cognomeInput, materiaInput);
				// salvarli su database
				System.out.println("Hai creato il docente " + nuovoDocente);
				break;
			case "2":
				// inserire studente
				System.out.print("Inserisci nome:");
				String nomeStudente = scan.nextLine();
				System.out.print("Inserisci cognome:");
				String cognomeStudente = scan.nextLine();
				String matricola = "n." + (random.nextInt(1000) + 1);
				Studente nuovoStudente = new Studente(nomeStudente, cognomeStudente, matricola);
				System.out.println("Hai creato lo studente " + nuovoStudente);
				break;
			case "3":
				// uscire
				finito = true;
				break;
			default:
				System.out.println("Scelta non valida");
				break;
			}
		}

		scan.close();
	}

}
