package lambda;

public class Lambda {
    public static void main(String[] args) {

        // () -> {};  lambda
        // (int a, int b) -> a + b;
        // (a, b) -> a + b;
        //() -> a + b;
        //() -> {return a + b;};
        //() -> System.out.println("Coś);
        // int s = (a, b) -> a + b;

        // w interface lambda moze byc tylko jedna metoda abstrakcyjna inaczej nie zrobimy lambdy
        // lambda po

        KalkulatorInterface dodajemy = (a, b) -> a + b;
        KalkulatorInterface odejmujemy = (a, b) -> a - b;
        KalkulatorInterface mnozenie = (a, b) -> a * b;

        System.out.println(dodajemy.oblicz(4,4));
        System.out.println(odejmujemy.oblicz(4,2));
        System.out.println(mnozenie.oblicz(2,4));

        KalkulatorInterface k = new KalkulatorInterface() {
            @Override
            public int oblicz(int a, int b) {
                return a + b;
            }
        };

        KalkulatorInterface k2 = new KalkulatorInterface() {
            @Override
            public int oblicz(int a, int b) {
                return a - b;
            }
        };

    }
}
