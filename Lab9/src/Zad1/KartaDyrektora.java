package Zad1;

public class KartaDyrektora extends KartaPracownika{
	public KartaDyrektora() {
		super();
	}
	public KartaDyrektora(int number, String nazwisko) {
		super(number, nazwisko);
	}
	public double premia() {
		return 1;
	}
	public String toString() {
		return super.toString() + ", z Karta Dyrektora";
	}
}
