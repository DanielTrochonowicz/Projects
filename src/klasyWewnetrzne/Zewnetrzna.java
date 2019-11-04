package klasyWewnetrzne;

public class Zewnetrzna {

    public int a = 1;
    private int b = 2;
    private int x = 2;

    public static int c = 3;
    public static int d = 4;

    public void testDoWew(){
        Wewnetrzna w = new Wewnetrzna();
        w.testZew();

        System.out.println(a);

        System.out.println(Wewnetrzna2.d);
        Wewnetrzna2 wewnetrzna2 = new Wewnetrzna2();
        wewnetrzna2.tesNaZew();
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

    static class Wewnetrzna2{

        public Wewnetrzna2(){}
        public Wewnetrzna2(String s){}
        public Wewnetrzna2(String s, int s2){}


        public int a = 1;
        private int b = 2;

        public static int c = 9;
        private static int d = 4;

        public void tesNaZew(){
            Zewnetrzna zewnetrzna = new Zewnetrzna();
            System.out.println(Wewnetrzna2.d);
            System.out.println(zewnetrzna.x);
            System.out.println(zewnetrzna.a);
            System.out.println(Zewnetrzna.c);
        }

    }
}
