package jana60.streaming;

public class Contenuto {

	private String titolo;

	public Contenuto(String titolo) {
		this.titolo = titolo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void riproduci() {
		System.out.println("Stai guardando " + titolo);
	}

	@Override
	public String toString() {

		return "Contenuto " + titolo;
	}

//	@Override
//	public String toString() {
//		return "Contenuto: " + titolo;
//	}
}
