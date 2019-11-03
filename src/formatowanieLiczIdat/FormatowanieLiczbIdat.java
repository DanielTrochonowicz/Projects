package formatowanieLiczIdat;

import javax.xml.crypto.Data;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatowanieLiczbIdat {

    public static void main(String[] args) {

        int x = 7634743;

        System.out.println(String.format("Moja Liczba %,d sformatowana", x));

        float f = 12345.5634f;

        System.out.println(String.format("Moja Liczba %,.2f sformatowana", f));


        Date data = new Date();

        System.out.println(data);

        SimpleDateFormat formatowanie = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss Z");
        SimpleDateFormat formatowanie1 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss Z");
        SimpleDateFormat formatowanie2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");

        String strData = formatowanie.format(data);
        String strData1 = formatowanie1.format(data);
        String strData2 = formatowanie2.format(data);

        System.out.println(strData);
        System.out.println(strData1);
        System.out.println(strData2);



    }
}
