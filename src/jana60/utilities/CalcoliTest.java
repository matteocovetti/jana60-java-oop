package jana60.utilities;

import java.util.Scanner;

public class CalcoliTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Dimmi due numeri");
		int x = 0;
		boolean valido = false;
		do {
			System.out.print("x: ");
			try {
				x = Integer.parseInt(scan.nextLine());
				valido = true;
			} catch (Exception eccezione) {
				System.out.println("Guarda che deve essere un numero");
			}
		} while (!valido);
		System.out.print("y: ");
		int y = Integer.parseInt(scan.nextLine());

		System.out.println("somma: " + CalcoliHelper.somma(x, y));
		System.out.println("moltiplicazione: " + CalcoliHelper.moltiplicazione(x, y));
		System.out.println("divisione: " + CalcoliHelper.divisione(x, y));
		System.out.println("differenza: " + CalcoliHelper.differenza(x, y));
		System.out.println("valore assoluto di x: " + CalcoliHelper.valoreAssoluto(x));
		System.out.println("valore assoluto di y: " + CalcoliHelper.valoreAssoluto(y));
		System.out.println("minimo: " + CalcoliHelper.minimo(x, y));
		System.out.println("massimo: " + CalcoliHelper.massimo(x, y));

		scan.close();
	}

}
