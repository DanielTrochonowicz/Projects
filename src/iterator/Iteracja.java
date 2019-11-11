package iterator;
import java.util.*;
import java.util.List;

public class Iteracja {
    public static void main(String[] args) {

        List<String> listaStr = new ArrayList<>();
        listaStr.add("One");
        listaStr.add("Two");
        listaStr.add("three");
        listaStr.add("four");

        List<Integer> listaInt = new ArrayList<>();
        listaInt.add(100);
        listaInt.add(200);
        listaInt.add(300);
        listaInt.add(400);

        Set<String> kolSet = new HashSet<>();
        kolSet.add("str 1");
        kolSet.add("str 2");
        kolSet.add("str 3");
        kolSet.add("str 4");
//        kolSet.add("str 4");

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "One");
        mapa.put(2, "Two");
        mapa.put(3, "three");
        mapa.put(4, "four");

//        for (String s : listaStr){
//            System.out.println(s);
//        }

        System.out.println("\n ======= Lista String ======= w przód =======");
//        Iterator i = listaStr.iterator();  iteruje w 1 strone
        Iterator str = listaStr.listIterator(); // iteruje w obie strony
        while (str.hasNext()){
            System.out.println(((ListIterator) str).nextIndex() + ": " + str.next());
        }
        System.out.println("\n ======= Lista String ======= w tył =======");
        while (((ListIterator) str).hasPrevious()){
            System.out.println(((ListIterator) str).previousIndex() + " : " + ((ListIterator) str).previous());
        }


        System.out.println("\n ======= Lista Int ======= w przód =======");
        Iterator iInt = listaInt.listIterator();
        while (iInt.hasNext()){
            System.out.println(((ListIterator) iInt).nextIndex() + ": " + iInt.next());
        }
        System.out.println("\n ======= Lista Int ======= w tył =======");
        while (((ListIterator) iInt).hasPrevious()){
            System.out.println(((ListIterator) iInt).previousIndex() + " : " + ((ListIterator) iInt).previous());
        }

        System.out.println("\n ======= Set =======");
        Iterator iSet = kolSet.iterator();
        while (iSet.hasNext()){
            System.out.println(iSet.next());
        }

        System.out.println("\n ======= Mapa =======");

        Iterator<Integer> iInteger = mapa.keySet().iterator();
        while (iInteger.hasNext()){
            Integer key = iInteger.next();
            System.out.println(key + " : " + mapa.get(key));
        }
    }
}

