package pl.sdacademy.lambda.example.model;

public class Kanapka extends Jedzenie{

	public Kanapka(String nazwa) {
		super(nazwa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Kanapka [nazwa=" + nazwa + ", skladniki=" + skladniki + "]";
	}
	
}
