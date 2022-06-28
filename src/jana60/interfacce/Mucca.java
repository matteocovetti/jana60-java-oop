package jana60.interfacce;

public class Mucca implements Animale {

	private String nome;

	public Mucca(String nome) {
		this.nome = nome;
	}

	@Override
	public void mangia(String cosaMangia) {
		System.out.println("Mangio " + cosaMangia);

	}

	@Override
	public void faiVerso() {
		System.out.println("Muuu");

	}

	@Override
	public void dormi() {
		// TODO Auto-generated method stub

	}

}
