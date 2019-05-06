package FabrykaCzesci;

public class SilnikDoAutOsobowych implements Silnik {

    String name = "Silnik Do Aut Osobowych";

    public Silnik wydajSilnik(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new SilnikDoAutOsobowych();
    }
}
