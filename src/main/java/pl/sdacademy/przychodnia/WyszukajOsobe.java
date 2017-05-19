package pl.sdacademy.przychodnia;

import java.util.function.Predicate;

public class WyszukajOsobe implements IWyszukajOsobe {

	@Override
	public Osoba znajdz(Osoba[] tablicaOsob, String peselSzukany) {
		Osoba znalezionaOsoba = null ;
	
		Predicate<Osoba> sprawdzPeselCzyJestTenSamCoSzukamy = (osoba) -> {
	 	    return osoba.getPesel().equalsIgnoreCase(peselSzukany);
	 	    		
	 	};
	 
		
		for (int i = 0; i < tablicaOsob.length; i++) {
			if (sprawdzPeselCzyJestTenSamCoSzukamy.test(tablicaOsob[i])){
				znalezionaOsoba = tablicaOsob[i];
			}
		}
		return znalezionaOsoba;
		
	}

}
