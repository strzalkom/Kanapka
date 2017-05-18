package pl.sdacademy.lambda.example.model;

public class Jedzenie {
@Override
	public String toString() {
		return "Jedzenie [nazwa=" + nazwa + ", skladniki=" + skladniki + "]";
	}

String nazwa;
String skladniki;
public String getSkladniki() {
	return skladniki;
}

public void setSkladniki(String skladniki) {
	this.skladniki = skladniki;
}

public Jedzenie(String nazwa) {
	// TODO Auto-generated constructor stub
}

public String getNazwa() {
	return nazwa;
}

public void setNazwa(String nazwa) {
	this.nazwa = nazwa;
}
}
