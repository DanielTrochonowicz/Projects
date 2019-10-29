package BuilderPattern;

public class Car {

    private Integer id;
    private String model;
    private Integer airbags;
    private Integer speedMax;
    private String registration;

    public static class  Builder{
        private Integer id = null;
        private String model = null;
        private Integer airbags = null;
        private Integer speedMax = null;
        private String registration = null;

        public Builder id(Integer id){
            this.id = id;
            return this;
        }

        public Builder model(String model){
            this.model = model;
            return this;
        }
        public Builder airbags(Integer airbags){
            this.airbags = airbags;
            return this;
        }
        public Builder speedMax(Integer speedMax){
            this.speedMax = speedMax;
            return this;
        }
        public Builder registration(String registration){
            this.registration = registration;
            return this;
        }

        public Car builder(){
            return new Car(this);
        }
    }
    private Car(Builder builder){
        this.id = builder.id;
        this.model = builder.model;
        this.airbags = builder.airbags;
        this.speedMax = builder.speedMax;
        this.registration = builder.registration;
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public Integer getAirbags() {
        return airbags;
    }

    public Integer getSpeedMax() {
        return speedMax;
    }

    public String getRegistration() {
        return registration;
    }

    @Override
    public String toString() {
        return "Car: " + '\n' +
                "Id: " + id + '\n' +
                "Model: " + model + '\n' +
                "Airbags: " + airbags + '\n' +
                "SpeedMax: " + speedMax + "Km" + '\n' +
                "Registration: " + registration;
    }
}
