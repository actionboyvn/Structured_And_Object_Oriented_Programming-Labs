package Zad1;
import java.util.*;
public class Wielokaty {
	private ArrayList<Figura> ListFigur;
	private FiguraCompare_Kolor Comparator1;
	private FiguraCompare_BokA Comparator2;
	private FiguraCompare_KolorOrazBokA Comparator3;
	Scanner sc = new Scanner(System.in);
	public Wielokaty() {
		ListFigur = new ArrayList<Figura>();
	}
	//Klasy Wenętrzne
	class FiguraCompare_Kolor implements Comparator<Figura> {
		public int compare(Figura fi1, Figura fi2) {
			return fi1.getKolor().compareTo(fi2.getKolor());
		}
	}
	class FiguraCompare_BokA implements Comparator<Figura> {
		public int compare(Figura fi1, Figura fi2) {
			int a1 = fi1.getA();
			int a2 = fi2.getA();
			if (a1 < a2) return -1; else
				if (a1 > a2) return 1;
			return 0;
		}
	}
	class FiguraCompare_KolorOrazBokA implements Comparator<Figura> {
		public int compare(Figura fi1, Figura fi2) {
			String kolor1 = fi1.getKolor();
			String kolor2 = fi2.getKolor();
			int a1 = fi1.getA();
			int a2 = fi2.getA();
			if (!kolor1.equals(kolor2)) return kolor1.compareTo(kolor2); else {
				if (a1 < a2) return -1; else
					if (a1 > a2) return 1; 
				return 0;
			}
		}
	}
	
	public void wyświetlListFigur() {
		for (int i = 0; i < ListFigur.size(); i++) 
			System.out.println("	Figura " + i + ": " + ListFigur.get(i));
	}
	public void wyświetlFiguręMaNajwiększyObwód() {
		int Maks = 0, pozycja = -1;
		for (int i = 0; i < ListFigur.size(); i++) 
			if (ListFigur.get(i).Obwód() > Maks) {
				Maks = ListFigur.get(i).Obwód();
				pozycja = i;
			}
		if (pozycja == -1) System.out.println("List figur jest pusty"); else
		System.out.println("	Figura ma największy obwód: " + ListFigur.get(pozycja).toString() + ", pozycja = " + pozycja);
	}
	public void twórzKompatorów() {
		Comparator1 = new FiguraCompare_Kolor();
		Comparator2 = new FiguraCompare_BokA();
		Comparator3 = new FiguraCompare_KolorOrazBokA();
	}
	public void sortKolor() {
		ListFigur.sort(Comparator1);
	}
	public void sortBokA() {
		ListFigur.sort(Comparator2);
	}
	public void sortKolorOrazBokA() {
		ListFigur.sort(Comparator3);
	}
	public void DodajTrójkąt() {
		System.out.println("Podaj kolor: ");
		String kolor = sc.nextLine();
		System.out.println("Podaj bok a: ");
		int a = sc.nextInt();
		System.out.println("Podaj bok b: ");
		int b = sc.nextInt();
		System.out.println("Podaj bok c: ");
		int c = sc.nextInt();
		sc.nextLine();
		ListFigur.add(new Trójkąt(kolor, a, b, c));
	}
	public void DodajProstokąt() {
		System.out.println("Podaj kolor: ");
		String kolor = sc.nextLine();
		System.out.println("Podaj bok a: ");
		int a = sc.nextInt();
		System.out.println("Podaj bok b: ");
		int b = sc.nextInt();
		sc.nextLine();
		ListFigur.add(new Prostokąt(kolor, a, b));
	}
	public static void PrintMenu() {
		System.out.println("Menu: ");
		System.out.println("1. Dodać trójkąt");
		System.out.println("2. Dodać prostokąt");
		System.out.println("3. Wyświetlić wszystkie figury");
		System.out.println("4. Sortować figury według kolorów");
		System.out.println("5. Sortować figury według boku a");
		System.out.println("6. Sortować figury według kolorów potem boku a");
		System.out.println("7. Wyświelić figurę ma największy obwód");
		System.out.println("0. Wyjście");
		System.out.print("Wybór: ");
	}
	public static void main(String[] args) {
		Wielokaty Projekt = new Wielokaty();
		Projekt.twórzKompatorów();
		int opcja = -1;
		Scanner scan = new Scanner(System.in);
		while (true) {
			PrintMenu();
			opcja = scan.nextInt();
			switch (opcja) {
			case 1: 
				Projekt.DodajTrójkąt();
				break;
			case 2:
				Projekt.DodajProstokąt();
				break;
			case 3:
				Projekt.wyświetlListFigur();
				break;
			case 4:
				Projekt.sortKolor();
				break;
			case 5:
				Projekt.sortBokA();
				break;
			case 6:
				Projekt.sortKolorOrazBokA();
				break;
			case 7:
				Projekt.wyświetlFiguręMaNajwiększyObwód();
				break;
			case 0:
				scan.close(); return;
			default:
				scan.close(); return;
			}
		}
	}
}
