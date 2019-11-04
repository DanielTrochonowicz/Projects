package klasyWewnetrzne;

public class Klasy {

    public static void main(String[] args) {

        Zewnetrzna z = new Zewnetrzna();
        Zewnetrzna.Wewnetrzna w = z.new Wewnetrzna();

//        z.testDoWew();
        w.testZew();
        z.a = 100;

        Zewnetrzna z2 = new Zewnetrzna();
        Zewnetrzna.Wewnetrzna w2 = z.new Wewnetrzna();
        w2.testZew();

    }
}
