package Zad1;

public class Rysunki {
	public static void main(String[] args) { 
		Bryla[] Tab = new Bryla[20];
		int n = 4;
		
		Tab[0] = new Prostopadloscian();
		Tab[1] = new Walec();
		Tab[2] = new Prostopadloscian("Pudelko", 5, 3, 4);
		Tab[3] = new Walec("Kubek", 4, 2);

		double max_pole = 0;
		int pozycja = 0;
		for (int i = 0; i < n; i++)
			if (Tab[i] instanceof Prostopadloscian) {
				if (((Prostopadloscian)Tab[i]).Pole() > max_pole) {
					max_pole = ((Prostopadloscian)Tab[i]).Pole();
					pozycja = i;
				} 
			} else if (Tab[i] instanceof Walec) {
				if (((Walec)Tab[i]).Pole() > max_pole) {
					max_pole = ((Walec)Tab[i]).Pole();
					pozycja = i;
				}
			}
		System.out.printf("%s%.2f %s %d", "Bryla ma najwieksze pole = ", max_pole, ", indeks = ", pozycja);
		if (Tab[pozycja] instanceof Prostopadloscian) System.out.println(", to jest Prostopadloscian"); else
			if (Tab[pozycja] instanceof Walec) System.out.println(", to jest Walec");
		System.out.println("");
		
		for (int i = 0; i < n; i++) 
			System.out.println(Tab[i].toString());
		System.out.println();
		
		int nr_szescianow = 0, nr_walcow_kwadratu = 0;
		for (int i = 0; i < n; i++) 
			if (Tab[i] instanceof Walec) {
				System.out.println(Tab[i].toString());
				if (((Walec)Tab[i]).obotKwadratu() == true) nr_walcow_kwadratu++;
			}
		System.out.println();
		
		for (int i = 0; i < n; i++)
			if (Tab[i] instanceof Prostopadloscian) {
				System.out.println(Tab[i].toString());
				if (((Prostopadloscian)Tab[i]).jestSzescianem() == true) nr_szescianow++;
			}
		System.out.println();
		
		System.out.println("Liczba szescianow = " + nr_szescianow);
		System.out.println("Liczba walcow powstalych przez obrot kwadratu = " + nr_walcow_kwadratu);
		
			
	}	
}
