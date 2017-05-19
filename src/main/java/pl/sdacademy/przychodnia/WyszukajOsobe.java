package pl.sdacademy.przychodnia;

import java.util.function.Predicate;

public class WyszukajOsobe implements IWyszukajOsobe {

	@Override
	public Osoba znajdz(Osoba[] tablicaOsob, String peselSzukany) {
	int licznikOperacji = 1;
	
		Osoba znalezionaOsoba = null ;
	licznikOperacji++;
		Predicate<Osoba> sprawdzPeselCzyJestTenSamCoSzukamy = (osoba) -> {
	 	    return osoba.getPesel().equalsIgnoreCase(peselSzukany);
	 	    		
	 	};
	 
		
		for (int i = 0; i < tablicaOsob.length; i++) {
			licznikOperacji++;
			if (sprawdzPeselCzyJestTenSamCoSzukamy.test(tablicaOsob[i])){
				licznikOperacji++;
				znalezionaOsoba = tablicaOsob[i];
				System.out.println(licznikOperacji);
				return znalezionaOsoba;
			}
			licznikOperacji++;
		}
		licznikOperacji++;
	
		return znalezionaOsoba;
		
	}

}
