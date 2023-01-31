import java.util.Random;

public class Zad1 {
	public static void PrintArray(int a[], int n) {
		//Pokaz tablicy
		System.out.printf("Tablica a = ");
		for (int i = 0; i < n; i++)
			System.out.printf("%d ", a[i]);
		System.out.println();
	}
	public static int MinArray(int a[], int n) {
		//Wyszukanie wartosci minimalniej w tablicy
		int Min = a[0];
		for (int i = 1; i < n; i++)
			if (a[i] < Min) Min = a[i];
		return Min;
	}
	public static int ProductOddNumbers(int a[], int n) {
		//Obliczanie iloczynu liczb nieparzystych
		int P = 1;
		for (int i = 0; i < n; i++)
			if (a[i] % 2 != 0) P *= a[i];
		return P;
	}
	public static int CountOddNumbers(int a[], int n) {
		//Obliczanie ile jest liczb nieparzystych
		int Count = 0;
		for (int i = 0; i < n; i++)
			if (a[i] % 2 != 0) Count++;
		return Count;
	}
	public static void main(String[] args) {
		int n = 10;
		Random g = new Random();
		int [] a = new int[n];
		for (int i = 0 ; i < n; i++) {
			a[i] = g.nextInt(30);
		}
		PrintArray(a, n);
		System.out.println("Wartosc minimalna tablicy = " + MinArray(a, n));
		System.out.println("Iloczyn liczb nieparzystych = " + ProductOddNumbers(a, n));
		System.out.println("Liczby nieparzyste = " + CountOddNumbers(a, n));
	}
}
