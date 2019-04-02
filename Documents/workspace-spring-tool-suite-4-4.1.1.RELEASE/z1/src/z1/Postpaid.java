package z1;

public class Postpaid extends Korisnik implements OperatorUsluge {
	TarifniPaket tarifnipaket;
	int stanje;
	public Postpaid(String ime, String prezime, int identifikator, TarifniPaket tarifnipaket, int stanje) {
		super(ime, prezime, identifikator);
		this.tarifnipaket = tarifnipaket;
		this.stanje = stanje;
	}

	@Override
	public void obaviRazgovor(Korisnik korisnik, int brojMinuta) {
		
		
		if(tarifnipaket.getBrojMinuta() >= brojMinuta) {
			tarifnipaket.setBrojMinuta(tarifnipaket.getBrojMinuta() - brojMinuta);
			
		}else {
			tarifnipaket.getBrojMinuta(); 
		}
		
	}

	@Override
	public void posaljiPoruku(Korisnik korisnik, String tekstPoruke) {

		if(tarifnipaket.isPoruke_dodatak() == true) {
			
			
			
		}else {
			
			if(tarifnipaket.getBrojPoruka() > 0) {
				
				tarifnipaket.setBrojPoruka(tarifnipaket.getBrojPoruka()-1);
				
			}else {
				stanje += getOperator().getCenaPoruke();
			}
			
		}
		
	}

	@Override
	public void surfujNaInternetu(Korisnik korisnik, int brojMegabajta){
		if(tarifnipaket.isInternet_dodatak() == true) {
			
			
			
		}else {
			if(tarifnipaket.getBrojMb() > tarifnipaket.brojMb) {
				
				tarifnipaket.setBrojMb(tarifnipaket.getBrojMb()-brojMegabajta);
			}else {
				brojMegabajta = brojMegabajta - tarifnipaket.getBrojMb();
				stanje = brojMegabajta*getOperator().getCenaMegabajta();
				tarifnipaket.setBrojMb(0);
			}
			
		}
		
		
	}

}
