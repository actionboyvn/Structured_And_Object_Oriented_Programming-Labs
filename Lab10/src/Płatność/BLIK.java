package Płatność;
import java.util.Scanner;

public class BLIK implements Płatność {
	
	public void DokonajPłatności() {
		Scanner sc = new Scanner(System.in);
		int BLIK;
		System.out.print("Podaj BLIK kod (6 cyfr):  ");
		BLIK = sc.nextInt();
		System.out.println("Pomyślnie wypłacony!");
	}
}