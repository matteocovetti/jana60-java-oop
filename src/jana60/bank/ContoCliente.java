package jana60.bank;

import java.text.DecimalFormat;

public class ContoCliente {
	// attributi
	private int numeroConto;
	private double saldo;
	private DecimalFormat currencyFormatter = new DecimalFormat("0.00€");
	// le info del cliente sono in un oggetto
	private Cliente cliente;

	// costruttore
	// alla creazione di un nuovo conto il saldo sia 0€

	public ContoCliente(int numeroConto, Cliente cliente) {
		super();
		this.numeroConto = numeroConto;
		// this.cliente = cliente;
		this.cliente = new Cliente(cliente.getNome(), cliente.getCognome());
		this.saldo = 0.0;
	}

	// metodi getter e setter

	public int getNumeroConto() {
		return numeroConto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente.setNome(cliente.getNome());
		this.cliente.setCognome(cliente.getCognome());
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
