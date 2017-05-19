package pl.sdacademy.przychodnia;

public class Lekarz extends Osoba {
	String specjalizacja;
	

	public Lekarz(String imie, String nazwisko, String pesel) {
		super(imie, nazwisko, pesel);
	}
		@Override
		public String toString() {
			return "Osoba [imie=" + imie + ", nazwisko=" + nazwisko + ", pesel= " + pesel+"]";
		}
		
	}
		
	

		


