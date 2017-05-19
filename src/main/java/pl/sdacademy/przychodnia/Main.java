package pl.sdacademy.przychodnia;

import java.util.function.Predicate;

import pl.sdacademy.lambda.example.model.Jedzenie;

public class Main {

	public static void main(String[] args) {
	
		

		
		
		Osoba piotrek = new Osoba ("Piotrek", "Nowak", "87041102451");
		Osoba madzia = new Osoba ("Madzia", "Kowalska", "98011198501");
		Osoba konrad = new Osoba ("Konrad", "Kuslewicz", "96082206123");
        Osoba andrzejek = new Osoba("Andrzej", "Wojtek", "123123123123");
        Osoba wojtus = new Osoba ("Wojciech","Polski", "1111111111111");
		
        
        Osoba[] tablicaOsob = new Osoba[] {piotrek, madzia, konrad,andrzejek, wojtus};
		WyszukajOsobe wyszukiwarka = new WyszukajOsobe();
		
		
		System.out.println(wyszukiwarka.znajdz(tablicaOsob, "87041102451"));
			Predicate<Osoba> pesel = (osoba) -> {
				 	    return osoba.getNazwisko().equalsIgnoreCase("Nowak");
				 	    		
				 	};
				 
		}
}