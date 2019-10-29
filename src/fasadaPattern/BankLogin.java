package fasadaPattern;

public class BankLogin {

    public boolean identyfikacja(long numerkarty, int pin){
        if(numerkarty == 1234567890 && pin == 1234){
            return true;
        } else {
            return false;
        }
    }

    public void identyfikacjaWeb(String id, String haslo){

    }
    public void identyfikacjaKomorka(){

    }
}
