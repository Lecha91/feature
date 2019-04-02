package z1;

public abstract class Korisnik implements OperatorUsluge{

	private String ime;
	private String prezime;
	int identifikator;
	private Operator operator;

	

	public Korisnik(String ime, String prezime, int identifikator) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.identifikator = identifikator;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getIdentifikator() {
		return identifikator;
	}

	public void setIdentifikator(int identifikator) {
		this.identifikator = identifikator;
	}



}
