package jana60.bank;

import java.util.Random;
import java.util.Scanner;

public class Banca {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Benvenuto/a a Java Bank");
		System.out.print("Inserisci il tuo nome: ");
		String nome = scan.nextLine();
		int numeroConto = random.nextInt(1000) + 1;

		Conto conto = new Conto(numeroConto, nome);

		System.out.print("Grazie abbiamo creato il conto numero " + conto.getNumeroConto());
		System.out.println(" intestato a " + conto.getProprietario());

		boolean finito = false;

		while (!finito) {
			// menu a scelta multipla
			System.out.println("Cosa vuoi fare?");
			System.out.println("1 per prelevare - 2 per versare - 3 per uscire");
			String scelta = scan.nextLine();
			// in base alla scelta utente
			switch (scelta) {
			case "1":
				// prelevare
				System.out.println("Quanto vuoi prelevare?");
				double sommaDaPrelevare = Double.parseDouble(scan.nextLine());
				boolean risultatoPrelievo = conto.prelievo(sommaDaPrelevare);
				if (risultatoPrelievo) {
					System.out.println("Prelievo avvenuto con successo");
				} else {
					System.out.println("Impossibile prelevare. Il saldo non è sufficente");
				}
				System.out.println("Il tuo saldo corrente è " + conto.getSaldoFormattato());
				break;
			case "2":
				// versare
				System.out.println("Quanto vuoi versare?");
				double sommaDaVersare = Double.parseDouble(scan.nextLine());
				conto.deposito(sommaDaVersare);
				System.out.println("Dopo il versamento il tuo saldo è " + conto.getSaldoFormattato());
				break;
			case "3":
				// uscire
				System.out.println("Grazie per aver usato Java Bank");
				finito = true;
				break;
			default:
				// gestire input sbagliato
				System.out.println("Scelta non valida.");
				break;
			}
		}

		scan.close();
	}

}
