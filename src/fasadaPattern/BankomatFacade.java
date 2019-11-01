package fasadaPattern;

public class BankomatFacade implements BankomatFacadeInterface {

    private BankSystem bankSystem;
    private BankLogin bankLogin;

    public BankomatFacade(){
        bankSystem = new BankSystem();
        bankLogin = new BankLogin();
    }

    @Override
    public boolean identyfikacja(long numerKarty, int pin) {
        boolean correct = false;
        correct = bankLogin.identyfikacja(numerKarty, pin);
        return correct;
    }

    @Override
    public boolean identyfikacjaWeb(String id, int haslo) {
        boolean correctWeb = false;
        correctWeb = bankLogin.identyfikacjaWeb(id,  haslo);
        return correctWeb;
    }

    @Override
    public boolean identyfikacjaKomorka(long nrTelefonu, int pin) {
        boolean correctKom = false;
        correctKom = bankLogin.identyfikacjaKomorka(nrTelefonu, pin);
        return correctKom;
    }

    @Override
    public float sprawdzStanKontaBankomat(long nrKarty) {
        float stanKonta = 0.00f;
        stanKonta = bankSystem.sprawdzStanKontaBankomat(nrKarty);
        return stanKonta;
    }

    @Override
    public float sprawdzStanKontaWeb(long id) {
        float stanKonta = 0.00f;
        stanKonta = bankSystem.sprawdzStanKontaWeb(id);
        return stanKonta;
    }

    @Override
    public String wyplacGotowke(int kwota) {
        return bankSystem.wypłacGotowke(kwota);
    }

    @Override
    public String wplacGotowke(int kwota) {
        return bankSystem.wpłacGotowke(kwota);
    }

    @Override
    public String aktywujKarte(long numerKarty) {
        return bankSystem.aktywujKarte(numerKarty);
    }

    @Override
    public String platnoscInternetowa(long zKontaMojego, float kwota) {
        return bankSystem.platnoscInternetowa(zKontaMojego, kwota);
    }

    @Override
    public String wykonajPrzelew(long zKonta, long naKonto, float kwota) {
        return bankSystem.wykonajPrzelew(zKonta, naKonto, kwota);
    }
}
