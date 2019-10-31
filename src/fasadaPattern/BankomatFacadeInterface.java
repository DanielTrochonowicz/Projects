package fasadaPattern;

public interface BankomatFacadeInterface {

    boolean identyfikacja(long numerKarty, int pin);
    boolean identyfikacjaWeb(long id, long haslo);
    boolean identyfikacjaKomorka(long nrTelefonu, long pin);
    float sprawdzStanKontaBankomat(long nrKarty);
    float sprawdzStanKontaWeb(long id);
    String wyplacGotowke(int kwota);
    String wplacGotowke(int kwota);
}
