package task;

public class _08_Class {
    public static void main(String[] args) {

        Rectangle rectangle0 = new Rectangle(5, 5);
        Rectangle rectangle1 = new Rectangle(3, 52);
        Rectangle rectangle2 = new Rectangle(23, 55);
        Rectangle rectangle3 = new Rectangle(23, 35);

        System.out.println("Rectangle area0: " + rectangle0.getArea() + "\n" + "Rectangle perimeter: " + rectangle0.getPerimeter());
        System.out.println("Rectangle area1: " + rectangle1.getArea() + "\n" + "Rectangle perimeter1: " + rectangle1.getPerimeter());
        System.out.println("Rectangle area2: " + rectangle2.getArea() + "\n" + "Rectangle perimeter2: " + rectangle2.getPerimeter());
        System.out.println("Rectangle area3: " + rectangle3.getArea() + "\n" + "Rectangle perimeter3: " + rectangle3.getPerimeter());

        Triangle triangle0 = new Triangle(5, 5, 5);
        Triangle triangle1 = new Triangle(3, 6, 9);
        Triangle triangle2 = new Triangle(30, 10, 20);
        Triangle triangle3 = new Triangle(23, 23, 23);

        System.out.println("Triangle area0: " + triangle0.getArea() + "\n" + "Triangle perimeter0: " + triangle0.getPerimeter());
        System.out.println("Triangle area1: " + triangle1.getArea() + "\n" + "Triangle perimeter1: " + triangle1.getPerimeter());
        System.out.println("Triangle area2: " + triangle2.getArea() + "\n" + "Triangle perimeter2 " + triangle2.getPerimeter());
        System.out.println("Triangle area3: " + triangle3.getArea() + "\n" + "Triangle perimeter3: " + triangle3.getPerimeter());

        triangle0.getArea();
        triangle1.getPerimeter();

        Circle circle0 = new Circle(5);
        Circle circle1 = new Circle(14);
        Circle circle2 = new Circle(24);
        Circle circle3 = new Circle(10);
        System.out.println("Circle area0: " + circle0.getArea() + "\n" + "Circle perimeter0: " + circle0.getPerimeter());
        System.out.println("Circle area1: " + circle1.getArea() + "\n" + "Circle perimeter1: " + circle1.getPerimeter());
        System.out.println("Circle area2: " + circle2.getArea() + "\n" + "Circle perimeter2: " + circle2.getPerimeter());
        System.out.println("Circle area3: " + circle3.getArea() + "\n" + "Circle perimeter3: " + circle3.getPerimeter());
    }
}

class  Rectangle {
    private double firstA;
    private double secondB;

    public Rectangle(double firstA, double secondB) {
        this.firstA = firstA;
        this.secondB = secondB;
    }
    public double getArea() {
        return (firstA * secondB);
    }
    public double getPerimeter() {
        return (2 * firstA) + (2 * secondB);
    }
}
class Triangle{
    private double firstA;
    private double secondB;
    private double thirdC;

    public Triangle(double firstA, double secondB, double thirdC) {
        this.firstA = firstA;
        this.secondB = secondB;
        this.thirdC = thirdC;
    }
    public double getArea() {
        return (firstA * secondB) / 2;

    }
    public double getPerimeter() {
        return (firstA + secondB + thirdC);
    }
}
class Circle{
    private double firstA;

    public Circle(double firstA) {
        this.firstA = firstA;
    }
    public double getArea() {
        return Math.PI * Math.pow(firstA, 2);
    }
    public double getPerimeter() {
        return 2 * (Math.PI * firstA);
    }
}
/*
Klasy
Do każdego zadania należy utworzyć kilka obiektów i przetestować działanie metod!
1. Stwórz klasę Rectangle, która będzie miała pola: a, b (długości boków). Do klasy dodaj konstruktor (ustawiający wartości
wszystkich pól).
1b. Dodaj do klasy metodę getArea, która zwróci pole powierzchni, oraz metodę getPerimeter zwracającą obwód figury.
2. Postąp analogicznie dla koła oraz trójkątu (a, b, c).
 */