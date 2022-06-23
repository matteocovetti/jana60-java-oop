package jana60.inheritance.shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Prodotto[] catalogo = new Prodotto[3];

		for (int i = 0; i < catalogo.length; i++) {
			String scelta;
			do {
				System.out.println("Cosa vuoi inserire?");
				System.out.println("1 per smartphone, 2 per televisore, 3 per cuffie");
				scelta = scan.nextLine();
			} while (!scelta.equals("1") && !scelta.equals("2") && !scelta.equals("3"));

			// chiedo gli attributi di tutti i prodotti
			System.out.print("Nome: ");
			String nomeInput = scan.nextLine();
			System.out.print("Marca: ");
			String marcaInput = scan.nextLine();
			System.out.print("Prezzo: ");
			double prezzoInput = Double.parseDouble(scan.nextLine());
			System.out.print("Iva: ");
			double ivaInput = Double.parseDouble(scan.nextLine());

			switch (scelta) {
			case "1":
				// chiedo gli attributi di smartphone
				System.out.print("IMEI: ");
				String imeiInput = scan.nextLine();
				System.out.print("Memoria: ");
				String memoriaInput = scan.nextLine();
				// creo un nuovo oggetto Smartphone
				Smartphone newSmartphone = new Smartphone(i, nomeInput, marcaInput, prezzoInput, ivaInput, imeiInput,
						memoriaInput);
				// aggiungo oggetto Smartphone al catalogo
				catalogo[i] = newSmartphone;
				break;
			case "2":
				// televisore
				System.out.print("Dimensioni: ");
				int dimensioniInput = Integer.parseInt(scan.nextLine());
				System.out.print("Smart? (s/n)");
				String isSmart = scan.nextLine();
				boolean smartInput = false;
				if (isSmart.equals("s")) {
					smartInput = true;
				}

				Televisore newTv = new Televisore(i, nomeInput, marcaInput, prezzoInput, ivaInput, dimensioniInput,
						smartInput);
				catalogo[i] = newTv;
				break;
			case "3":
				// cuffie
				System.out.print("Colore: ");
				String coloreInput = scan.nextLine();
				System.out.print("Wireless? (s/n)");
				String isWireless = scan.nextLine();
//				boolean wirelessInput = false;
//				if (isWireless.equals("s")) {
//					wirelessInput = true;
//				}
				boolean wirelessInput = isWireless.equals("s") ? true : false;

				Cuffie newCuffie = new Cuffie(i, nomeInput, marcaInput, prezzoInput, ivaInput, coloreInput,
						wirelessInput);
				catalogo[i] = newCuffie;
				break;
			default:
				// altri casi
				Prodotto newProdotto = new Prodotto(i, nomeInput, marcaInput, prezzoInput, ivaInput);
				catalogo[i] = newProdotto;
				break;
			}
		}

		System.out.println("Ecco il nostro catalogo");
		for (int j = 0; j < catalogo.length; j++) {
			System.out.println(catalogo[j]);
		}

		scan.close();
	}

}
