package Zad1;

public class Walec extends Bryla {
	int r;
	public Walec() {
		super("Bazowy", 1);
		r = 1;
	}
	public Walec(String nazwa, int h, int r) {
		super(nazwa, h);
		this.r = r;
	}
	public double Objetosc() {
		return Math.PI * r * r * getWysokosc();
	}
	public double Pole() {
		return Math.PI * 2 * r * (getWysokosc() + 2);
	}
	public String toString() {
		return "Walec: " + super.toString() + " [r = " + r + ", h = " + getWysokosc() + "]";
	}
	public boolean obotKwadratu() {
		if (r == getWysokosc()) return true; else return false;
	}
}
