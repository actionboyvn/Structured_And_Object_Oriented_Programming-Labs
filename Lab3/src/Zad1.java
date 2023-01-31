
public class Zad1 {
	public static void main(String[] args) {
		int a = 7;
		int b = 5;
		int c = 9;
		
		int x = a; 
		if (x < b) x = b;
		if (x < c) x = c;
		System.out.println("Najwieksza liczba to "+x);
	}
}
