package AccountBank;

public class AccountBank {

    public static void main(String[] args) {

        Account saving = new Account();

        saving.withdraw(45);
        System.out.println("Available funds on the account: " + saving.getBalance());

    }
}

class  Account{

    private  int balance;

    public Account(){
        balance = 1000;
    }

    int getBalance(){

        return balance;
    }

    void setbalance(int balance){
        /*
        warunki
         */
        this.balance = balance;
    }

    boolean withdraw (int howMuch){

        if (balance< howMuch) {
            return false;
        }
        else
            setbalance(balance - howMuch);
        return true;
    }

    boolean depositing (int howMuch){

        setbalance(balance + howMuch);
        return true;
    }
}