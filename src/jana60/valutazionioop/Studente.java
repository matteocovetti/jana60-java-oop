package jana60.valutazionioop;

public class Studente {
	// attributi
	private int idStudente;
	private int percentualeAssenze;
	private double mediaVoti;

	// costruttore
	public Studente(int idStudente, int percentualeAssenze, double mediaVoti) {
		super();
		this.idStudente = idStudente;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;
	}

	// getter e setter
	public int getIdStudente() {
		return idStudente;
	}

	public void setPercentualeAssenze(int percentualeAssenze) {
		this.percentualeAssenze = percentualeAssenze;
	}

	public void setMediaVoti(double mediaVoti) {
		this.mediaVoti = mediaVoti;
	}

	// metodi
	public boolean isPromosso() {
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
