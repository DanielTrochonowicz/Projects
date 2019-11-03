package Watki;

public class WatkiSynchronizacja {

    public static void main(String[] args) {

        Pisz pisz = new Pisz();
        Piszarz p1 = new Piszarz(pisz,"To jest");
        Piszarz p2 = new Piszarz(pisz,"synchronizacja");
        Piszarz p3 = new Piszarz(pisz,"wątków");

        try {
            p1.t.join();
            p2.t.join();
            p3.t.join();
        } catch (InterruptedException ex) {
            System.out.println("Przerwano! ");
        }
    }
}

class Pisz{
     void pisz(String message){
        System.out.print("** " + message);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            System.out.println("Przerwano wątek!");
        }
        System.out.println(" **");
    }
}

class Piszarz implements Runnable {

    String message;
    Pisz p;
    Thread t;

    public Piszarz(Pisz p, String message) {
        this.message = message;
        this.p = p;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (p) {
            p.pisz(message);
        }
    }
}