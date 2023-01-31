import java.util.Random;
class Konto {
	private int nr_konta;
	private double saldo;
	//Konstruktor domyslny
	public Konto() {
		nr_konta = 0;
		saldo = 0;
	}
	//Konstruktor przeciazony
	public Konto(int nr_konta, double saldo) {
		this.nr_konta = nr_konta;
		this.saldo = saldo;
	}
	//getery i setery
	public int getNr_konta() {
		return nr_konta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setNr_konta(int nowyNr_konta) {
		nr_konta = nowyNr_konta;
	}
	public void setSaldo(double noweSaldo) {
		saldo = noweSaldo;
	}
	//Pokaz klasy
	public void getStan() {
		System.out.println("Number konta " + nr_konta + " ma saldo: " + saldo);
	}
}
class Main {
	int n = 5;
	Konto [] Bank = new Konto[n];
	//konstructor
	public Main() {
		Random g = new Random();
		for (int i = 0; i < n; i++)
			Bank[i] = new Konto(g.nextInt(1000), g.nextDouble() * 1000);
	}
	//statyczne metody
	public static void PokazMain(Main K) {
		for (int i = 0; i < K.Bank.length; i++)
			K.Bank[i].getStan();
	}
	public static void ZapytanieMain(Main K) {
		Konto X = new Konto(K.Bank[0].getNr_konta(), K.Bank[0].getSaldo());
		for (int i = 1; i < K.Bank.length; i++)
			if (X.getSaldo() < K.Bank[i].getSaldo()) {
				X.setNr_konta(K.Bank[i].getNr_konta());
				X.setSaldo(K.Bank[i].getSaldo());
			}
		System.out.println("Najwyzsze saldo konto ma number " + X.getNr_konta()
							+ " i saldo = " + X.getSaldo());
	}
}
public class Zad3 {
	public static void main(String[] args) {
		Main K = new Main();
		Main.PokazMain(K);
		Main.ZapytanieMain(K);
	}
}

