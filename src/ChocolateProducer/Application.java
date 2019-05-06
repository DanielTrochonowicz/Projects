package ChocolateProducer;

public class Application {
    public static void main(String[] args) {

        ChocolateFlavor bitter = FactoryChocolate.getFlavor(
                ChocolateType.CHOCOLATEBITTER);
        if (bitter != null) {
            bitter.producing();
        } else {
            System.out.println("!!! This chocolate can not be produced !!!");
        }


        ChocolateFlavor milk = FactoryChocolate.getFlavor(
                ChocolateType.CHOCOLATEMILK);
        if (milk != null) {
            milk.producing();
        } else {
            System.out.println("!!! This chocolate can not be produced !!!");
        }


        ChocolateFlavor filling = FactoryChocolate.getFlavor(
                ChocolateType.CHOCOLATEWITHFILLING);
        if(filling != null){
            filling.producing();
        }else {
            System.out.println("!!! This chocolate can not be produced !!!");
        }


        ChocolateFlavor nuts = FactoryChocolate.getFlavor(
                ChocolateType.CHOCOLATEWITHNUTS);
        if (nuts != null) {
            nuts.producing();
        } else {
            System.out.println("!!! This chocolate can not be produced !!!");
        }
    }
}
