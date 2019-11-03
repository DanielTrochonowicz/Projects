package lancuchy;

public class Lancuchy {

    public static void main(String[] args) {

        String str = " Andrzej  ";
        String str1 = "andrzej";
        String str2 = "Programista";
        String str3 = "Java:to:fajny:jezyk:programowania";

        String tab1[] = null;
        String tab2[] = null;

        tab1 = str3.split(":");
        tab2 = str3.split(":", 3);

        for (int i = 0; i < tab1.length; i++) {
            System.out.println(tab1[i]);
        }
        System.out.println("===========================");
        for (int i = 0; i < tab2.length; i++) {
            System.out.println(tab2[i]);
        }

        System.out.println(firstTouperCase(str));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println("Bez trim " + str);
        System.out.println("Z trim " + str.trim());
        System.out.println(str2.replace("a", "m"));
        System.out.println(str2.replace("m", "z"));
        System.out.println(str + " " + str2);
        System.out.println(str.concat(str2));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 4));
        System.out.println(str.equalsIgnoreCase(str1));
    }

    public static String firstTouperCase(String str) {
        String newStr = null;

        String first = String.valueOf(str.charAt(0)).toUpperCase();
        String rest = str.substring(1);

        newStr = first.concat(rest);
        return newStr;
    }
}
