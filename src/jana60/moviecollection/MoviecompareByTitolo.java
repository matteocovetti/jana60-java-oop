package jana60.moviecollection;

import java.util.Comparator;

public class MoviecompareByTitolo implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.getTitolo().compareTo(o2.getTitolo());
	}

}
