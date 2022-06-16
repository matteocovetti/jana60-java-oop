package jana60.shop;

public class Main {

	public static void main(String[] args) {

		Prodotto iphone = new Prodotto("Apple", "IPhone", 899.99, 22);

		System.out.println(iphone.infoProdotto());

		iphone.prezzo = -100.00;
		iphone.setPrezzo(-100.00); // ritornare errore

		System.out.println(iphone.infoProdotto());

	}

}
