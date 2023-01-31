
public class Zad2 {
	public static void main(String[] args) {
		//Utworzenie tablicy dwuwymiarowej
		int n = 7;
		int [][] a = new int[n][];
		for (int i = 0; i < a.length; i++) 
			a[i] = new int[i + 1];
		
		//Wypelnienie tablicy
		int count = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = count;
				count++;
			}
		}
		
		//Pokaz tablicy
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++)
				System.out.printf("%d ", a[i][j]);
			System.out.println();
		}
		
	}
}
