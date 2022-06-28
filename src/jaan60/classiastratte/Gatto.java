package jaan60.classiastratte;

public class Gatto extends Animale {

	private String giocoPreferito;

	public Gatto(String nome, String doveVive, String giocoPreferito) {
		super(nome, doveVive);
		this.giocoPreferito = giocoPreferito;
	}

	@Override
	public void faiVerso() {
		System.out.println("Miao");

	}

	public void gioca() {
		System.out.println("Gioco a " + giocoPreferito);
	}

}
