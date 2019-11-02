package abstrakcjeIinterface;

public class Kwadrat extends Figury implements Interfejs1{

    @Override
    public void rysuj() {
        System.out.println("Rysuj Kwadrat");
    }

    @Override
    public void obliczPole() {
        System.out.println("Obliczam pole Kwadrata");
    }

    @Override
    public void metoda1() {
        // cos konkretnego musza robic metody
    }

    @Override
    public String metoda2() {
        return null;
    }
}
