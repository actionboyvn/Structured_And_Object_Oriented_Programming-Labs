package Wielomian;

public class Wielomian {
	public static double Czebyszew(double x, int n) {
		if (n == 0) return 1;
		if (n == 1) return x;
		
		double T2 = 1; // T (i - 2)
		double T1 = x; // T (i - 1)
		double T = 0;  // T (i)
		for (int i = 2; i <= n; i++) {
			T = 2 * x * T1 - T2;
			T2 = T1;
			T1 = T;
		}
		return T;
	}
}
