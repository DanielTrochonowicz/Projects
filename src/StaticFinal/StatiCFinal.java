package StaticFinal;

public class StatiCFinal extends  Przyklad{


    public static int wielkość = 10;

    public static final double PI = 3.1415;
    public static final int MAX_VALUE = 100;

    public static void main(String[] args) {

        Przyklad p = new Przyklad();
        String str = p.dajString();
        System.out.println(str);

        Przyklad p1 = new Przyklad();
        System.out.println(p1.getIlosc());

        Przyklad p2 = new Przyklad();
        System.out.println(p2.getIlosc());

        Przyklad p3 = new Przyklad();
        System.out.println(p3.getIlosc());

        Przyklad p4 = new Przyklad();
        System.out.println(p4.getIlosc());

        System.out.println(p1.getIlosc());


        StatiCFinal statiCFinal = new StatiCFinal();
        System.out.println("Wielkość: " + getWielkość());
    }

    public static int getWielkość(){
        return wielkość;
    }
}
