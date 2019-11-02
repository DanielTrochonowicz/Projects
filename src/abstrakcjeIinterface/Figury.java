package abstrakcjeIinterface;

 abstract public class Figury {

     public static final String KOLOR = "czerwony";

     int bok;

     public abstract void rysuj();

     public abstract void obliczPole();

     public String komunikat(String str){
         return str;
     }
}
