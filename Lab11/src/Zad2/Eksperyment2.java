package Zad2;

public class Eksperyment2 {
	public static void Długość(String s) {
		try 
		{
			int X = s.length();
			System.out.println("Długość = " + X);
		}
		catch (NullPointerException e) {
			System.out.println("Exception: String S jest null");
		}
	}
	public static void WyświetlicArray(int[] A, int n) {
		try
		{
			System.out.print("A[] = ");
			for (int i = 0; i < n; i++)
				System.out.print(A[i] + " ");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: Długość tablicy A nie jest prawdziwa");
		}
	}
	public static void main(String[] args) {
		long t1 = System.nanoTime();
		//for (int i = 0; i < 10000; i++)
		Długość(null);
		long t2 = System.nanoTime();
		int[] A = {1, 2, 3};
		int n = 5;
		//for (int i = 0; i < 10000; i++)
		WyświetlicArray(A, n);
		long t3 = System.nanoTime();
		System.out.println("Czas wykonania wyjątku 1: " + (t2 - t1) + " nanosekund");
		System.out.println("Czas wykonania wyjątku 2: " + (t3 - t2) + " nanosekund");
		System.out.println("=> rodzaj obsługiwanego wyjątku wpływa na czas wykonania");
	}
}
