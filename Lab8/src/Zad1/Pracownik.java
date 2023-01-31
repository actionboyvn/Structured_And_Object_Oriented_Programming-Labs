package Zad1;
import java.util.Random;
public class Pracownik extends Osoba{
	String stanowisko;
	int pensja, stawka;
	int[] t = new int[6];
	public Pracownik() {
		super("", "");
		stanowisko = "brak";
		pensja = 0;
		stawka = 0;
		t = null;
	}
	public Pracownik(String nazwisko, String pesel, String stan, int pensja, int stawka) {
		super(nazwisko, pesel);
		this.stanowisko = stan;
		this.pensja = pensja;
		this.stawka = stawka;
		Random ran = new Random();
		for (int i = 0; i < 6; i++) t[i] = ran.nextInt(5);
	}
	public double Oblicz() {
		if (t == null) return 0;
		int S = 0; // suma nadgodzin
		for (int i = 0; i < 6; i++) S += t[i];
		return pensja + stawka * S;
	}
	public String toString() {
		return "  Pracownik " + super.toString() + " stanowisko = " + stanowisko + ", pensja = " + pensja + ", stawka = " + stawka;
	}
	public void wyswietlLiczbeNadgodzin() {
		if (t == null) return;
		System.out.println("  Liczba nadgodzin w poszczegolne dni:");
		System.out.println("	Poniedzialek : " + t[0]);
		System.out.println("	Wtorek : " + t[1]);
		System.out.println("	Sroda : " + t[2]);
		System.out.println("	Czwartek : " + t[3]);
		System.out.println("	Piatek : " + t[4]);
		System.out.println("	Sobota : " + t[5]);
	}
	public boolean jestKasjerem() {
		return stanowisko.equals("kasjer");
	}
}
