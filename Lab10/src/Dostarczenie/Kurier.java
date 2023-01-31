package Dostarczenie;
import java.util.Scanner;

public class Kurier implements Dostarczenie{

	public void UzyskajInformacje() {
		Scanner sc = new Scanner(System.in);
		String nazwisko, numerTelefonu, adres;
		System.out.print("Podaj nazwisko: ");
		nazwisko = sc.nextLine();
		System.out.print("Podaj numer telefonu: ");
		numerTelefonu = sc.nextLine();
		System.out.print("Podaj adres: ");
		adres = sc.nextLine();
		System.out.println("Twoje informacje zostały zapisane!");
	}
}
