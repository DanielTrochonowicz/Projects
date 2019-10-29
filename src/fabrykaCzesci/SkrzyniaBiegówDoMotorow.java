package fabrykaCzesci;

public class SkrzyniaBiegówDoMotorow implements SkrzyniaBiegów {

    String name = "Skrzynia Biegów Do Motorow.";

    public SkrzyniaBiegów wydajSkrzyniaBiegów(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new SkrzyniaBiegówDoMotorow();
    }
}
