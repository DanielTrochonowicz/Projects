package wyrażeniaRegularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrazeniaReg {
    public static void main(String[] args) {

        String [] str = {"test@google.com", "test.test@google.com.pl", "test.test@google.com", "123test@google.com", "test_test@google.com.pl",
                "test@google.p", "aaa@google.com","!@google.com","_@google.com","123test.test@google.com"};
       // Pattern p = Pattern.compile("^[\\w]+(\\.[\\w]+)*@[\\w-]+(\\.[a-z]+)$");
        Pattern p = Pattern.compile("^[a-zA-z0-9]+[\\._a-zA-Z0-9]*@[a-zA-z0-9]+\\.[a-z]{2,}[\\.a-z]*&");
        Matcher m = null;

        for (int x = 0; x < str.length; x++) {
            System.out.print(str[x] + ": ");
            m = p.matcher(str[x]);
            System.out.println(m.matches());
        }
    }
}
