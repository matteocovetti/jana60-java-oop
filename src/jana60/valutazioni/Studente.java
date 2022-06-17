package jana60.valutazioni;

public class Studente {
	// attributi
	int idStudente;
	int percentualeAssenze;
	double mediaVoti;

	// costruttore
	public Studente(int idStudente, int percentualeAssenze, double mediaVoti) {
		super();
		this.idStudente = idStudente;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;
	}

	// metodi
	boolean isPromosso() {
		boolean isPromosso;
		if (percentualeAssenze > 50) {
			isPromosso = false;
			// return false;
		} else if (percentualeAssenze >= 25 && percentualeAssenze <= 50) {
			isPromosso = mediaVoti > 2.0;
			// return mediaVoti > 2.0;
		} else {
			isPromosso = mediaVoti >= 2.0;
			// return mediaVoti >= 2.0;
		}

		return isPromosso;
	}
}
