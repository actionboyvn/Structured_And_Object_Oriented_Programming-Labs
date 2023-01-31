package Zad2;

public class Dzielenie {
	public static void Dzielic(int a, int b){
		try {
			double c = a / b;
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			System.out.println("Nie może wykonać dzielenia ponieważ / przez 0");
		}
	}
	public static void main(String[] args){
		Dzielic(5, 0);
		
	}
}
