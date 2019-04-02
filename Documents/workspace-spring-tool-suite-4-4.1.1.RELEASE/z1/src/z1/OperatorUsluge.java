package z1;

interface OperatorUsluge {

	public void obaviRazgovor(Korisnik korisnik, int brojMinuta);

	public void posaljiPoruku(Korisnik korisnik, String tekstPoruke);

	public void surfujNaInternetu(Korisnik korisnik, int brojMegabajta);

}
