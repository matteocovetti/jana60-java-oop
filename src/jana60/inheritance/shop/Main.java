package jana60.inheritance.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto prod = new Prodotto(100, "Jordan", "Nike", 199.0, 0.22);
		Prodotto prod2 = new Prodotto(104, "Gazelle", "Adidas", 169.0, 0.22);
		System.out.println(prod.getNome() + " " + prod.getMarca() + " " + prod.getPrezzoFormattato());

		Smartphone iphone = new Smartphone(101, "Iphone", "Apple", 799.99, 0.18, "12314141", "8GB");
		System.out.println(iphone.getNome() + " " + iphone.getMarca() + " " + iphone.getPrezzoFormattato());

		Televisore tv = new Televisore(102, "X12", "Samsung", 1299.99, 0.22, 32, true);
		System.out.println(tv.getNome() + " " + tv.getMarca() + " " + tv.getDimensioniInPollici() + " "
				+ tv.getPrezzoFormattato());

		System.out.println(prod);
		System.out.println(prod2);
		System.out.println(iphone);
		System.out.println(tv);
	}

}
