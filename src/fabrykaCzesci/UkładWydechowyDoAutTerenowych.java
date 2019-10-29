package fabrykaCzesci;

public class UkładWydechowyDoAutTerenowych implements UkładWydechowy {

    String name = "Układ Wydechowy Do Aut Terenowych.";

    public UkładWydechowy wydajUkładWydechowy(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new UkładWydechowyDoAutTerenowych();
    }
}
