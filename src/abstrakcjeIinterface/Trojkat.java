package abstrakcjeIinterface;

public class Trojkat extends Figury implements Interfejs2 {

    @Override
    public void rysuj() {
        System.out.println("Rysuj Trojkąt");
    }

    @Override
    public void obliczPole() {
        System.out.println("Obliczam pole trojkąta");
    }

    @Override
    public void metoda3() {
        System.out.println("Metoda 3 z Interfejsu 2");
    }

    @Override
    public void metoda4() {
        System.out.println("Metoda 4 z klasy");
    }
}
