package strumienie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Strumienie {

    public static void main(String[] args) {

        List<Mieszkanie> mList = Arrays.asList(
                new Mieszkanie("Warszawa", "Mokotów", "Ulica na Mokotowie", 3, 60.7f, true, 456000),
                new Mieszkanie("Wrocław", "Bemowo", "Ulica na Bemowo", 4, 90.7f, false, 554000),
                new Mieszkanie("Kraków", "Skorosze", "Ulica na Skorosze", 5, 160.7f, false, 757000),
                new Mieszkanie("Poznań", "Praga", "Ulica na Praga", 2, 40.7f, true, 358000)
        );

        // 1 sposób użycia strumienia
        mList.stream()
                .filter(mieszkanie -> mieszkanie.getMiasto().equalsIgnoreCase("Wrocław"))
                .filter(mieszkanie -> mieszkanie.getPokoje() > 3)
                .filter(mieszkanie -> mieszkanie.getCena() > 500000)
                .map(mieszkanie -> mieszkanie.getMiasto() + " " + mieszkanie.getDzielnica()
                        + mieszkanie.getUlica() + " " + mieszkanie.getPokoje() + " " + mieszkanie.getCena())
                .forEach(System.out::println);

        // 2  sposób użycia strumienia
        Predicate<Mieszkanie> mNazwa = m -> m.getMiasto().equalsIgnoreCase("Wrocław");
        Predicate<Mieszkanie> mNazwa1 = m -> m.isPiwnica() == true;

        List<Mieszkanie> lista = new ArrayList<>();

        lista = mList.stream()
                .filter(mNazwa)
                .collect(Collectors.toList());
        System.out.println(lista);


        // Anty wzorzec
//        for (Mieszkanie m mList){
//            if (m.getMiasto().equals("Wrocław")){
//                if (m.getPokoje() > 2){
//                    if (m.getCena() < 500000){
//                        System.out.println(m.getMiasto() + " " + m.getCena() + " " + m.getPokoje());
//                    }
//                }
//            }
//        }
    }
}
