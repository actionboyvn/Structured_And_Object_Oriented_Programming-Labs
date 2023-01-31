package Zad1;

public class Prostopadloscian extends Bryla {
	int a;
	int b;
	public Prostopadloscian() {
		super("Bazowy", 1);
		a = b = 1;
	}
	public Prostopadloscian(String nazwa, int h, int a, int b) {
		super(nazwa, h);
		this.a = a;
		this.b = b;
	}
	public double Objetosc() {
		return a * b * getWysokosc();
	}
	public double Pole() {
		return 2 * a * b + 2 * getWysokosc() * (a + b);
	}
	public String toString() {
		return "Prostopadloscian: " + super.toString() + " [a = " + a + ", b = " + b + ", h = " 
																					+getWysokosc() + "]";
	}
	public boolean jestSzescianem() {
		if (a == b) return true; else return false;
	}
	
}
