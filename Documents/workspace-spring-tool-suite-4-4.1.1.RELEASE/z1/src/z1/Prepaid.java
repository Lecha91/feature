package z1;

public class Prepaid extends Korisnik implements OperatorUsluge{

	int kredit;
	
	
	
	public Prepaid(String ime, String prezime, int identifikator, int kredit) {
		super(ime, prezime, identifikator);
		this.kredit = kredit;
	}

	
	
	
	@Override
	public void posaljiPoruku(Korisnik korisnik, String tekstPoruke) {
		
		if(getOperator().getCenaPoruke() <= kredit) {
			kredit-= getOperator().getCenaPoruke();
			System.out.println("Nedovoljno kredita");
		}
		
	}

	@Override
	public void surfujNaInternetu(Korisnik korisnik, int brojMegabajta) {
		
		if(getOperator().getCenaMegabajta()*brojMegabajta <= kredit) {
			kredit -= getOperator().getCenaMegabajta()*brojMegabajta;
			
		}else {
			System.out.println("Nedovoljno kredita");
		}
	}

	public void dodajKredit(int uplata) {
		kredit += uplata;
		

	}

	public int getKredit() {
		return kredit;
	}





	public void setKredit(int kredit) {
		this.kredit = kredit;
	}





	@Override
	public void obaviRazgovor(Korisnik korisnik, int brojMinuta) {
		if(getOperator().getCenaMinuta()*brojMinuta <= kredit) {
			kredit -= getOperator().getCenaMinuta()*brojMinuta;
		}else {
			System.out.println("Nedovoljno kredita");
		}

	}





	

}
