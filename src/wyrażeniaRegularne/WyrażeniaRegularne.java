package wyrażeniaRegularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrażeniaRegularne {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("Java");
        Matcher m = p.matcher("Java");

        System.out.println(m.matches());
    }
}
