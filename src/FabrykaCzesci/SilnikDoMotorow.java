package FabrykaCzesci;

public class SilnikDoMotorow implements Silnik {

    String name = "Silnik Do Motorow.";

    public Silnik wydajSilnik(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new SilnikDoMotorow();
    }
}
