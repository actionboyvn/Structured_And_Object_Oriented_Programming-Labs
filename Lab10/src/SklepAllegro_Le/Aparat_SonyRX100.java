package SklepAllegro_Le;
import Dostarczenie.*;
import Płatność.*;

public class Aparat_SonyRX100 extends Produkt{
	public Aparat_SonyRX100() {
		dostarczenie = new Kurier();
		setMetodaDostarczenia("kurier");

		płatność = new KartaPłatnicza();
		setMetodaPłatności("karta płatnicza");
	}
	public void WyswietlInfo() {
		System.out.println("Szczegóły zamówienia: ");
		System.out.println("	Produkt: Aparat Sony RX100");
		System.out.println("	Metoda dostarczenia: " + getMetodaDostarczenia());
		System.out.println("	Metoda płatności: " + getMetodaPłatności());
	}
}
