package Prog;
import Wielomian.Wielomian;
public class Prog {
	public static void main(String[] args) {
		int n = 5;
		double x = 2;
		for (int i = 0; i <= n; i++)
			System.out.println("T"+i+" = "+Wielomian.Czebyszew(x, i));
	}
}
