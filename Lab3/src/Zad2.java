
public class Zad2 {
	public static void main(String[] args) {
		int x = 9;
		int y = 21;
		
		int xx = x;
		int yy = y;
		while (xx != yy) 
			if (xx < yy) xx += x; else yy += y;
		System.out.println("Najmniejsza Wspolna Wielokrotnosc ("+x+", "+y+") to "+xx);
	}
}
