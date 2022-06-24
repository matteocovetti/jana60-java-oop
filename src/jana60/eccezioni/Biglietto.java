package jana60.eccezioni;

public class Biglietto {

	// attributi
	private int km;
	private int etaPasseggero;

	// costruttore
	public Biglietto(int km, int etaPasseggero) throws Exception {
		// se km e etaPasseggero in input sono validi, continuo
		// altrimenti sollevo un'Eccezione
		if (km <= 0) {
			throw new Exception("Km deve essere maggiore di 0");
		}
		if (etaPasseggero < 0 || etaPasseggero > 120) {
			throw new Exception("Età passeggero non valida");
		}

		// assegno km e etaPasseggero
		this.km = km;
		this.etaPasseggero = etaPasseggero;
	}

//	// metodi private di validazione
//	private boolean isValidKm(int kmInput) {
//		return kmInput > 0;
//	}
}
