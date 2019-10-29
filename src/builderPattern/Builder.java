package builderPattern;

public class Builder {

    public static void main(String[] args) {

        Car ford = new Car.Builder()
                .id(1)
                .model("Ford Mustang")
                .speedMax(350)
                .airbags(8)
                .registration("WWL 89678")
                .builder();

        System.out.println(ford);
        System.out.println("Car Id: " + ford.getId() + ", " +"Model: "
                + ford.getModel() + ", " + "SpeedMax: " + ford.getSpeedMax()+ "Km" + ", "
                + "Airbags: " + ford.getAirbags() + ", " + "Registration: " + ford.getRegistration());
        System.out.println("Car Id: " + ford.getId());
        System.out.println("Model: " + ford.getModel());
        System.out.println("SpeedMax: " + ford.getSpeedMax() + "Km");
        System.out.println("Airbags: " + ford.getAirbags());
        System.out.println("Registration: " + ford.getRegistration());
    }
}
