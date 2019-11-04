package klasyAnonimowe;

public class Klasy {

    public static void main(String[] args) {

        MojInterfejs m1 = new MojInterfejs() {

            public int x = 10;
            @Override
            public void wyswietlTeks(String pStr) {
                System.out.println(pStr);
                System.out.println(x);
            }
            public void metoda2(){

            }
        };

        m1.wyswietlTeks("cześć");
        System.out.println(m1.liczba);


    }
}
