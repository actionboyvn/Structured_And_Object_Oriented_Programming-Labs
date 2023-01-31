package SklepAllegro_Le;
import Dostarczenie.*;
import Płatność.*;

public abstract class Produkt {
	protected Dostarczenie dostarczenie;
	protected Płatność płatność;
	
	private String metodaDostarczenia;
	private String metodaPłatności;
	
	public void WykonajDostarczenie() {
		dostarczenie.UzyskajInformacje();
	}
	public void UstawMetodęDostarczenia(Dostarczenie dos, String info) {
		this.dostarczenie = dos;
		this.metodaDostarczenia = info;
	}
	
	public void WykonajPłatność() {
		płatność.DokonajPłatności();
	}
	public void UstawMetodęPłatności(Płatność płat, String info) {
		this.płatność = płat;
		this.metodaPłatności = info;
	}
	
	abstract public void WyswietlInfo();
	
	public String getMetodaDostarczenia() {
		return this.metodaDostarczenia;
	}
	public void setMetodaDostarczenia(String s) {
		this.metodaDostarczenia = s;
	}
	public String getMetodaPłatności() {
		return this.metodaPłatności;
	}
	public void setMetodaPłatności(String s) {
		this.metodaPłatności = s;
	}
}
