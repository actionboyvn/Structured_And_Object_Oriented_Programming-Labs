package Projekt_Main;
import Bukiet.*;
import java.util.Random;
public class Main {
	public static void Pokaz(Bukiet kwiaciarnia[]) {
		for (int i = 0; i < kwiaciarnia.length; i++) {
			System.out.print("Bukiet o indeksie=" + i + ": ");
			kwiaciarnia[i].getStan();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int n = 3;
		Bukiet[] kwiaciarnia = new Bukiet[n];
		Random ran = new Random();
		for (int i = 0; i < n; i++) 
			kwiaciarnia[i] = new Bukiet(false, ran.nextInt(6) + 1);
		
		Pokaz(kwiaciarnia);
		kwiaciarnia[1].jestwKwiaciarni();
		Pokaz(kwiaciarnia);
		kwiaciarnia[1].brakwKwiaciarni();
		Pokaz(kwiaciarnia);
	}
}
