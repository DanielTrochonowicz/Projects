package wyrażeniaRegularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrazeniaReg2 {
    public static void main(String[] args) {

        String [] str = {"start", "start1", "start123", "1234746", "123teststart",
                "!Start 12", "123teststart", "!Start12", "!Start129", "Start#99"};

        Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\!\\@\\#\\$\\*])(?!.*\\s).{8,12}$");
        Matcher matcher = null;

        for (int x = 0; x < str.length; x++) {
            System.out.print(str[x] + ": ");
            matcher = pattern.matcher(str[x]);
            System.out.println(matcher.matches());
        }
    }
}
