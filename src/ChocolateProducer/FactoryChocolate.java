package ChocolateProducer;

public abstract class FactoryChocolate {
    public static ChocolateFlavor getFlavor(ChocolateType name){
        ChocolateFlavor flavor = null;
        switch(name){
            case CHOCOLATEBITTER:
                flavor = new ChocolateBitter();
                break;
            case CHOCOLATEMILK:
                flavor = new ChocolateMilk();
                break;
            case CHOCOLATEWITHFILLING:
                flavor = new ChocolateWithFilling();
                break;
            case CHOCOLATEWITHNUTS:
                flavor = new ChocolateWithNuts();
                break;
        }
        return flavor;
    }
}
