package Factory;

public abstract class Factory {

    public static CarShape getShape(ModelType name) {
        CarShape shape = null;
        switch (name) {
            case AMBULANCE:
                shape = new Ambulance();
                break;
            case AUTOCITY:
                shape = new AutoCity();
                break;
            case AUTOSMALL:
                shape = new AutoSmall();
                break;
            case BUS:
                shape = new Bus();
                break;
            case COMBI:
                shape = new Combi();
                break;
            case FIRETRUCK:
                shape = new FireTruck();
                break;
            case KOMPAKT:
                shape = new Kompakt();
                break;
            case MINIVAN:
                shape = new MiniVan();
                break;
            case POLICECAR:
                shape = new PoliceCar();
                break;
            case SEDAN:
                shape = new Sedan();
                break;
            case SUV:
                shape = new Suv();
                break;
            case TRUCK:
                shape = new Truck();
                break;
        }
        return shape;
    }
}
