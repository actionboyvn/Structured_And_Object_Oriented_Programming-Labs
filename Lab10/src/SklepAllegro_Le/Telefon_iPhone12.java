package SklepAllegro_Le;
import Dostarczenie.*;
import Płatność.*;

public class Telefon_iPhone12 extends Produkt{
	public Telefon_iPhone12() {
		dostarczenie = new Kurier();
		setMetodaDostarczenia("kurier");

		płatność = new KartaPłatnicza();
		setMetodaPłatności("karta płatnicza");
	}
	public void WyswietlInfo() {
		System.out.println("Szczegóły zamówienia: ");
		System.out.println("	Produkt: Telefon iPhone 12");
		System.out.println("	Metoda dostarczenia: " + getMetodaDostarczenia());
		System.out.println("	Metoda płatności: " + getMetodaPłatności());
	}
}
