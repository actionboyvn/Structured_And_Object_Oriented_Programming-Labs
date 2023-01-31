package Zad1;

public class KartaKierownika extends KartaPracownika{
	public KartaKierownika() {
		super();
	}
	public KartaKierownika(int number, String nazwisko) {
		super(number, nazwisko);
	}
	public double premia() {
		return 0.5;
	}
	public String toString() {
		return super.toString() + ", z Karta Kierownika";
	}
}
