package jana60.streaming;

public class Movie extends Contenuto {

	// attributi
	private long durata;

	// costruttori
	public Movie(String titolo) {
		super(titolo);

	}

	public Movie(String titolo, long durata) {
		super(titolo);
		this.durata = durata;
	}

	// getter e setter
	public long getDurata() {
		return durata;
	}

	public void setDurata(long durata) {
		this.durata = durata;
	}

	// override
	@Override
	public void riproduci() {
		super.riproduci();
		System.out.println("Della durata di " + durata + " minuti");
	}

}
