package jana60.bank;

import java.util.Random;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		System.out.print("Nome cliente: ");
		String nomeCliente = scan.nextLine();
		System.out.print("Cognome cliente: ");
		String cognomeCliente = scan.nextLine();
		int randomInt = random.nextInt(1000) + 1;

		Cliente nuovoCliente = new Cliente(nomeCliente, cognomeCliente);

		// posso creare un conto solo se gli passo un Cliente
		ContoCliente nuovoConto = new ContoCliente(randomInt, nuovoCliente);
		System.out.print("Ho creato il conto " + nuovoConto.getNumeroConto());
		System.out.println(" per il cliente " + nuovoConto.getCliente().getNomeCompleto());

		nuovoCliente.setCognome("Rockerduck");

		System.out.println("Cliente del conto: " + nuovoConto.getCliente().getNomeCompleto());

		scan.close();
	}

}
