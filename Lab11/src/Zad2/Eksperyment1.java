package Zad2;

import java.io.*;
class IO {
	
	public static void OtwórzPlik(String Plik) throws FileNotFoundException{
		BufferedReader br = new BufferedReader(new FileReader(Plik));
	}
	
	public static void OtwórzPlik2(String Plik) {
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(Plik));
		}
		catch (IOException e) {
			System.out.println("Exception: Nie może otworzyć pliku!");
		}
	}
}
public class Eksperyment1 {
	public static void main(String[] args) throws FileNotFoundException {
		long t1 = System.nanoTime();
		//for (int i = 0; i < 10000; i++)
		try {
			IO.OtwórzPlik("IO.txt");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		long t2 = System.nanoTime();
		//for (int i = 0; i < 10000; i++)
		IO.OtwórzPlik2("IO.txt");
		long t3 = System.nanoTime();
		System.out.println("Czas wykonania metodę z Throws:    " + (t2 - t1) + " nanosekund");
		System.out.println("Czas wykonania metodę z Try-Catch: " + (t3 - t2) + " nanosekund");
	}
}
