package KontoBankowe;

public class KontoBankowe {

    public static void main(String[] args) {

        Konto oszczendnosciowe = new Konto();

        oszczendnosciowe.wypłac(45);

        System.out.println(" dostepne srodki na koncie: " + oszczendnosciowe.getSaldo());

    }
}

class  Konto{

    private  int saldo;

    public Konto(){
        saldo = 1000;
    }



    int getSaldo(){

        return saldo;
    }

    void setSaldo(int saldo){
        /*
        warunki
         */
        this.saldo = saldo;
    }

    boolean wypłac (int ile){

        if (saldo< ile) {
            return false;
        }
        else
            setSaldo(saldo - ile);
        return true;
    }

    boolean wpłac (int ile){

        setSaldo(saldo + ile);
        return true;
    }
}