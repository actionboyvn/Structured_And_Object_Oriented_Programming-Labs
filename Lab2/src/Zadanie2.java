
public class Zadanie2 {
	public static void main(String[] args) {
		double a = 3; // a = bok prostokata
		double b = 4; // b = bok prostokata
		double pole = a * b;
		double obwod = 2 * (a + b);
		double d = Math.sqrt(a * a + b * b); // d = dlugosc przekatnej prostokata
		System.out.printf("%s%f%n", "a = ", a);
		System.out.printf("%s%f%n", "b = ", b);
		System.out.printf("%s%f%n", "Pole = ", pole);
		System.out.printf("%s%f%n", "Obwod = ", obwod);
		System.out.printf("%s%f%n", "Dlugosc przekatnej prostokata = ", d);
	}
}
