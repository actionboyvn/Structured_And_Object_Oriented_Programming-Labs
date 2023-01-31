package Zad1;

public class Trójkąt extends Figura {
	private int c;
	private boolean jestTrójkątem;
	public Trójkąt() {
		super("", 0, 0);
		c = 0;
		jestTrójkątem = false;
	}
	public Trójkąt(String kolor, int a, int b, int c) {
		super(kolor, a, b);
		this.c = c;
		if (Math.abs(b - c) < a && a < (b + c)) this.jestTrójkątem = true;
		else this.jestTrójkątem = false;
	}
	public int Obwód() {
		if (jestTrójkątem == false) return 0;
		return super.getA() + super.getB() + c;
	}
	public String toString() {
		return "Trójkąt: kolor =  " + super.getKolor() + ", a = " + super.getA() + ", b = " 
			+ super.getB() + ", c = " + c + ", jest trójkątem = " + jestTrójkątem;
	}
}
