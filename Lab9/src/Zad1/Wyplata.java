package Zad1;

public class Wyplata {
	static int numerWyplaty = 0;
	double pensja;
	KartaPracownika karta;
	public Wyplata() {
		numerWyplaty++;
		pensja = 0;
		karta = null;
	}
	public Wyplata(double pensja, KartaPracownika karta) {
		this.pensja = pensja;
		this.karta = karta;
		numerWyplaty++;
	}
	public String toString() {
		if (karta == null) return "Wyplata: pensja = " + pensja; else
		return "Wyplata: " + karta.toString() + ", pensja = " + pensja;
	}
	public double pensjaZPremia() {
		if (karta == null) return 0;
		return pensja * (1 + karta.premia());
	}
}
