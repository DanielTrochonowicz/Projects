package klasyWewnetrzne;

public class Zewnetrzna {

    public int a = 1;
    private int b = 2;

    public static int c = 3;
    public static int d = 4;

    public void testDoWew(){
        Wewnetrzna w = new Wewnetrzna();
        w.testZew();

        System.out.println(a);
    }

    class Wewnetrzna{

        public int a = 100;

        Zewnetrzna z = new Zewnetrzna();

        public void testZew(){
            System.out.println(a);
            System.out.println(z.a);
            System.out.println(b);
            System.out.println(Zewnetrzna.c);
            System.out.println(Zewnetrzna.d);
        }
    }
}
