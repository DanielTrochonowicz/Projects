package FabrykaCzesci;

public class SilnikDoAutTerenowych implements Silnik {

    String name = "Silnik Do Aut Terenowych";

    public Silnik wydajSilnik(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new SilnikDoAutTerenowych();
    }
}
