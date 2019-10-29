package factory;

public class Aplication {

    public static void main(String[] args) {

        CarShape carAmbulance = Factory.getShape(ModelType.AMBULANCE);
        CarShape carAutoCity = Factory.getShape(ModelType.AUTOCITY);
        CarShape carAutoSmall = Factory.getShape(ModelType.AUTOSMALL);
        CarShape carBus = Factory.getShape(ModelType.BUS);
        CarShape carCombi = Factory.getShape(ModelType.COMBI);
        CarShape carFireTruck = Factory.getShape(ModelType.FIRETRUCK);
        CarShape carKompakt = Factory.getShape(ModelType.KOMPAKT);
        CarShape carMiniVan = Factory.getShape(ModelType.MINIVAN);
        CarShape carPoliceCar = Factory.getShape(ModelType.POLICECAR);
        CarShape carSedan = Factory.getShape(ModelType.SEDAN);
        CarShape carSuv = Factory.getShape(ModelType.SUV);
        CarShape carTruck = Factory.getShape(ModelType.TRUCK);

//            carAmbulance.Drive();
        if (carAmbulance != null) {
            carAmbulance.Drive();
        } else {
            System.out.println("This car can not be produced.");
        }
//           carAutoCity.Drive();
        if (carAutoCity != null) {
            carAutoCity.Drive();
        } else {
            System.out.println("This car can not be produced.");
        }

//        carAutoSmall.Drive();
        if (carAutoSmall != null) {
            carAutoSmall.Drive();
        } else {
            System.out.println("This car can not be produced.");
        }

//        carBus.Drive();
        if (carBus != null) {
            carBus.Drive();
        } else {
            System.out.println("This car can not be produced.");
        }

//        carCombi.Drive();
        if (carCombi != null) {
            carCombi.Drive();
        } else {
            System.out.println("This car can not be produced.");
        }
//        carFireTruck
        if (carFireTruck != null) {
            carFireTruck.Drive();
        } else {
            System.out.println("This car can not be produced.");
        }

//         carKompakt.Drive();
        if (carKompakt != null) {
            carKompakt.Drive();
        } else {
            System.out.println("This car can not be produced.");
        }

//        carMiniVan.Drive();
        if (carMiniVan != null) {
            carMiniVan.Drive();
        } else {
            System.out.println("This car can not be produced.");
        }

//        carPoliceCar.Drive();
        if (carPoliceCar != null) {
            carPoliceCar.Drive();
        } else {
            System.out.println("This car can not be produced.");
        }
//        carSedan.Drive();
        if (carSedan != null) {
            carSedan.Drive();
        } else {
            System.out.println("This car can not be produced.");
        }
//        carSuv.Drive();
        if (carSuv != null) {
            carSuv.Drive();
        } else {
            System.out.println("This car can not be produced.");
        }
//        carTruck.Drive();
        if (carTruck != null) {
            carTruck.Drive();
        } else {
            System.out.println("This car can not be produced.");
        }
    }
}
