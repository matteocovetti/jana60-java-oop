package jana60.moviecollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// creo un singolo Movie
		Movie maryPoppins = new Movie("Mary Poppins", 1964);

//		Movie drStrange = new Movie("Dr Strange Multiverso", 2022);
//
//		maryPoppins.compareTo(drStrange);

		// creo la lista di Movie
		List<Movie> myMovies = new ArrayList<Movie>();
		myMovies.add(maryPoppins);
		myMovies.add(new Movie("Avengers", 2012));
		myMovies.add(new Movie("Forrest Gump", 1994));
		myMovies.add(new Movie("Ogni maledetta domenica", 1999));
		myMovies.add(new Movie("Back to the future", 1982, 9.5));

		// stampo ogni elemento della lista e chiedo il voto
		Iterator<Movie> movieIterator = myMovies.iterator();
		while (movieIterator.hasNext()) {
			Movie currentMovie = movieIterator.next();

			// chiedo il voto solo se è 0.0
			if (currentMovie.getVoto() == 0.0) {
				System.out.println(currentMovie.getTitolo() + " (" + currentMovie.getAnnoDiUscita() + ")");
				System.out.print("Che voto dai a questo film? ");
				double mioVoto = Double.parseDouble(scan.nextLine());
				currentMovie.setVoto(mioVoto);
			} else {
				System.out.println(currentMovie);
			}
		}

		// stampo la lista con i voti
		// System.out.println(myMovies);
		System.out.println("Mia lista di Movies con voto:");
		for (Movie currentMovie : myMovies) {
			System.out.println(currentMovie);
			// currentMovie.setVoto(10);
		}
//		// equivalente ciclo for normale
//		for (int i = 0; i < myMovies.size(); i++) {
//			// ho a disposizione solo i
//			Movie current = myMovies.get(i);
//			System.out.println(current);
//		}

		// ordino la lista di movies
		Collections.sort(myMovies);
		System.out.println("Lista ordinata per anno");
		System.out.println(myMovies);

		myMovies.sort(new MoviecompareByTitolo());
		System.out.println("Lista ordinata per titolo");
		System.out.println(myMovies);

		scan.close();
	}

}
