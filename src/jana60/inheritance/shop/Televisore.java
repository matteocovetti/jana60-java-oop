package jana60.inheritance.shop;

public class Televisore extends Prodotto {

	// attributi
	private int dimensioni;
	private boolean smart;

	// costruttori
	public Televisore(int codice, String nome, String marca, double prezzo, double iva, int dimensioni, boolean smart) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}

	// getter e setter
	public int getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	// metodi public
	public String getDimensioniInPollici() {
		return dimensioni + "\""; // "pollici"
	}

	private String isSmartString() {
		if (smart) {
			return "smart tv";
		} else {
			return "no smart";
		}
	}

	// override
	@Override
	public String toString() {
		return super.toString() + " - " + getDimensioniInPollici() + " - " + isSmartString();
	}

}
