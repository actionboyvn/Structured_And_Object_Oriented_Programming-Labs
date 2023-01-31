package Zad1;
import java.io.*;
import java.util.Scanner;
public class Firma {
	static Wyplata[] Tab = new Wyplata[100];
	static KartaPracownika[] osoba = new KartaPracownika[100];
	static int n = 0;
	public static void KomunicatyMenu() {
		System.out.println("Menu:");
		System.out.println("1: Wstawic kilka wyplat ");
		System.out.println("2: Wyswietlic wyplat");
		System.out.println("3: Dodac jednej wyplaty");
		System.out.println("4: Ile bylo wyplat z Karta Kierownika");
		System.out.println("5: Wyswietlic pracownika z Karta Personelu ma wyplate najnizsza");
		System.out.println("6: Zapisac do pliku wyplat z uzyciem Karty Personelu");
		System.out.println("0: Wyjscie");
		System.out.println("Wybor opcje: ");
	}
	public static void DodajJednejWyplaty(){
		int p = 0;
		System.out.println("Czy wstawisz Konstruktor Domyslny? 1-tak, 0-nie");
		Scanner sc = new Scanner(System.in);
		p = sc.nextInt();
		sc.nextLine();
		if (p == 1) {
			Tab[n] = new Wyplata(); 
			n++;
			return;
		}
		int numer;
		String nazwisko;
		int typKarty;
		double pensja;
		KartaPracownika osoba = null;
		System.out.println("Podaj numer: ");
		numer = sc.nextInt();
		System.out.println("Podaj nazwisko: ");
		nazwisko = sc.nextLine();
		nazwisko = sc.nextLine();
		System.out.println("Podaj pensje: ");
		pensja = sc.nextDouble();
		System.out.println("Podaj typ Karty (1-KartaDyrektora, 2-KartaKierownika, 3-KartaPersonelu): ");
		typKarty = sc.nextInt();
		if (typKarty == 1) 
			osoba = new KartaDyrektora(numer, nazwisko);
		if (typKarty == 2) 
			osoba = new KartaKierownika(numer, nazwisko);
		if (typKarty == 3)
			osoba = new KartaPersonelu(numer, nazwisko);
		Tab[n] = new Wyplata(pensja, osoba);
		n++;
	}
	public static void main(String[] args){
		int opcja = -1;
		KomunicatyMenu();
		Scanner sc = new Scanner(System.in);
		while (opcja!=0) {
			opcja = sc.nextInt();
			if (opcja == 0) {
				System.out.println("Koniec");
				break;
			}
			if (opcja == 1) {
				int k = 0;
				System.out.print("Ile wyplat wstawi?");
				k = sc.nextInt();
				for (int i = 0; i < k; i++)
					if (n < 100)
					DodajJednejWyplaty();
			}
			if (opcja == 2) {
				for (int i = 0; i < n; i++)
					System.out.println(Tab[i].toString());
			}
			if (opcja == 3) {
				if (n < 100) 
				DodajJednejWyplaty();
			}
			if (opcja == 4) {
				int liczba_wyplat_KartaKierownika = 0;
				for (int i = 0; i < n; i++)
					if (Tab[i].karta instanceof KartaKierownika) liczba_wyplat_KartaKierownika++;
				System.out.println("Liczba wyplat z Karta Kierownika = " + liczba_wyplat_KartaKierownika);
			}
			if (opcja == 5) {
				double min_Tab_KartaPersonelu = -1;
				int p = -1;
				for (int i = 0; i < n; i++)
					if (Tab[i].karta instanceof KartaPersonelu) 
						if (min_Tab_KartaPersonelu == -1 || min_Tab_KartaPersonelu > Tab[i].pensja) {
							min_Tab_KartaPersonelu = Tab[i].pensja;
							p = i;
						}
				if (p == -1) System.out.println("Nie ma wyplat z Karta Personelu"); else {
					System.out.println("Pracownik z Karta Personelu ma wyplate najnizsza : ");
					System.out.println("	" + Tab[p].toString());
				}
			}
			if (opcja == 6) {
				File plik = new File("wyplaty.txt");
				try {
					BufferedWriter bwriter = new BufferedWriter(new FileWriter(plik));
					for (int i = 0; i < n; i++) 
						if (Tab[i].karta instanceof KartaPersonelu)
							bwriter.write(Tab[i].toString() + "\n");
					bwriter.close();
					System.out.println("Pomyslnie zapisano do pliku");
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Niepowodzenie zapisac");
				} 
			}
			KomunicatyMenu();
		}
		sc.close();
		
	}
}
