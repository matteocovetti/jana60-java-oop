package jaan60.classiastratte;

public abstract class Animale {

	private String nome;
	private String doveVive;

	public Animale(String nome, String doveVive) {
		super();
		this.nome = nome;
		this.doveVive = doveVive;
	}

	public void mangia(String cosaMangia) {
		System.out.println("Gnam mi piace " + cosaMangia);
	}

	// metodo astratto, non deve avere corpo {}
	public abstract void faiVerso();

}
