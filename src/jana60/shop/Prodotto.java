package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {
	// attributi
	String marca;
	String nome;
	double prezzo;
	int iva; // ad es. 22

	// costruttore
	Prodotto(String marca, String nome, double prezzo, int iva) {
		super();
		this.marca = marca;
		this.nome = nome;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	// metodi
	double calcolaPrezzoConIva() {
		return prezzo + prezzo * iva / 100;
	}

	// overload dei metodi
	String formattaPrezzo(String pattern) {
		DecimalFormat df = new DecimalFormat(pattern);
		return df.format(calcolaPrezzoConIva());
	}

	String formattaPrezzo() {
		DecimalFormat df = new DecimalFormat("0.00€");
		return df.format(calcolaPrezzoConIva());
	}

	String formattaPrezzo(DecimalFormat df) {
		return df.format(calcolaPrezzoConIva());
	}

	String infoProdotto() {
		String infoProdotto = "Marca: " + marca;
		infoProdotto += "\nNome: " + nome;
		infoProdotto += "\nPrezzo: " + formattaPrezzo();

		return infoProdotto;
	}

	String infoProdottoFormat(String format) {
		return String.format(format, marca, nome, formattaPrezzo());
	}

	void setPrezzo(double prezzo) {
		if (prezzo < 0.0) {
			this.prezzo = -prezzo;
		} else {
			this.prezzo = prezzo;
		}

	}

}
