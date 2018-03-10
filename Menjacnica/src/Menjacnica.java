import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(double prodajni, double kupovni, double srednji, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getDatum().equals(datum)) {
				valute.get(i).getKurs().setKupovni(kupovni);
				valute.get(i).getKurs().setProdajni(prodajni);
				valute.get(i).getKurs().setSrednji(srednji);
			}
		}
	}

	@Override
	public void obrisiKurs(GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getDatum().equals(datum))
				valute.get(i).setKurs(null);
		}
	}

	@Override
	public Kurs vratiKurs(GregorianCalendar datum) {
		Kurs trazeni = new Kurs();
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getDatum().equals(datum)) {
				trazeni.setKupovni(valute.get(i).getKurs().getKupovni());
				trazeni.setProdajni(valute.get(i).getKurs().getProdajni());
				trazeni.setSrednji(valute.get(i).getKurs().getSrednji());
			}
		}
		return trazeni;
	}

}
