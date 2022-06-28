package jaan60.classiastratte;

public class Main {

	public static void main(String[] args) {
//		Animale animale1 = new Animale("fido", "fattoria");
//
//		animale1.mangia("osso");

		Mucca mucca = new Mucca("Pina", "alpe");
		mucca.mangia("fieno");
		mucca.faiVerso();

		Gatto tom = new Gatto("Tom", "divano", "pallina");
		tom.faiVerso();
		tom.gioca();
	}

}
