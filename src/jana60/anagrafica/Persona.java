package jana60.anagrafica;

public class Persona {
	// attributi
	String nome;
	String cognome;
	int annoDiNascita;

	// metodi
	// metodo che concatena nome e cognome
	String concatenaNomeCognome(boolean primaNome) {
		String nomeCognomeConcat;
		if (primaNome) {
			nomeCognomeConcat = nome + " " + cognome;
		} else {
			nomeCognomeConcat = cognome + " " + nome;
		}
		return nomeCognomeConcat;
	}

	// metodo che restituisce l'età
	int calcolaEta(int annoCorrente) {
		return annoCorrente - annoDiNascita;
	}

	void stampaSaluto() {
		System.out.println("Ciao mi chiamo " + concatenaNomeCognome(true) + " e ho " + calcolaEta(2022) + " anni");
	}
}
