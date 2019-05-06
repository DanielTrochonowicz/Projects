package FabrykaCzesci;

public class SzybyDoAutCiezarowych implements Szyby {

    String name = "Szyby Do Aut Ciezarowych.";

    public Szyby wydajSzyby(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new SzybyDoAutCiezarowych();
    }
}
