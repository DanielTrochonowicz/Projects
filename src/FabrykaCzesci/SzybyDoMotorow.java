package FabrykaCzesci;

public class SzybyDoMotorow implements Szyby{

    String name = "Szyby Do Motorow";

    public Szyby wydajSzyby(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new SzybyDoMotorow();
    }
}
