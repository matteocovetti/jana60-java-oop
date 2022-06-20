package jana60.biglietteria;

import java.text.DecimalFormat;

public class Biglietto {
	// costanti
	private double COSTO_CHILOMETRICO = 0.21;
	private double SCONTO_MINORENNI = 0.20;
	private double SCONTO_OVER_65 = 0.40;
	private DecimalFormat CURRENCY_FORMATTER = new DecimalFormat("0.00€");

	// attributi
	private int numeroChilometri;
	private int eta;

	// costruttori
	public Biglietto(int numeroChilometri, int eta) {
		super();
		this.numeroChilometri = numeroChilometri;
		this.eta = eta;
	}

	// metodi

	// calcolo del prezzo in base a km ed eta
	public double calcolaPrezzo() {
		double prezzoBase = (double) numeroChilometri * COSTO_CHILOMETRICO;
		double prezzoFinale;
		if (eta < 18) { // sconto minorenni
			prezzoFinale = prezzoBase - prezzoBase * SCONTO_MINORENNI;
		} else if (eta >= 65) {// sconto over 65
			prezzoFinale = prezzoBase - prezzoBase * SCONTO_OVER_65;
		} else {
			prezzoFinale = prezzoBase;
		}

		return prezzoFinale;
	}

	// prezzo formattato come currency
	public String prezzoFormattato() {
		return CURRENCY_FORMATTER.format(calcolaPrezzo());
	}
}
