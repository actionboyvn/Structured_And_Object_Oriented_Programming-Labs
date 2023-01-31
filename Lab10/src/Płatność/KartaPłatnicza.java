package Płatność;
import java.util.Scanner;
public class KartaPłatnicza implements Płatność {
	
	public void DokonajPłatności() {
		Scanner sc = new Scanner(System.in);
		String numerKarty;
		int numerCVV;
		System.out.print("Podaj numer karty: ");
		numerKarty = sc.nextLine();
		System.out.print("Podaj numer CVV: ");
		numerCVV = sc.nextInt();
		System.out.println("Pomyślnie wypłacony!");
	}
}