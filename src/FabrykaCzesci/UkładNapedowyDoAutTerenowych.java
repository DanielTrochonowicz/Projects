package FabrykaCzesci;

public class UkładNapedowyDoAutTerenowych implements UkładNapedowy {

    String name = "Układ Napedowy Do Aut Terenowych.";

    public UkładNapedowy wydajUkładNapedowy(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new UkładNapedowyDoAutTerenowych();
    }
}
