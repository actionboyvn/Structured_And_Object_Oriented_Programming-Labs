package Zad1;

public abstract class KartaPracownika {
	int number;
	String nazwisko;
	public KartaPracownika() {
		number = 0;
		nazwisko = null;
	}
	public KartaPracownika(int number, String nazwisko) {
		this.number = number;
		this.nazwisko = nazwisko;
	}
	public String toString() {
		return "numer = " + number + ", nazwisko: " + nazwisko;
	}
	public abstract double premia();
}
