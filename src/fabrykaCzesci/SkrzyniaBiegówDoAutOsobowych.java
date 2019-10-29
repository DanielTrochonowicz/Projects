package fabrykaCzesci;

public class SkrzyniaBiegówDoAutOsobowych implements SkrzyniaBiegów {

    String name = "Skrzynia Biegów Do Aut Osobowych.";

    @Override
    public SkrzyniaBiegów wydajSkrzyniaBiegów(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new SkrzyniaBiegówDoAutOsobowych();
    }
}
