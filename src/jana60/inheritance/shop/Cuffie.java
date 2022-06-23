package jana60.inheritance.shop;

public class Cuffie extends Prodotto {

	// attributi
	private String colore;
	private boolean wireless;

	// costruttore
	public Cuffie(int codice, String nome, String marca, double prezzo, double iva, String colore, boolean wireless) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
	}

	// getter e setter
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	// metodi
	private String isWirelessOrCable() {
//		if (wireless) {
//			return "wireless";
//		} else {
//			return "cablate";
//		}
		return wireless ? "wireless" : "cablate";
	}

	// override
	@Override
	public String toString() {
		return super.toString() + " - " + colore + " - " + isWirelessOrCable();
	}

}
