package factory;

import java.net.Socket;

public class Truck implements CarShape {
    @Override
    public void Drive() {
        System.out.println("Produce car type: Truck.");
    }
}
