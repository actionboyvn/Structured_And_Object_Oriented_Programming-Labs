package Zad1;

public abstract class Bryla {
	private String nazwa;
	private int h;
	public Bryla() {
		nazwa = "";
		h = 0;
	}
	public Bryla(String nazwa, int h) {
		this.nazwa = nazwa;
		this.h = h;
	}
	public String toString() {
		return "Bryla o nazwie: " + nazwa;
	}
	//Metody abstrakcyjne
	abstract double Objetosc();
	abstract double Pole();
	//gettery
	public int getWysokosc() {
		return h;
	}
}
