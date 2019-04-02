package z1;

import java.util.Scanner;

public class Operator{

	private int cenaPoruke;
	private int cenaMinuta;
	private int cenaMegabajta;
	Scanner s = new Scanner(System.in);
	Scanner z = new Scanner(System.in);
	
	public Operator(int cenaPoruke, int cenaMinuta, int cenaMegabajta) {
		super();
		this.cenaPoruke = cenaPoruke;
		this.cenaMinuta = cenaMinuta;
		this.cenaMegabajta = cenaMegabajta;
	}
	
	public void generisiRacune() {

	}

	public void prikazPravnihLica() {

	}
	
	public void dodajFizickoLice(Korisnik korisnik) {
		System.out.println("1 za prepaid 2 za postpaid");
		int x = s.nextInt();
		if(x==1) {
			korisnik = new Prepaid(korisnik.getIme(), korisnik.getPrezime(), korisnik.getIdentifikator(), 100);
			
		}else if(x==2) {
			korisnik = new Postpaid(korisnik.getIme(), korisnik.getPrezime(), korisnik.getIdentifikator(), null, 0);
			
		}else {
			System.out.println("Pogresan unos");
		}
	}

	public int getCenaPoruke() {
		return cenaPoruke;
	}

	public void setCenaPoruke(int cenaPoruke) {
		this.cenaPoruke = cenaPoruke;
	}

	public int getCenaMinuta() {
		return cenaMinuta;
	}

	public void setCenaMinuta(int cenaMinuta) {
		this.cenaMinuta = cenaMinuta;
	}

	

	public int getCenaMegabajta() {
		return cenaMegabajta;
	}

	public void setCenaMegabajta(int cenaMegabajta) {
		this.cenaMegabajta = cenaMegabajta;
	}

}
