package Zad1;

public class Lokata {
	int nrLokaty;
	double kwota;
	boolean zerwana;
	public Lokata() {
		nrLokaty = 0;
		kwota = 0;
		zerwana = false;
	}
	public Lokata(int nrLokaty, double kwota, boolean zerwana) {
		this.nrLokaty = nrLokaty;
		this.kwota = kwota;
		this.zerwana = zerwana;
	}
	public String toString() {
		return "	Number lokaty = " + nrLokaty + ", kwota = " + kwota + ", zerwana = " + zerwana;
	}
}
