package Task.Dziedziczenie.ChocolateBar;

public class Milk {
}

class Mleko implements Product{


    public double area;

    public double getArea(double area) {
        return area;
    }

    @Override
    public int getPrice() {
        return 15;
    }

    @Override
    public int getWeight() {
        return 100;
    }
}