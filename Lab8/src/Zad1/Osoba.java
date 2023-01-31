package Zad1;

public abstract class Osoba {
	String nazwisko;
	String pesel;
	public Osoba() {
		nazwisko = "";
		pesel = "000000000";
	}
	public Osoba(String nazwisko, String pesel) {
		this.nazwisko = nazwisko;
		this.pesel = pesel;
	}
	public String toString() {
		return nazwisko + ": " + pesel;
	}
	public abstract double Oblicz();
}
