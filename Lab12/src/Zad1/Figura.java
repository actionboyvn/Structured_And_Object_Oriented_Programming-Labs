package Zad1;

public abstract class Figura {
	private String kolor;
	private int a, b;
	public Figura() {
		kolor = "";
		a = b = 0;
	}
	public Figura(String kolor, int a, int b) {
		this.kolor = kolor;
		this.a = a;
		this.b = b;
	}
	abstract int Obwód();
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public String getKolor() {
		return kolor;
	}
	public String toString() {
		return "Figura: a = " + a + ", b = " + b;
	}
}
