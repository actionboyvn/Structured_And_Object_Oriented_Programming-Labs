package Bukiet;
import Florysta.*;
public class Bukiet {
	private Kwiat kwiat = null;
	private boolean dostepny;
	//konstruktor domyslny
	public Bukiet() {
		dostepny = false;
		kwiat = new Kwiat();
	}
	//konstruktor przeciazony
	public Bukiet(boolean dostepny, int nazwa) {
		this.dostepny = dostepny;
		kwiat = new Kwiat(nazwa);
	}
	//gettery
	public Kwiat getKwiat() {
		return kwiat;
	}
	public boolean getDostepny() {
		return dostepny;
	}
	public void getStan() {
		System.out.println("kwiat = " + kwiat.getNazwa() + " dostepny = " + dostepny);
	}
	//settery
	public void setKwiat(int nazwa) {
			kwiat.setNazwa(nazwa);
	}
	public void setDostepny(boolean dostepny) {
		this.dostepny = dostepny;
	}
	//metody
	public void jestwKwiaciarni() {
		Florysta.tworzBukiet(this);
	}
	public void brakwKwiaciarni() {
		Florysta.sprzedajBukiet(this);
	}
}
