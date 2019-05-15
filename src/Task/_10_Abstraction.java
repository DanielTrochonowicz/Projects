package Task;

public abstract class _10_Abstraction {
    public static void main(String[] args) {

        PerpendicularSolid perpendicularSolid = new PerpendicularSolid(5,3,4);
        System.out.println("Area perpendicularSolid: " +perpendicularSolid.getArea() + " " + "Perimeter: " + perpendicularSolid.getPerimeter());
        RectangleA rectangleA = new RectangleA(5,5);
        System.out.println("Area rectangle: " +rectangleA.getArea() + " " + "Perimeter: " + rectangleA.getPerimeter());
        CircleA circleA = new CircleA(4,4);
        System.out.println("Area circle: " +circleA.getArea() + " " + "Perimeter: " + circleA.getPerimeter());
        SquareA squareA = new SquareA(5,5);
        System.out.println("Area square: " +squareA.getArea() + " " + "Perimeter: " + squareA.getPerimeter());
        Roller roller = new Roller(1,5);
        System.out.println("Roller surface area: " + roller.getSurfaceArea() + "\n" + "Volume: " + roller.getVolume());
        Cube cube = new Cube(5);
        System.out.println("Cube surface area: " + cube.getSurfaceArea() + "\n" + "Volume: " + cube.getVolume());
    }

    private String color;
    abstract double getArea();
    abstract double getPerimeter();
}
class PerpendicularSolid extends _10_Abstraction{
    private double firstA;
    private double secondB;
    private double thirdC;

    public PerpendicularSolid(double firstA, double secondB, double thirdC) {
        this.firstA = firstA;
        this.secondB = secondB;
        this.thirdC = thirdC;
    }
    @Override
    double getArea() {
        return 2 * ((firstA * secondB) + (secondB * thirdC) + (firstA *thirdC));
    }
    @Override
    double getPerimeter() {
        return firstA * secondB * thirdC;
    }
}
class RectangleA extends _10_Abstraction {
    private double firstA;
    private double secondB;

    public RectangleA(double firstA, double secondB) {
        this.firstA = firstA;
        this.secondB = secondB;
    }
    @Override
    double getArea() {
        return firstA * secondB;
    }
    @Override
    double getPerimeter() {
        return (2 * firstA) + (2 * secondB);
    }
}
class CircleA extends _10_Abstraction{
    private double firstA;
    private double secondB;

    public CircleA(double firstA, double secondB) {
        this.firstA = firstA;
        this.secondB = secondB;
    }
    @Override
    double getArea() {
        return Math.PI * Math.pow(firstA, 2);
    }
    @Override
    double getPerimeter() {
        return 2 * (Math.PI * firstA);
    }
}
class SquareA extends RectangleA{
    public SquareA(double firstA, double secondB) {
        super(firstA, secondB);
    }
}
class Roller implements Solid {
    private double radius;
    private double height;

    Roller(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double getSurfaceArea() {
        return 2 * Math.PI * 2 * radius + 2 * Math.PI * radius * height;
    }
    @Override
    public double getVolume() {
        return Math.PI * radius * 2 * height;
    }
}
class Cube implements Solid {
    private double firstA;

    public Cube(double firstA) {
        this.firstA = firstA;
    }

    @Override
    public double getSurfaceArea() {
        return 3 * firstA;
    }

    @Override
    public double getVolume() {
        return 6 * (firstA * 2);
    }
}
interface Solid{
    double getSurfaceArea();
    double getVolume();
}