package Zad2;
import java.util.Random;
public class Main {
	public static void WypelnicMacierz(Macierz X) {
		Random ran = new Random();
		for (int i = 0; i < X.w; i++)
			for (int j = 0; j < X.k; j++)
				X.macierz[i][j] = ran.nextInt(5);
	}
	public static void main(String[] args) {
		
		Macierz X = new Macierz(2, 3);
		WypelnicMacierz(X);
		Macierz Y = new Macierz(3, 2);
		WypelnicMacierz(Y);
		System.out.println("Macierz X: ");
		X.getStan();
		System.out.println("Macierz Y: ");
		Y.getStan();
		X.mnozyMacierz(Y);
		System.out.println("Macierz X.Y: ");
		X.getStan();
	}
}
