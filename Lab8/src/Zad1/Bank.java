package Zad1;

public class Bank {
	public static void main(String[] args) {
		Osoba[] Tab = new Osoba[20];
		int n = 7;
		Tab[0] = new Pracownik("Gruba", "246873244", "CEO", 10000, 200);
		Tab[1] = new Pracownik("Kryszyna", "974324327", "kasjer", 5000, 100);
		Tab[2] = new Pracownik("Lazik", "597363454", "menedzer", 8000, 150);
		Tab[3] = new Klient("Le", "857345438", 3);
		Tab[4] = new Klient("Kus", "593472549", 2);
		Tab[5] = new Pracownik();
		Tab[6] = new Klient();
		System.out.println("Tablica osob: ");
		for (int i = 0; i < n; i++)
			System.out.println(Tab[i].toString());
		System.out.println();
		int liczbaKasjerow = 0;
		for (int i = 0; i < n; i++)
			if (Tab[i] instanceof Pracownik) {
				System.out.println("- Pracownik " + Tab[i].nazwisko + ": ");
				((Pracownik)Tab[i]).wyswietlLiczbeNadgodzin();
				if (((Pracownik)Tab[i]).jestKasjerem() == true) liczbaKasjerow++;
			}
		for (int i = 0; i < n; i++)
			if (Tab[i] instanceof Klient) {
				System.out.println("- Klient " + Tab[i].nazwisko + ": ");
				((Klient)Tab[i]).wyswietlLokaty();
			}
		System.out.println("Liczba kasjerow = " + liczbaKasjerow);
		//wyznaczenie osoby zarobila najwiecej
		String stanowisko = "";
		double zyski = 0;
		for (int i = 0; i < n; i++)
			if (Tab[i] instanceof Pracownik) {
				double S = ((Pracownik)Tab[i]).Oblicz();
				if (S > zyski) {
					zyski = S;
					stanowisko = ((Pracownik)Tab[i]).stanowisko;
				}
			}
		System.out.println("Pracownik zarobil najwiecej = " + zyski + ", stanowisko: " + stanowisko);
		
	}
}
