//package ArrayInversionCount;
//
//import org.apache.commons.lang2.ArrayUtils;
//
//import java.util.Arrays;
//
//
//public class _06_Tables {
//    public static void main(String[] args) {
//
//        int[] tab = {1, 4, 5, 7, 8, 9, 0};
//        print(tab);
//        System.out.println(" ");
//        getMax(tab);
//        getMin(tab);
//        getSum(tab);
//        getMaxMinAndSum(tab);
//
//        int[] tab1 = {5, 5, 5, 5};
//        int[] tab2 = {5, 5, 5, 5, 5};
//        int[] w = getLager(tab1, tab2);
//        //String w = getLager(tab1,tab2);
//        String lager = Arrays.toString(w);
//        //System.out.println(w);
//        System.out.println("The sum of the larger array is: " + lager);
//
//        int[] tab3 = {1, 2, 3, 4, 5, 6};
//        int[] tab4 = {5, 4, 3, 2, 1};
//        int[] w1 = merge(tab3,tab4);
//        String merge = Arrays.toString(w1);
//        System.out.println("Table after adding elements: " + merge);
//
//        int[] tab5 = {5, 4, 3, 2, 1, 5, 4};
//        int[] w2 = getDistinct(tab5);
//        String getDistinct = Arrays.toString(w2);
//        System.out.println("Array after removing elements: " + getDistinct);
//    }
///*1. Napisz metodę print, która wypisze w konsoli elementy tablicy intów,
//przekazanej jako parametr.*/
//
//    public static void print(int tab[]) {
//
//        for (int i = 0; i < tab.length; i++) {
//            System.out.print(" " + tab[i]);
//        }
//    }
///*2. Napisz metodę getMax, która przyjmie za parametr tablicę intów,
//a która zwróci największą wartość z tej tablicy.*/
//
//    public static void getMax(int tab[]) {
//        int max = tab[0];
//        for (int i = 0; i < tab.length; i++) {
//            if (tab[i] > max)
//                max = tab[i];
//        }
//        System.out.println("Max: " + max);
//    }
///*3. Napisz metodę getMin, która zwróci najmniejszy element przekazanej tablicy intów.*/
//
//    public static void getMin(int tab[]) {
//        int min = tab[0];
//        for (int i = 0; i < tab.length; i++) {
//            if (tab[i] < min)
//                min = tab[i];
//        }
//        System.out.println("Min: " + min);
//    }
///*4. Napisz metodę getSum, która przyjmie za parametr tablicę intów,
//a któa zwróci sumę jej elementów.*/
//
//    public static void getSum(int tab[]) {
//        int sum = 0;
//        for (int i = 0; i < tab.length; i++) {
//            sum += tab[i];
//        }
//        System.out.println("Sum: " + sum);
//    }
///*5. Napisz metodę getMaxMinAndSum, która przyjmie za parametr tablicę intów,
//a która zwróci tablicę trzyelementową, której pierwszy element to wartość
//największa, drugi to najmniejsza,a trzeci suma wszystkich elementów.*/
//
//    public static void getMaxMinAndSum(int tab[]) {
//        int max1 = tab[0];
//        int min1 = tab[0];
//        int sum1 = 0;
//        for (int i = 0; i < tab.length; i++) {
//            if (tab[i] > max1)
//                max1 = tab[i];
//            if (tab[i] < min1)
//                min1 = tab[i];
//            sum1 += tab[i];
//        }
//        System.out.println("Max: " + max1 + " Min: " + min1 + " Sum: " + sum1);
//    }
///*6. Napisz metodę getLarger, która przyjmie za parametry dwie tablice intów,
//a która zwróci tę tablicę, której suma elementów jest większa.*/
//
//    public static int[] getLager(int[] tab1, int[] tab2) {
//        int max1 = 0;
//        int max2 = 0;
//        for (int i = 0; i < tab1.length; i++) {
//            max1 += tab1[i];
//            for (int j = 0; j < tab2.length; j++) {
//                max2 += tab2[j];
//            }
//            if (max1 > max2)
//                return tab1;
//        }
//        return tab2;
//    }
///*7. Napisz metodę merge, która za parametry dwie tablice intów,
//a która zwróci tablicę, która zawierać będzie wszystkie
//elementy z jednej i drugiej tablicy.*/
//
////    public static int[] merge(int[] tab1, int[] tab2) {
//
////        int[] tab3 = new int[tab1.length + tab2.length];
////        System.arraycopy(tab1, 0, tab3, 0, tab1.length);
////        System.arraycopy(tab2, 0, tab3, tab1.length, tab2.length);
////        return tab3;
//
////        int[] merge = ArrayUtils.addAll(tab1, tab2);
////        return merge;
////    }
///*8. Napisz metodę getDistinct, która za parametr przyjmie tablicę,
//a która zwróci tablicę, w której będą elementy bez
//powtórzeń z tablicy przekazanej w parametrze.*/
//
//    public static int[] getDistinct(int[] tab){
//
//      //  System.out.println("The array created is :"+Arrays.toString(tab));
//
//        for(int i = 0; i < tab.length -1; i++) {
//            for (int j = i + 1; j < tab.length; j++) {
//                if(tab[i] == tab[j]) {
////                    tab = ArrayUtils.remove(tab, j);
//                }
//            }
//        }return tab;
//    }
//
//
//}
//
//
