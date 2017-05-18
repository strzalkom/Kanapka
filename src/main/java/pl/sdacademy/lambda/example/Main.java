package pl.sdacademy.lambda.example;

import pl.sdacademy.lambda.example.model.Bulka;
import pl.sdacademy.lambda.example.model.Kanapka;
import pl.sdacademy.lambda.example.model.Maslo;

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
		Bulka kajzerka = new Bulka("Kajzerka");
		Maslo ekstra = new Maslo("Ekstra");
		Warzywo pomidor = new Warzywo("Pomidor");
		Kanapka wiosennaKanapka = umiejetnosciPanaKanapki.zrob(kajzerka, ekstra, pomidor);
		System.out.println(wiosennaKanapka.getSkladniki());

		System.out.println("Kanpapka zrobiona przez Pana Kanapke : " + wiosennaKanapka);

		IUmiejetnosci umiejetnosciPaniJadzi = (bulka, maslo, warzywo) -> {
			return new Kanapka("?");
		};
		Kanapka wiosennaKanapka2 = umiejetnosciPaniJadzi.zrob(kajzerka, ekstra, pomidor);
		System.out.println("Pani jadzia zrobi Ci kanapke tak ze : " + wiosennaKanapka2);

		IUmiejetnosci umiejetnosciPanaFranka = (bulka, maslo, warzywo) -> {
			Kanapka kanapka = new Kanapka("studencka");
			kanapka.setSkladniki(bulka + " " + maslo);
			return kanapka;
		};

		Kanapka kanapkaPanaFranka = umiejetnosciPanaFranka.zrob(kajzerka, new Maslo("zBiedry"), null);
		System.out.println("Kanapka zrobiona przez Pana Franka :" + kanapkaPanaFranka);

	}
}
