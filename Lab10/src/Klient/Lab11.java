package Klient;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Dostarczenie.OdbiórOsobiście;
import Płatność.BLIK;
import SklepAllegro_Le.Aparat_SonyRX100;
import SklepAllegro_Le.Telefon_iPhone12;

public class Lab11 {
	static Zamówienie[] A = new Zamówienie[10];
	static int n = 0; // ilość zamówień
	public static void ZapiszDoPliku() {
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("zamówienia.ser"))) 
		{
			os.writeObject(new Zamówienie("Telefon iPhone 12", "kurier", "karta płatnicza"));
			os.writeObject(new Zamówienie("Aparat Sony RX100", "odbiór osobiście", "BLIK code"));
			os.writeObject(new Zamówienie("Telefon iPhone 12", "odbiór osobiście", "karta płatnicza"));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void OdczytajZPliku(){
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("zamówienia.ser")))
		{
			while (true) {
				try {
					Object obj = is.readObject();
					A[n++] = (Zamówienie) obj;
				}
				catch (EOFException e) {
					break;
				}
			}
			
		}
		catch (IOException | ClassNotFoundException e) { 
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException {
		//ZapiszDoPliku();
		OdczytajZPliku();
		System.out.println("Ilość zamówień: " + n);
		for (int i = 0; i < n; i++) 
			System.out.println(" + Zamówienie " + (i+1) + ": " + A[i].toString());
		
	}
}
