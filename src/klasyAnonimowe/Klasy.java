package klasyAnonimowe;

public class Klasy {

    public static void main(String[] args) {

        MojInterfejs mojInterfejs = new MojInterfejs() {

            int x = 10;
            @Override
            public void wyswietlTeks(String string) {
                System.out.println(string);
            }
        };

        mojInterfejs.wyswietlTeks("cześć");


    }
}
