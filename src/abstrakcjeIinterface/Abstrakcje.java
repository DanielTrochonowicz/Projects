package abstrakcjeIinterface;

public class Abstrakcje {

    public static void main(String[] args) {

        Figury f1 = new Trojkat();
        f1.bok = 5;
        f1.rysuj();
        f1.obliczPole();
        System.out.println(f1.komunikat("Trójkąt"));

        Kwadrat kwadrat = new Kwadrat();
        kwadrat.rysuj();
        kwadrat.obliczPole();
        System.out.println(kwadrat.komunikat("Kwadrat"));


        Trojkat trojkat = new Trojkat();
        trojkat.metoda4();

    }
}
