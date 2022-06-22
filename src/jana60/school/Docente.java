package jana60.school;

public class Docente extends Persona {
	// attributi
	private String materia;

	// costruttori
	public Docente(String nome, String cognome, String materia) {
		super(nome, cognome);
		this.materia = materia;
	}

	// getter e setter
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return super.toString() + " insegnante di " + materia;
	}

}
