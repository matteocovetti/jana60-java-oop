package jana60.moviecollection;

public class Movie implements Comparable<Movie> {

	// attributi
	private String titolo;
	private int annoDiUscita;
	private double voto;

	// costruttore
	public Movie(String titolo, int annoDiUscita) {
		this.titolo = titolo;
		this.annoDiUscita = annoDiUscita;
	}

	// overload dei costruttori
	public Movie(String titolo, int annoDiUscita, double voto) {
		super();
		this.titolo = titolo;
		this.annoDiUscita = annoDiUscita;
		this.voto = voto;
	}

	// getter e setter

	public void setVoto(double voto) {
		this.voto = voto;
	}

	public String getTitolo() {
		return titolo;
	}

	public int getAnnoDiUscita() {
		return annoDiUscita;
	}

	public double getVoto() {
		return voto;
	}

	// override
	@Override
	public String toString() {
		return titolo + " (" + annoDiUscita + ") - voto " + voto;
	}

	@Override
	public int compareTo(Movie otherMovie) {
		// deve restituire numero < 0 se this è < otherMovie
		if (this.annoDiUscita < otherMovie.annoDiUscita) {
			return -1;
		}
		// deve restituire 0 se sono uguali
		else if (this.annoDiUscita == otherMovie.annoDiUscita) {
			return 0;
		}
		// deve restituire numero > 0 se this è > otherMovie
		else {
			return 1;
		}

//		return Integer.compare(this.annoDiUscita, otherMovie.annoDiUscita);
//		return this.titolo.compareTo(otherMovie.titolo);
	}

}
