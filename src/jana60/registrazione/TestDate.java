package jana60.registrazione;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TestDate {

	public static void main(String[] args) {
		LocalDate oggi = LocalDate.now();
		System.out.println(oggi);

		LocalDate compleanno = LocalDate.of(1980, 12, 2);

		oggi.isAfter(compleanno);

		Period etaPeriod = Period.between(compleanno, oggi);
		System.out.println("La mia età: " + etaPeriod.getYears());

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formatter.format(compleanno));

		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		System.out.println(formatter2.format(compleanno));

		LocalDate dateFormString = LocalDate.parse("01/01/2020", formatter);
		System.out.println(dateFormString);
	}

}
