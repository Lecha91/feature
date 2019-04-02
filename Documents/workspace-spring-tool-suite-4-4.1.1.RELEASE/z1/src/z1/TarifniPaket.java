package z1;

/**
 * @author developers6
 *
 */
public class TarifniPaket {

	boolean biznis;
	boolean internet_dodatak;
	boolean poruke_dodatak;
	int brojMb;
	int brojMinuta;
	int brojPoruka;
	public boolean isBiznis() {
		return biznis;
	}
	public void setBiznis(boolean biznis) {
		this.biznis = biznis;
	}
	public boolean isInternet_dodatak() {
		return internet_dodatak;
	}
	public void setInternet_dodatak(boolean internet_dodatak) {
		this.internet_dodatak = internet_dodatak;
	}
	public boolean isPoruke_dodatak() {
		return poruke_dodatak;
	}
	public void setPoruke_dodatak(boolean poruke_dodatak) {
		this.poruke_dodatak = poruke_dodatak;
	}
	public int getBrojMb() {
		return brojMb;
	}
	public void setBrojMb(int brojMb) {
		this.brojMb = brojMb;
	}
	public int getBrojMinuta() {
		return brojMinuta;
	}
	public TarifniPaket(boolean biznis, boolean internet_dodatak, boolean poruke_dodatak, int brojMb, int brojMinuta,
			int brojPoruka) {
		super();
		this.biznis = biznis;
		this.internet_dodatak = internet_dodatak;
		this.poruke_dodatak = poruke_dodatak;
		this.brojMb = brojMb;
		this.brojMinuta = brojMinuta;
		this.brojPoruka = brojPoruka;
	}
	public void setBrojMinuta(int brojMinuta) {
		this.brojMinuta = brojMinuta;
	}
	public int getBrojPoruka() {
		return brojPoruka;
	}
	public void setBrojPoruka(int brojPoruka) {
		this.brojPoruka = brojPoruka;
	}
	
}
