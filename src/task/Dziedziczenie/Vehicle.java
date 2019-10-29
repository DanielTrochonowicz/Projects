package Task.Dziedziczenie;

public class Vehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(40,60,4);
        System.out.println(vehicle);
        Car car1 = new Car(4,50,190,"Sedan", "Auris", "2.0");
        System.out.println(car1);
        Bicycle bicycle = new Bicycle(2,15,38,"Street","Merida","5");
        System.out.println(bicycle);
    }

    public int speed;
    public int maxSpeed;
    public int wheelCount;

    public Vehicle(int speed, int maxSpeed, int wheelCount) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.wheelCount = wheelCount;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle: " +  "Speed: " + speed +
                ", MaxSpeed: " + maxSpeed +
                ", WheelCount: " + wheelCount
                ;
    }
}
/*
Dziedziczenie:
1. Stworzyć klasę Vehicle, która będzie miała pola speed (aktualna prędkość) oraz maxSpeed (prędkość maksymalna) typu
int, konstruktor ustawiający wartość tych pól oraz getter i setter wspomnianych pól.
2. Stworzyć klasę Car oraz klasę Bicycle, które będą rozszerzały klasę Vehicle. Do obydwu klas należy dodać pole, które
będzie unikatowe dla danej klasy (np. rozmiar kół/liczba przerzutek, pojemność silnika/liczba drzwi/coś innego opisującego
dany pojazd). Dodaj konstruktory ustawiające wartości nowych pól oraz ustawiające wartość pól speed oraz maxSpeed
korzystając z konstruktora klasy Vehicle (przy użyciu słówka super).
3. W klasie Vehicle nadpisz metodę toString odziedziczoną z klasy Object w taki sposób, aby jej wynik opisywał wartości
wszystkich pól.
4. Nadpisz metodę toString także w klasach Bicycle oraz Car w taki sposób, aby zwracały to, co zwracane jest dla pojazdów, z
dodatkową informacją o wartościach pól zdefiniowanych w tych klasach.
5. Dodaj do klasy Vehicle pole typu int o nazwie wheelCount. Spraw, aby tworząc rower z marszu było ustawiane 2, a tworząc
samochód było to pole inicjalizowane wartością 4. Uwzględnij informację o liczbie kół w metodzie toString().
 */