package Task;

import java.util.Arrays;

public class _09_ClassHome {
    public static void main(String[] args) {

        Person person0 = new Person("Daniel", "Kowalski", "20 Age");
        Person person1 = new Person("Dawid", "Kowalski", "18 Age");
        Person person2 = new Person("Darek", "Kowalski", "22 Age");


        Room room = new Room();
        double area = room.area;
        double height = room.height;
        System.out.println("Area: " + area);
        System.out.println("Height: " + height);

        House house = new House();
        String home1 = house.kitchen;
        String home2 = house.bathroom;
        String home3 = house.address;
        System.out.println("Home: " + home1 + " " + home2 + " " + home3);
        String[] rooms = house.rooms;
        System.out.println("Rooms: " + Arrays.toString(rooms));
        int area1 = house.getArea(20,50);
        System.out.println("House field: " + area1);


        Party party = new Party();
        String attendees = party.attendees;
        String host = party.host;
        System.out.println("Obecni: " + attendees + " " + host);
        int AverageAgeparty = party.getAverageAge(18,22,2);
        System.out.println("Party: " + AverageAgeparty);
    }
}
class Person {
    private final String firstName;
    private final String lastName;
    private final String age;

    public Person(String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
class Room {
    public double area;
    public double height;
}
class House {
    public String address;
    public String kitchen;
    public String bathroom;
    String[] rooms = {kitchen, bathroom};

    public int getArea(int a, int b) {
        return a + b;
    }
}
class Party{
    public String host;
    public String attendees;

    public int getAverageAge(int host, int attendees, int numberTotal){
          return (host + attendees) / numberTotal;
    }
}

/*
1. Stwórz klasę Person, która będzie miała pola: firstName,
   lastName oraz age oraz konstruktor (ustawiający wartości wszystkich pól).
2. Stwórz klasę Room, która będzie miała pola: area oraz height.
3. Stwórz klasę House, która będzie miała pola: address (String),kitchen,bathroom oraz
   tablicę pokojów (rooms). W przypadku pól oznaczających pomieszczenia skorzystajmy z klasy Room.
4. Do klasy House dodaj metodę getArea, która zwróci pole powierzchni domu.
5. Stwórz klasę Party, która będzie miała pola: host (gospodarz), attendees (uczestnicy).
   Do klasy dodaj metodęn getAverageAge, która zwróci średni wiek uczestników.
*/