package jana60.school;

public class Persona {
	// attributi
	private String nome;
	private String cognome;

	// costruttori
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return nome + " " + cognome;
	}

}
