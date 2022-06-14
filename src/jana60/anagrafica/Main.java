package jana60.anagrafica;

public class Main {

	public static void main(String[] args) {

		Persona ruben = new Persona();
		Persona alessia = new Persona();

//		System.out.println("Ciao mi chiamo " + ruben.nome + " " + ruben.cognome);
//		System.out.println("Ciao mi chiamo " + alessia.nome + " " + alessia.cognome);

		ruben.nome = "Ruben";
		ruben.cognome = "Fiore";
		ruben.annoDiNascita = 1995;

		alessia.nome = "Alessia";
		alessia.cognome = "Biagi";
		alessia.annoDiNascita = 1999;

//		System.out.println("Ciao mi chiamo " + ruben.nome + " " + ruben.cognome);
//		System.out.println("Ciao mi chiamo " + alessia.nome + " " + alessia.cognome);

//		System.out.println("Ciao mi chiamo " + ruben.concatenaNomeCognome(true));
//		System.out.println("e ho " + ruben.calcolaEta(2022) + " anni");
//		System.out.println("Ciao mi chiamo " + alessia.concatenaNomeCognome(false));
//		System.out.println("e ho " + alessia.calcolaEta(2022) + " anni");

		ruben.stampaSaluto();
		alessia.stampaSaluto();

		ruben.nome = "Geronimo";

		System.out.println("Ciao mi chiamo " + ruben.nome + " " + ruben.cognome);

	}

}
