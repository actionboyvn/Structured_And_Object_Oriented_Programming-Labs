package Zad1;
import java.util.Random;
public class Klient extends Osoba{
	int n; // liczba lokat
	Lokata[] Tab;
	public Klient() {
		super("", "");
		n = 0;
		Tab = null;
	}
	public Klient(String nazwisko, String pesel, int n) {
		super(nazwisko, pesel);
		this.n = n;
		Tab = new Lokata[n];
		Random ran = new Random();
		for (int i = 0; i < n; i++) Tab[i] = new Lokata(i, ran.nextInt(9501) + 500, false);
	}
	public double Oblicz() {
		if (Tab == null) return 0;
		double S = 0; //suma wszystkich lokat
		for (int i = 0; i < n; i++) S += Tab[i].kwota;
		return S;
	}
	public String toString() {
		return "  Klient " + super.toString() + ", n = " + n;
	}
	public void wyswietlLokaty() {
		if (Tab == null) return;
		for (int i = 0; i < n; i++) 
			System.out.println(Tab[i].toString());
	}
}
