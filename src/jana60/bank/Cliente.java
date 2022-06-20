package jana60.bank;

public class Cliente {
	// attributi
	private String nome;
	private String cognome;
	private String codiceFiscale;

	// costruttore
	public Cliente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	// getter e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	// altri metodi
	public String getNomeCompleto() {
		return nome + " " + cognome;
	}
}
