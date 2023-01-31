
public class Zad3 {
	public static double Trening(int a, double b) {
		double Dystans = a * b;
		return Dystans;
	}
	public static void main(String[] args) {
		int numer = 2;
		switch (numer) {
		case 1: {
			System.out.println("Poniedzialek"); break;
		}
		case 2: {
			System.out.println("Wtorek"); 
			int k = 10000; // liczba krokow
			double d = 1.2; // dlugosc jednego kroku
			System.out.println("Dystans treningu to " + Trening(k, d));
			break;
		}
		case 3: {
			System.out.println("Sroda"); break;
		}
		case 4: {
			System.out.println("Czwartek"); break;
		}
		case 5: {
			System.out.println("Piatek"); break;
		}
		case 6: {
			System.out.println("Sobota"); break;
		}
		case 7: {
			System.out.println("Niedziela"); break;
		}
		default: {
			System.out.println("Nie jest dniem tygodnia");
		}
		}
	}
}
