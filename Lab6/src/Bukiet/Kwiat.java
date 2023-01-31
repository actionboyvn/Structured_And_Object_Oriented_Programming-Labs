package Bukiet;

public class Kwiat {
	private int nazwa;
	//konstruktor domyslny
	public Kwiat() {
		nazwa = -1;
	}
	//konstruktor przeciazony
	public Kwiat(int nazwa) {
		this.nazwa = nazwa;
	}
	//gettery
	public int getNazwa() {
		return nazwa;
	}
	//settery
	public void setNazwa(int nazwa) {
		this.nazwa = nazwa;
	}
}
