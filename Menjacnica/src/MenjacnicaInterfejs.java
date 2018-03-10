import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {

	public void dodajKurs(double prodajni, double kupovni, double srednji, GregorianCalendar datum);

	public void obrisiKurs(GregorianCalendar datum);

	public Kurs vratiKurs(GregorianCalendar datum);
}
