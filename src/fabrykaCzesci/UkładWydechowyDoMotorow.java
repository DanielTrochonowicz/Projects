package fabrykaCzesci;

public class UkładWydechowyDoMotorow implements UkładWydechowy {

    String name = "Układ Wydechowy Do Motorow.";

    public UkładWydechowy wydajUkładWydechowy(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new UkładWydechowyDoMotorow();
    }
}
