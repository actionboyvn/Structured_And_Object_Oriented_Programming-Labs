package Klient;
import SklepAllegro_Le.*;
import Płatność.*;
import java.util.Scanner;
import java.io.*;

import Dostarczenie.*;

class Zamówienie implements Serializable{
	private static final long serialVersionUID = 1648554866703674492L;
	String produkt = null;
	String metodaDostarczenia = null;
	String metodaPłatności = null;
	public Zamówienie(String produkt, String metodaDostarczenia, String metodaPłatności) {
		this.produkt = produkt;
		this.metodaDostarczenia = metodaDostarczenia;
		this.metodaPłatności = metodaPłatności;
	}
	public String toString() {
		return "Produkt: " + produkt + ", " + "metoda dostarczenia: " + metodaDostarczenia + ", " + "metoda płatności: " + metodaPłatności;
	}
}
public class MenuDlaKlientów {
	static Zamówienie Z = null;
	public static void Menu1() {
		System.out.println("Witam w moim sklepie!");
		System.out.println("Produkty: ");
		System.out.println("	1. Telefon iPhone 12 ");
		System.out.println("	2. Aparat Sony RX100 ");
		System.out.println("	0. Wyjść");
		System.out.print("Wybierz produkt do kupienia (1,2 lub 0): ");
	}
	public static void Menu2() {
		System.out.println("Opcje dostawy: ");
		System.out.println("	1. Kurier ");
		System.out.println("	2. Odbiór osobiście ");
		System.out.print("Wybierz metodę dostawy (1 lub 2): ");
	}
	public static void Menu3() {
		System.out.println("Opcje płatności: ");
		System.out.println("	1. Karta płatnicza");
		System.out.println("	2. BLIK code");
		System.out.print("Wybierz metodę płatności (1 lub 2): ");
	}
	public static void Menu4() {
		System.out.println("Opcje dla ciebie: ");
		System.out.println("	1. Przegląd zamówienia");
		System.out.println("	2. Zmienić sposób dostawy");
		System.out.println("	0. Wyjść");
		System.out.print("Wybierz opcję (1,2 lub 0): ");
	}
	public static void ZapiszDoPliku() {
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("zamówienia.ser"))) 
		{
			os.writeObject(Z);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void ZapiszDoPliku2() {
		Telefon_iPhone12 Telefon = new Telefon_iPhone12();
		Aparat_SonyRX100 Aparat = new Aparat_SonyRX100();
		Telefon.UstawMetodęDostarczenia(new OdbiórOsobiście(), "odbiór osobiście");
		Telefon.UstawMetodęPłatności(new BLIK(), "BLIK code");
		Zamówienie Z1 = new Zamówienie("Telefon iPhone 12", Telefon.getMetodaDostarczenia(), Telefon.getMetodaPłatności());
		Zamówienie Z2 = new Zamówienie("Aparat Sony RX100", Aparat.getMetodaDostarczenia(), Aparat.getMetodaPłatności());
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("zamówienia.ser"))) 
		{
			os.writeObject(Z1);
			os.writeObject(Z2);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException {
		int opcja = -1;
		int opcjaDostawy = -1;
		int opcjaPłatności = -1;
		Scanner sc = new Scanner(System.in);
		ZapiszDoPliku2();
		//Menu1();
		//opcja = sc.nextInt();
		if (opcja == 0 ) {
			System.out.println("Dziękuję! Do widzenia!"); sc.close(); return;
		}
		if (opcja == 1) {
			Telefon_iPhone12 Telefon = new Telefon_iPhone12();
			Menu2();
			opcjaDostawy = sc.nextInt();
			if (opcjaDostawy == 2) Telefon.UstawMetodęDostarczenia(new OdbiórOsobiście(), "odbiór osobiście");
			Telefon.WykonajDostarczenie();
			Menu3();
			opcjaPłatności = sc.nextInt();
			if (opcjaPłatności == 2) Telefon.UstawMetodęPłatności(new BLIK(), "BLIK code");
			Telefon.WykonajPłatność();
			System.out.println("Telefon został pomyślnie zamówiony!");
			Menu4();
			int opcjaKlienta = sc.nextInt();
			while (true) {
				switch (opcjaKlienta) {
				case 0: 
					Z = new Zamówienie("Telefon iPhone 12", Telefon.getMetodaDostarczenia(), Telefon.getMetodaPłatności());
					ZapiszDoPliku();
					System.out.println("Dziękuję! Do widzenia!"); sc.close(); return;
				case 1:
					Telefon.WyswietlInfo();
					Menu4();
					opcjaKlienta = sc.nextInt();
					break;
				case 2:
					Menu2();
					opcjaDostawy = sc.nextInt();
					if (opcjaDostawy == 1) {
						Telefon.UstawMetodęDostarczenia(new Kurier(), "kurier");
						System.out.println("Metoda dostarczenia zmieniła się do : kurier");
					} else {
						Telefon.UstawMetodęDostarczenia(new OdbiórOsobiście(), "odbiór osobiście");
						System.out.println("Metoda dostarczenia zmieniła się do : odbiór osobiście");
					}
					Telefon.WykonajDostarczenie();
					Menu4();
					opcjaKlienta = sc.nextInt();
					break;
				default:
					sc.close(); return;
				}
			}
		}
		if (opcja == 2) {
			Aparat_SonyRX100 Aparat = new Aparat_SonyRX100();
			Menu2();
			opcjaDostawy = sc.nextInt();
			if (opcjaDostawy == 2) Aparat.UstawMetodęDostarczenia(new OdbiórOsobiście(), "odbiór osobiście");
			Aparat.WykonajDostarczenie();
			Menu3();
			opcjaPłatności = sc.nextInt();
			if (opcjaPłatności == 2) Aparat.UstawMetodęPłatności(new BLIK(), "BLIK code");
			Aparat.WykonajPłatność();
			System.out.println("Aparat został pomyślnie zamówiony!");
			Menu4();
			int opcjaKlienta = sc.nextInt();
			while (true) {
				switch (opcjaKlienta) {
				case 0: 
					Z = new Zamówienie("Aparat Sony RX100", Aparat.getMetodaDostarczenia(), Aparat.getMetodaPłatności());
					ZapiszDoPliku();
					System.out.println("Dziękuję! Do widzenia!"); sc.close(); return;
				case 1:
					Aparat.WyswietlInfo();
					Menu4();
					opcjaKlienta = sc.nextInt();
					break;
				case 2:
					Menu2();
					opcjaDostawy = sc.nextInt();
					if (opcjaDostawy == 1) {
						Aparat.UstawMetodęDostarczenia(new Kurier(), "kurier");
						System.out.println("Metoda dostarczenia zmieniła się do : kurier");
					} else {
						Aparat.UstawMetodęDostarczenia(new OdbiórOsobiście(), "odbiór osobiście");
						System.out.println("Metoda dostarczenia zmieniła się do : odbiór osobiście");
					}
					Aparat.WykonajDostarczenie();
					Menu4();
					opcjaKlienta = sc.nextInt();
					break;
				default:
					sc.close(); return;
				}
			}
		}
		
	}
}
