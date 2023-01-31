package Zad2;

public class Macierz {
	int w, k;
	int[][] macierz;
	public Macierz() {
		w = k = 0;
	}
	public Macierz(int w, int k) {
		this.w = w;
		this.k = k;
		macierz = new int[w][k];
		for (int i = 0; i < w; i++)
			for (int j = 0; j < k; j++) macierz[i][j] = 0;
	}
	public void getStan() {
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < k; j++) System.out.print(macierz[i][j] + " ");
			System.out.println();
		}
	}
	public void mnozyMacierz(Macierz b) {
		if (k != b.w) System.out.println("Nie mozna wykonac mnozenie!"); else {
			int[][] c = new int[w][b.k];
			for (int i = 0; i < w ; i++)
				for (int j = 0; j < b.k; j++) {
					c[i][j] = 0;
					for (int u = 0; u < k; u++) c[i][j] += macierz[i][u] * b.macierz[u][j];
				}
			macierz = c;
			k = b.k;
		}
	}
}
