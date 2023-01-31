package Dostarczenie;
import java.util.Scanner;

public class OdbiórOsobiście implements Dostarczenie {
	
	public void UzyskajInformacje() {
		Scanner sc = new Scanner(System.in);
		String nazwisko, data;
		System.out.print("Podaj nazwisko: ");
		nazwisko = sc.nextLine();
		System.out.print("Podaj datę odbioru w sklepie(dd-mm): ");
		data = sc.nextLine();
		System.out.println("Twoje informacje zostały zapisane!");
	}
}