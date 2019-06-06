package Task.Dziedziczenie;

public class Bicycle extends Vehicle {
    private final String type;
    private final String model;
    private final String numberOfgears;

    public Bicycle(int wheelCount, int speed, int maxSpeed, String type, String model, String numberOfgears) {
        super(speed, maxSpeed, wheelCount);
        this.type = type;
        this.model = model;
        this.numberOfgears = numberOfgears;
        this.wheelCount = wheelCount;
    }

    @Override
    public String toString() {
        return "Bicycle: " +
                "Name: " + type +
                ", Mogel: " + model +
                ", WheelCount: " + wheelCount +
                ", NumberOfgears: " + numberOfgears +
                ", Speed: " + speed +
                ", MaxSpeed: " + maxSpeed
                ;
    }
}
