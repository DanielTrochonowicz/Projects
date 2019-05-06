package FabrykaCzesci;

public class SkrzyniaBiegówDoAutCieżarowych implements SkrzyniaBiegów {

    String name = "Skrzynia Biegów Do Aut Cieżarowych.";

    public SkrzyniaBiegów wydajSkrzyniaBiegów(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new SkrzyniaBiegówDoAutCieżarowych();
    }
}
