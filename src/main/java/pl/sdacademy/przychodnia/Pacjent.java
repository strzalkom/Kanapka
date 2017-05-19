package pl.sdacademy.przychodnia;

import java.util.Date;

public class Pacjent extends Osoba{
	 String choroba;
	 Date dataWypisu;
	 Date dataWpisu;

	public Pacjent(String imie, String nazwisko, String pesel){
		

		super(imie, nazwisko, pesel);
	}
 
	
		@Override
		public String toString() {
			return "Osoba [imie=" + imie + ", nazwisko=" + nazwisko + ", pesel= " + pesel+"]";
		}
		
	}

