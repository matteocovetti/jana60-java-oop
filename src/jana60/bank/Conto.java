package jana60.bank;

import java.text.DecimalFormat;

public class Conto {
	// attributi
	private int numeroConto;
	private String proprietario;
	private double saldo;
	private DecimalFormat currencyFormatter = new DecimalFormat("0.00€");

	// costruttore
	// alla creazione di un nuovo conto il saldo sia 0€
	public Conto(int numeroConto, String proprietario) {
		super();
		this.numeroConto = numeroConto;
		this.proprietario = proprietario;
		this.saldo = 0.0;
	}

	// metodi getter e setter
	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getNumeroConto() {
		return numeroConto;
	}

	public double getSaldo() {
		return saldo;
	}

	// metodi
	// metodo per versare denaro sul conto
	public void deposito(double somma) {
		saldo += somma;
	}

	// metodo per prelevare denaro dal conto
	public boolean prelievo(double somma) {
		if (saldo >= somma) {
			saldo -= somma;
			return true;
		} else {
			return false;
		}
	}

	// metodo per ritornare il saldo formattato
	public String getSaldoFormattato() {
		return currencyFormatter.format(saldo);
	}

}
