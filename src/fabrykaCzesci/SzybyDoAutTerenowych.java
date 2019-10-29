package fabrykaCzesci;

public class SzybyDoAutTerenowych implements Szyby {

    String name = "Szyby Do Aut Terenowych.";

    public Szyby wydajSzyby(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new SzybyDoAutTerenowych();
    }
}
