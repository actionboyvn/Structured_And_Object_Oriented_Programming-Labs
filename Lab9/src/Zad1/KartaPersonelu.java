package Zad1;

public class KartaPersonelu extends KartaPracownika {
	public KartaPersonelu() {
		super();
	}
	public KartaPersonelu(int number, String nazwisko) {
		super(number, nazwisko);
	}
	public double premia() {
		return 0.2;
	}
	public String toString() {
		return super.toString() + ", z Karta Personelu";
	}
}
