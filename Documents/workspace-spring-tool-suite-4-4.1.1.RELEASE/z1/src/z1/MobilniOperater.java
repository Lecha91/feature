package z1;

public class MobilniOperater {

	
	
	public static void main(String[] args) {
		
		
		Operator o = new Operator(3, 5, 10);
		
		Korisnik k = new Prepaid("Mitar", "Miric", 123, 100);
		
		o.dodajFizickoLice(k);
		k.setOperator(o);
		
		k.surfujNaInternetu(k, 10);
		
		System.out.println(k.getIme());
		
		
		
	}

}
