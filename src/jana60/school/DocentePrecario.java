package jana60.school;

public class DocentePrecario extends Docente {

	private int numeroContratto;

	public DocentePrecario(String nome, String cognome, String materia, int numeroContratto) {
		super(nome, cognome, materia);
		this.numeroContratto = numeroContratto;
	}

}
