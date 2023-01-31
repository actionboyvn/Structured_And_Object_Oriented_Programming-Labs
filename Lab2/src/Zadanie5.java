
public class Zadanie5 {
	public static void main(String[] args) {
		double a = 3;
		double b = 4;
		double c = 5;
		System.out.printf("%s%f%n", "a = ", a);
		System.out.printf("%s%f%n", "b = ", b);
		System.out.printf("%s%f%n", "c = ", c);
		if (Math.abs(b - c) < a && a < (b + c)) {
			double p = (a + b + c) / 2;
			double pole = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			System.out.printf("%s%f", "Pole trojkata = ", pole);
		} else
			System.out.printf("%s", "a, b, c nie sa bokami trojkata");
	}
}
