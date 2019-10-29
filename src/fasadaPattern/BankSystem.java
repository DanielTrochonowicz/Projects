package fasadaPattern;

public class BankSystem {

    public float sprawdzStanKontaBankomat(long nrKarty){
        if (nrKarty == 1234567890){
            return 356.78f;
        } else {
            return 0.00f;
        }
    }

    public String wypłacGotowke(int kwota){
        return "Z Konta wypłacono: " + kwota + " PLN.";
    }

    public String aktywujKarte(long numerKarty){
        return "Karta " + numerKarty + " aktywna.";
    }

    public void platnoscWeb(){
        //platnosc przez web
    }

    public void platnoscInternetowa(){
        //platnosc karta przez internet
    }

    public void wykonajPrzelew(long zKonta, long naKonto, float kwota){
        // przelej pieniądze
    }
}
