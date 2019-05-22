package Task.Dziedziczenie.ChocolateBar;

public class CerealBar extends ChocolateBar implements Product{
    public double price;
    public double weight;
    public String bar;

    public String bar(String bar){
        return bar;
    }
    public int price(int price){
        return price;
    }
    public int weight(int weight){
        return weight;
    }
    @Override
    public int getPrice() {
        return 7;
    }

    @Override
    public int getWeight() {
        return 20;
    }
    public CerealBar(){

    }

}
