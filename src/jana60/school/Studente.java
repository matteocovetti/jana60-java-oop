package jana60.school;

public class Studente extends Persona {
	// attributi
	private String matricola;

	// costruttori
	public Studente(String nome, String cognome, String matricola) {
		super(nome, cognome);
		this.matricola = matricola;
	}

	@Override
	public String toString() {
		return super.toString() + " matricola " + matricola;
	}

}
