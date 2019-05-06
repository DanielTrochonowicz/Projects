package FabrykaCzesci;

public class UkładNapedowyDoMotorow implements UkładNapedowy {

    String name = "Układ Napedowy Do Motorow";

    public UkładNapedowy wydajUkładNapedowy(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new UkładNapedowyDoMotorow();
    }
}
