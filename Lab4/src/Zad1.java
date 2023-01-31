
public class Zad1 {
	public static double S(int n, double x) {
		
		if (x < -1) return 2.0 / 3.0;
		
		if (-1 <= x && x <= 1) return Math.sin(x) + x * x;
		
		double suma = 0;
		double factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
			suma += (x + i) / factorial;
		}
		return suma;
	}
	public static void main(String[] args) {
		System.out.println(S(1, -5));
	}
}
