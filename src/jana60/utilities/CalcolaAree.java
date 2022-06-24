package jana60.utilities;

public class CalcolaAree {
	// costanti
	public final static double PI_GRECO = 3.14;

	private CalcolaAree() {
		// costruttore private
	}

	public static int rettangolo(int base, int altezza) {
		return base * altezza;
	}

	public static int quadrato(int lato) {
		return lato * lato;
	}

	public static double cerchio(int raggio) {
		return raggio * raggio * PI_GRECO;
	}
}
