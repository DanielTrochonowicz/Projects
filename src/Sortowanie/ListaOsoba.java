package Sortowanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOsoba {
    public static void main(String[] args) {

        List<Osoba> osoby = new ArrayList<>();
        osoby.add(new Osoba("Jan", "Kowalski"));
        osoby.add(new Osoba("Dawid", "Milek"));
        osoby.add(new Osoba("Kamil", "Gołota"));
        osoby.add(new Osoba("Grzesiek", "Hans"));
        osoby.add(new Osoba("Agata", "Nowak"));

        for (Osoba o : osoby){
            System.out.println(o);
        }

        Collections.sort(osoby, (Osoba o1, Osoba o2) -> o1.getImie().compareTo(o2.getImie()));
//        osoby.sort((Comparator.comparing(Osoba::getImie)));
        System.out.println("======================");
        for (Osoba o : osoby){
            System.out.println(o);
        }

        Collections.sort(osoby, (Osoba o1, Osoba o2) -> o1.getNazwisko().compareTo(o2.getNazwisko()));
//        osoby.sort((Comparator.comparing(Osoba::getNazwisko)));
        System.out.println("======================");
        for (Osoba o : osoby){
            System.out.println(o);
        }
    }
}
