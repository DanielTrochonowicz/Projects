package FabrykaCzesci;

public class SzybyDoAutOsobowych implements Szyby{

    String name = "Szyby Do Aut Osobowych";

    public Szyby wydajSzyby(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new SzybyDoAutOsobowych();
    }
}
