package jaan60.classiastratte;

public class Mucca extends Animale {

	public Mucca(String nome, String doveVive) {
		super(nome, doveVive);
	}

	@Override
	public void faiVerso() {
		System.out.println("Muuuu");
	}

}
