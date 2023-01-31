
class Roslina {
	public double dlugosc;
	// konstruktor 
	public Roslina() {
		dlugosc = 1;
	}
	// metody klasy
	public void Rosnij() {
		if (dlugosc > 0) dlugosc ++;
	}
	public void RosnijDuzo(int a) {
		if (dlugosc > 0) dlugosc += a;
	}
	public void Pokaz() {
		System.out.println("dlugosc rosliny = " + dlugosc);
	}
}
class Zwierzak {
	public static void Zjedz(Roslina x, int a) {
		x.dlugosc -= a;
		if (x.dlugosc < 0) x.dlugosc = 0;
	}
}
public class Main {
	public static void main(String[] args) {
		Roslina X = new Roslina();	
		X.Pokaz();
		
		X.Rosnij();
		X.RosnijDuzo(5);
		X.Pokaz();
		Zwierzak.Zjedz(X, 6);

		X.Pokaz();
	}
}

