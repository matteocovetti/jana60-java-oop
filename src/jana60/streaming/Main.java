package jana60.streaming;

public class Main {

	public static void main(String[] args) {
		Contenuto spiderMan = new Contenuto("Spider Man");
		spiderMan.riproduci();

		Movie avengers = new Movie("Avengers");
		avengers.setDurata(150L);

		avengers.riproduci();

		Serie squidGame = new Serie("Squid Game", 10);
		System.out.println(squidGame.toString());
		squidGame.riproduci();

	}

}
