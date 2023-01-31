
public class Zad4 {
	public static double dystans(double x1, double y1, double x2, double y2) {
		double D = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		return D;
	}
	public static void druk(int p) {
		for (int i = 0; i <= 2 * p + 1; i++) {
			for (int j = 0; j <= 2 * p + 1; j++) {
				if (dystans(i, j, p, p) <= p) System.out.printf("%s", "OO"); else
					System.out.printf("%s", "  ");
			}
			System.out.printf("%n");
		}
	}
	public static void main(String[] args) {
		int p = 20;
		System.out.println("Dlugosc promienia kola : "+p);
		druk(p);
	}
}
