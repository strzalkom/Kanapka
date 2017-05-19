package pl.sdacademy.lambda.example;

import java.util.function.Predicate;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import pl.sdacademy.lambda.example.model.Bulka;
import pl.sdacademy.lambda.example.model.Jedzenie;
import pl.sdacademy.lambda.example.model.Kanapka;
import pl.sdacademy.lambda.example.model.Maslo;
import pl.sdacademy.lambda.example.model.Warzywo;

public class Main {

	public static void main(String[] args) {
		IUmiejetnosci umiejetnosciPanaKanapki = new IUmiejetnosci() {
			
			
			@Override
			public Kanapka zrob(Bulka bulka, Maslo maslo, Warzywo warzywo) {
				String elementyKanapki = bulka.getNazwa() + " " + maslo.getNazwa() + " " + warzywo.getNazwa() + " ";
				Kanapka kanapka = new Kanapka("Bulka z pomidorem");
				kanapka.setSkladniki(elementyKanapki);
				return kanapka;

			}
		};
		Bulka kajzerkaBulka = new Bulka("Kajzerka");
		Maslo ekstraMaslo = new Maslo("Ekstra");
		Warzywo pomidorWarzywo = new Warzywo("Pomidor");
		
		Kanapka wiosennaKanapka = umiejetnosciPanaKanapki.zrob(kajzerkaBulka, ekstraMaslo, pomidorWarzywo);
		System.out.println("Kanpapka zrobiona przez Pana Kanapke : " + wiosennaKanapka);
		

		

		IUmiejetnosci umiejetnosciPaniJadzi = (bulka, maslo, warzywo) -> {
			return new Kanapka("?");
		};
		Kanapka wiosennaKanapka2 = umiejetnosciPaniJadzi.zrob(kajzerkaBulka, ekstraMaslo, pomidorWarzywo);
		System.out.println("Pani jadzia zrobi Ci kanapke tak ze : " + wiosennaKanapka2);

		IUmiejetnosci umiejetnosciPanaFranka = (bulka, maslo, warzywo) -> {
			Kanapka kanapka = new Kanapka("studencka");
			kanapka.setSkladniki(bulka + " " + maslo);
			return kanapka;
		};

		Kanapka kanapkaPanaFranka = umiejetnosciPanaFranka.zrob(kajzerkaBulka, new Maslo("zBiedry"), null);
		System.out.println("Kanapka zrobiona przez Pana Franka :" + kanapkaPanaFranka);
        
		
		
		Predicate<Jedzenie> posiadaMasloExtra = (elementKanapki) -> {
			 	    return elementKanapki.getNazwa().equalsIgnoreCase("ekstra")
			 	    		||  elementKanapki.getSkladniki().contains("Ekstra");
	  	
			 	};
			 
			 	Jedzenie[] jedzenie = new Jedzenie[] { kajzerkaBulka, ekstraMaslo, wiosennaKanapka, pomidorWarzywo };
			 	for (int i = 0; i < jedzenie.length; i++) {
			 	    System.out.print(jedzenie[i]);
			 	    if (posiadaMasloExtra.test(jedzenie[i])) {
			 		System.out.print(" Znalezione maslo ekstra");
			 	    }
			 	    System.out.println(" ");
			 
			 	}
			 
			     }
			 
			 }

