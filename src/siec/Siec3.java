package siec;

import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class Siec3 {

    public static void main(String[] args) throws Exception{

        URL url = new URL("http://google.com");
        URLConnection urlConnection = url.openConnection();

        long data = urlConnection.getDate();
        System.out.println(new Date(data));

        System.out.println(urlConnection.getContentType());

        data = urlConnection.getExpiration();
        System.out.println(new Date(data));

        data = urlConnection.getLastModified();
        System.out.println(new Date(data));

        int x = urlConnection.getContentLength();
        System.out.println(x);
    }
}
