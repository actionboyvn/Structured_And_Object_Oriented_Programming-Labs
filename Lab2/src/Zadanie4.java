
public class Zadanie4 {
	public static void main(String[] args) {
		double a = 3.14;
		double b = 5;
		double T;
		if (a >= b) 
			T = 2 * a + Math.abs(b) - 1;
		else 
			T = Math.sin(a) - b * b;
		System.out.printf("%s%f%n", "a = ", a);
		System.out.printf("%s%f%n", "b = ", b);
		System.out.printf("%s%f", "T = ", T);
	}
}
