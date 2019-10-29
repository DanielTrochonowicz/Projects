package computer;

public class Application {
    public static void main(String[] args) {

     Computer computer = new Computer.ComputerBuilder(
                "Samsung 860 EVO 500GB.", "HYPERX 8GB 2666MHz Fury .", "INTEL Core i9-9900K.", "ASUS DVD+/-RW DRW-24D5MT.",
                "RazerChroma.", "RazerDeathAdder.")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .setNetworkEnabled(true)
                .setSoundCardEnabled(true)
                .build();

     Computer computer1 = new Computer.ComputerBuilder(
                "Samsung 860 EVO 150GB.", "HYPERX 2GB 1200MHz Fury.", "INTEL Core i5-5600K.", "ASUS DVD.",
                "STEELSERIES. ", "STEELSERIES Rival 600.")
                .setBluetoothEnabled(false)
                .setGraphicsCardEnabled(true)
                .setNetworkEnabled(false)
                .setSoundCardEnabled(true)
                .build();

        Computer computer2 = new Computer.ComputerBuilder(
                "Samsung 500 GB.", "HYPERX 2GB.", "INTEL Core i5.", "ASUS DVD.",
                "LOGITECH. ", "LOGITECH 450 DPI.")
                .build();

        System.out.println(computer.toString());
        System.out.println("------------//------------");
        System.out.println(computer1.toString());
        System.out.println("------------//------------");
        System.out.println(computer2.toString());
    }
}
