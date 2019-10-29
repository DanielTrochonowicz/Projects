package computer;

public class Computer {

    private String HDD;
    private String RAM;
    private String Procesor;
    private String Drive;
    private String Keybyord;
    private String Mouse;


    private boolean isGraphicsCardEnabled;
    private boolean isSoundCardEnabled;
    private boolean isBluetoothEnabled;
    private boolean isNetworkEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public String getProcesor() {
        return Procesor;
    }

    public String getDrive() {
        return Drive;
    }

    public String getKeybyord() {
        return Keybyord;
    }

    public String getMouse() {
        return Mouse;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isSoundCardEnabled() {
        return isSoundCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public boolean isNetworkEnabled() {
        return isNetworkEnabled;
    }

    public Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.Procesor = builder.Procesor;
        this.Drive = builder.Drive;
        Keybyord = builder.Keybyord;
        Mouse = builder.Mouse;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isSoundCardEnabled = builder.isSoundCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isNetworkEnabled = builder.isNetworkEnabled;
    }

    @Override
    public String toString() {
        return "Computer Build: " + "\n" +
                "HDD : " + HDD + "\n" +
                "RAM : " + RAM + "\n" +
                "procesor : " + Procesor + "\n" +
                "drive : " + Drive + "\n" +
                "Keybyord : " + Keybyord + "\n" +
                "Mouse : " + Mouse + "\n" +
                "isGraphicsCardEnabled : " + isGraphicsCardEnabled + "." + "\n" +
                "isSoundCardEnabled : " + isSoundCardEnabled + "." + "\n" +
                "isBluetoothEnabled : " + isBluetoothEnabled + "." + "\n" +
                "isNetworkEnabled : " + isNetworkEnabled + "." ;
    }

    public static class  ComputerBuilder{


        private String HDD;
        private String RAM;
        private String Procesor;
        private String Drive;
        private String Keybyord;
        private String Mouse;


        private boolean isGraphicsCardEnabled;
        private boolean isSoundCardEnabled;
        private boolean isBluetoothEnabled;
        private boolean isNetworkEnabled;

        public ComputerBuilder(String HDD, String RAM, String Procesor,
                               String Drive, String Keybyord, String Mouse) {
            this.HDD = HDD;
            this.RAM = RAM;
            this.Procesor = Procesor;
            this.Drive = Drive;
            this.Keybyord = Keybyord;
            this.Mouse = Mouse;
            this.isGraphicsCardEnabled = true;
            this.isSoundCardEnabled = true;
            this.isBluetoothEnabled = true;
            this.isNetworkEnabled = true;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this ;
        }

        public ComputerBuilder setSoundCardEnabled(boolean isSoundCardEnabled) {
            this.isSoundCardEnabled = isSoundCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public ComputerBuilder setNetworkEnabled(boolean isNetworkEnabled) {
            this.isNetworkEnabled = isNetworkEnabled;
            return this;
        }
        public Computer build() {
            return  new Computer(this);
        }
    }
}
