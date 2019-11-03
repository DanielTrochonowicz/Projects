package Watki;

public class Watki {

    public static void main(String[] args) {

        new NowyWatek("Jeden");
        new NowyWatek("Dwa");
        new NowyWatek("Trzy");
        new NowyWatek("Cztery");

        try {
            System.out.println("Usypiam wątek głowny.");
            Thread.sleep(9000);
            System.out.println("Wznawiam wątek głowny");
        } catch (InterruptedException e) {
            System.out.println("Przerwano wątek głowny");
        }
        System.out.println("Zakończono wykonywanie wątku głównego.");
    }
}


class NowyWatek implements Runnable{

    private String name;
    Thread t;
    NowyWatek(String nazwa){
        this.name = nazwa;
       t = new Thread(this, nazwa);
       t.start();
    }
    @Override
    public void run() {
        System.out.println("Uruchomiono watek potomny" + " " +  name);
        try {
            System.out.println("Watek potomny " + name + " uśpiony.");
            Thread.sleep(2000);
            System.out.println("Watek potomny " + name + " wznowiony.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Zakończono działanie wątku potomnego " + name);
    }
}