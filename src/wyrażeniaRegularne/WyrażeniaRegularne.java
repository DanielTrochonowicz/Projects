package wyrażeniaRegularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrażeniaRegularne {
    public static void main(String[] args) {

        // ^ początek wzorca
        // $ koniec wzorca
        // [0-9] \\d        wszystkie znaki od 0 do 9
        // [^0-9]  \\D     ten znak ^ oznacza negacje znaki od 0-9 nie moga wystapic
        //[a-zA-Z] \\w
        //[^a-zA-Z] \\W
        // \\s = dowolny znak biały
        // \\S = wszystko tylko nie spacja
        // \\t = moze byc tabulator
        // \\n znak nowej lini

        //  [a]{x} = x wystapieni litery a
        //  [a]{1, } = [a]+ jeden lub wiecej razy
        //  [a]{1,3} = litera a wystepuje min 1 raz / max 3
        //  [a]{0,} = [a]* moze sie pojawic ale nie musi
        //  [a]? = [a]{0,1} = nie wiecej niz raz

        Pattern pattern = Pattern.compile("^[0-9]{2,3}-[0-9]{3}$");
        Matcher matcher = pattern.matcher("00-900");
        System.out.println(matcher.matches());

        Pattern p = Pattern.compile("Java");
        Matcher m = p.matcher("Programowanie Java");

        System.out.println(m.find());
        System.out.println(m.matches());
    }
}
