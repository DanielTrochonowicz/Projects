package fasadaPattern;

public class BankLogin {

    public boolean identyfikacja(long numerkarty, int pin){
        if(numerkarty == 1234567890 && pin == 1234){
            return true;
        } else {
            return false;
        }
    }

    public boolean identyfikacjaWeb(long id, long haslo){
        if (id == 1234567890 && haslo == 1234) {
            return true;
        }else {
            return false;
        }
    }

    public boolean identyfikacjaKomorka(long nrTelefonu, long pin){
        if (nrTelefonu == 505444555 & pin == 1234){
            return true;
        }else {
            return false;
        }
    }
}
