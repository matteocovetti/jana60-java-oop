package jana60.valutazionioop;

public class Main {

	public static void main(String[] args) {
		Studente studente1 = new Studente(1, 15, 2.5);
		System.out.println("Lo studente con id " + studente1.getIdStudente());
		// codice
		// codice
		// aggiorno media voti dello studente
		studente1.setMediaVoti(4.0);

		if (studente1.isPromosso()) {
			System.out.println("Lo studente " + studente1.getIdStudente() + " è stato promosso");
		}
	}

}
