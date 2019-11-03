package Watki;

public class Watki {

    public static void main(String[] args) {

        NowyWatek nw1 = new NowyWatek("Jeden");
        NowyWatek nw2 = new NowyWatek("Dwa");
        NowyWatek nw3 = new NowyWatek("Trzy");
        NowyWatek nw4 = new NowyWatek("Cztery");

        System.out.println("WĄTEK " + nw1.t.getName() + " " + nw1.t.isAlive());
        System.out.println("WĄTEK " + nw2.t.getName() + " " + nw2.t.isAlive());
        System.out.println("WĄTEK " + nw3.t.getName() + " " + nw3.t.isAlive());
        System.out.println("WĄTEK " + nw4.t.getName() + " " + nw4.t.isAlive());

        try {
            nw1.t.join();
            nw2.t.join();
            nw3.t.join();
            nw4.t.join();
//            System.out.println("Usypiam wątek głowny.");
//            Thread.sleep(9000);
//            System.out.println("Wznawiam wątek głowny");
        } catch (InterruptedException e) {
            System.out.println("Przerwano wątek głowny");
        }
        System.out.println("Zakończono wykonywanie wątku głównego.");


        System.out.println("WĄTEK " + nw1.t.getName() + " " + nw1.t.isAlive());
        System.out.println("WĄTEK " + nw2.t.getName() + " " + nw2.t.isAlive());
        System.out.println("WĄTEK " + nw3.t.getName() + " " + nw3.t.isAlive());
        System.out.println("WĄTEK " + nw4.t.getName() + " " + nw4.t.isAlive());
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