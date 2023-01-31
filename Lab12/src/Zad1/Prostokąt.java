package Zad1;

public class Prostokąt extends Figura{
	private boolean jestKwadratem;
	public Prostokąt(String kolor, int a, int b) {
		super(kolor, a, b);
		if (a == b) jestKwadratem = true; else jestKwadratem = false;
	}
	public int Obwód() {
		if (jestKwadratem == false) return 0;
		return (super.getA() + super.getB()) * 2;
	}
	public String toString() {
		return "Prostokąt: kolor = " + super.getKolor() + ", a = " + super.getA() + ", b = " + super.getB()
		+ ", jest kwadratem = " + jestKwadratem;
	}
}
