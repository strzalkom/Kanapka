package pl.sdacademy.lambda.example.model;

public class Jedzenie {


	String nazwa;
	String skladniki;

	public String getSkladniki() {
		return skladniki;
	}

	public void setSkladniki(String skladniki) {
		this.skladniki = skladniki;
	}

	public Jedzenie(String nazwa) {
		this.nazwa = nazwa;
	
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	@Override
	public String toString() {
		return "Jedzenie [nazwa=" + nazwa + ", skladniki=" + skladniki + "]";
	}



}
