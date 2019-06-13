package Task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class _16_Person {
    public static void main(String[] args) {

        List<_16_Person> person = Arrays.asList(
                new _16_Person("Daniel", "Kowalski", 32, 170, "Uczen"),
                new _16_Person("Kamil", "Wozniak", 25, 167, "Uczen"),
                new _16_Person("Mirek", "Nowak", 28, 179, "Uczen"),
                new _16_Person("Aneta", "Zych", 17, 145, "Uczen"),
                new _16_Person("Kasia", "Rudzinski", 37, 164, "Uczen"),
                new _16_Person("Agnieszka", "Saks", 36, 139, "Uczen"),
                new _16_Person("Ewelina", "Miczen", 25, 169, "Uczen"),
                new _16_Person("Dawid", "Rutkows", 19, 182, "Uczen"),
                new _16_Person("Marta", "Zawisz", 24, 210, "Uczen"),
                new _16_Person("Michał", "Stac", 14, 169, "Uczen"));


                 person.stream()
                         .filter(p -> p.age > 20 && p.height > 175)
                         .forEach(System.out::println);
                 person.stream()
                         .filter(p -> p.age < 18)
                         .map(p -> p.getName() + " " + p.getSurname())
                         .forEach(System.out::println);
                 person.stream()
                        .filter(p -> p.getSurname().equals("Kowalski"))
                        .forEach(System.out::println);
                 person.stream()
                         .filter(p -> p.height > 200)
                         .forEach(System.out::println);

    }

    private String name;
    private String surname;
    private int age;
    private float height;
    private String comment;

    public _16_Person(String name, String surname, int age, float height, String comment) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Person: " +
                "Name: " + name +
                ", Surname: " + surname +
                ", Age: " + age +
                ", Height: " + height +
                ", Comment: " + comment;
    }
}

