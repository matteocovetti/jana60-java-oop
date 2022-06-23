package jana60.inheritance.shop;

import java.text.DecimalFormat;

public class Prodotto {

	// costanti
	private static DecimalFormat df = new DecimalFormat("0.00€");

	// contatore
	private static int counter = 0;

	// attributi
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva;

	// costruttore
	public Prodotto(int codice, String nome, String marca, double prezzo, double iva) {
		super();
		counter++;
		this.codice = counter;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;

		System.out.println("Ho creato il prodotto " + counter);
	}

	// getter e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}

	// metodi private
	private double getPrezzoIvato() {
		return prezzo + prezzo * iva;
	}

	// metodi public
	public String getPrezzoFormattato() {
		return df.format(getPrezzoIvato());
	}

	// override
	@Override
	public String toString() {
		return codice + " - " + marca + " - " + nome + " - " + getPrezzoFormattato();
	}

}
