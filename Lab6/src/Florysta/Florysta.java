package Florysta;
import Bukiet.*;
public class Florysta {
	public static void tworzBukiet(Bukiet X) {
		X.setDostepny(true);
	}
	public static void sprzedajBukiet(Bukiet X) {
		X.setDostepny(false);
	}
}
