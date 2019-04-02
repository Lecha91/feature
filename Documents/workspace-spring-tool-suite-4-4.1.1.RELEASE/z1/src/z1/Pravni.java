package z1;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pravni extends Korisnik implements OperatorUsluge{

	TarifniPaket tarifnipaket;
	List<Korisnik> l;
	
	public Pravni(String ime, String prezime, int identifikator, TarifniPaket tarifnipaket) {
		super(ime, prezime, identifikator);
		this.tarifnipaket = tarifnipaket;
	}

	
	
	Scanner s = new Scanner(System.in);
	
	public void dodajKorisnika(Korisnik k) {
		k = new Postpaid(s.nextLine(), s.nextLine(), s.nextInt(), tarifnipaket, 0);
		Pattern p = Pattern.compile(String.valueOf(k.identifikator));
		
		tarifnipaket.setBiznis(true);
		
		for(int i=0 ; i<l.size() ; i++) {
			
			Matcher m = p.matcher(l.get(i).toString());
			
			if(m.find()) {
				System.out.println("Uljez nadjen");
				
			}
			
			else if(m.find()==false && i==l.size()-1) {
				l.add(k);
				
			}
			
		}
		
		
		
	}
	
	public String generisiRacun(String racun) {
		
			int ukupno = 0;
			
			if (l.isEmpty() == false) {
				for(int i = 0 ; i < l.size() ; i++) {
					if(i == 3 || (i+3)%4 == 0) {
						int j = Integer.valueOf(String.valueOf(l.get(i)));
						ukupno += j;
						
					}
					
				}
				racun = "Ukupno za uplatu je " + ukupno;
			}
		
		return racun;
		
	}

	public List<Korisnik> getL() {
		return l;
	}

	public void setL(List<Korisnik> l) {
		this.l = l;
	}

	@Override
	public void obaviRazgovor(Korisnik korisnik, int brojMinuta) {
		
		
	}

	@Override
	public void posaljiPoruku(Korisnik korisnik, String tekstPoruke) {
		
		
	}

	@Override
	public void surfujNaInternetu(Korisnik korisnik, int brojMegabajta) {
		
		
	}
}
