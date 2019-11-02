package przeciązanieMetod;

public class PrzeciazanieMetod {
    public static void main(String[] args) {

        PrzeciazanieMetod przeciazanieMetod = new PrzeciazanieMetod();

        przeciazanieMetod.metoda01();
        przeciazanieMetod.metoda01(30,20);
        przeciazanieMetod.metoda01(30,20,4);
        przeciazanieMetod.metoda01("Daniel ", 33);


    }

    public void metoda01(){
        System.out.println("test metody");
    }

    public int metoda01(int a, int b){
        System.out.println("test metody dodawaie: " + (a + b));
        return a + b;
    }
    public int metoda01(int a, int b, int c){
        System.out.println("Metoda dodawanie i mnozenie: " + (a + b) * c);
        return (a + b) * c;
    }
    public void metoda01(String a, int b){
        System.out.println("Metoda: " + a + " Wiek: " + b + " lat.");
    }
}
