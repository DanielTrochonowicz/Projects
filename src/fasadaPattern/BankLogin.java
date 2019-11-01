package fasadaPattern;

public class BankLogin {

    public boolean identyfikacja(long numerkarty, int pin){
        if(numerkarty == 1234567890 && pin == 1234){
            return true;
        } else {
            return false;
        }
    }

    public boolean identyfikacjaWeb(String id, int haslo){
        if (id == "Daniel" && haslo == 1234) {
            return true;
        }else {
            return false;
        }
    }

    public boolean identyfikacjaKomorka(long nrTelefonu, int pin){
        if (nrTelefonu == 505444555 & pin == 1234){
            return true;
        }else {
            return false;
        }
    }
}
