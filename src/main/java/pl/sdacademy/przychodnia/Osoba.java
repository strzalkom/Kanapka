package pl.sdacademy.przychodnia;

public class Osoba  {

String nazwisko;
public Osoba(String imie, String nazwisko, String pesel) {
	super();
	this.nazwisko = nazwisko;
	this.pesel = pesel;
	this.imie = imie;
}

public String getNazwisko() {
	return nazwisko;
}

public void setNazwisko(String nazwisko) {
	this.nazwisko = nazwisko;
}

public String getPesel() {
	return pesel;
}

public void setPesel(String pesel) {
	this.pesel = pesel;
}

public String getImie() {
	return imie;
}

public void setImie(String imie) {
	this.imie = imie;
}

String pesel;
String imie;

@Override
public String toString() {
	return "Osoba [imie=" + imie + ", nazwisko=" + nazwisko + ", pesel=" + pesel + "]";
}
}
