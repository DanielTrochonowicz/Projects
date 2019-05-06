package FabrykaCzesci;

public class SilnikDoAutCieżarowych implements Silnik {

    String name = "Silnik Do Aut Cieżarowych";

    public Silnik wydajSilnik(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new SilnikDoAutCieżarowych();
    }
}
