package fasadaPattern;

public interface BankomatFacadeInterface {

    boolean identyfikacja(long numerKarty, int pin);
    boolean identyfikacjaWeb(String id, String haslo);
    boolean identyfikacjaKomorka(long nrTelefonu, int pin);
    float sprawdzStanKontaBankomat(long nrKarty);
    float sprawdzStanKontaWeb(long id);
    String wyplacGotowke(int kwota);
    String wplacGotowke(int kwota);
}
