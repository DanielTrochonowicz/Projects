package Task.Dziedziczenie;

public class Car extends Vehicle {
    private final String type;
    private final String model;
    private final String engine;

    public Car(int wheelCount, int speed, int maxSpeed, String type, String model, String engine) {
        super(speed, maxSpeed, wheelCount);
        this.type = type;
        this.model = model;
        this.engine = engine;
        this.wheelCount = wheelCount;
    }
    @Override
    public String toString() {
        return "Car: " +
                "Type: " + type  +
                ", Model: " + model +
                ", Engine: " + engine +
                ", Speed: " + speed +
                ", MaxSpeed: " + maxSpeed +
                ", WheelCount: " + wheelCount
                ;
    }
}
