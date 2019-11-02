package pliki;

import java.io.FileWriter;
import java.io.IOException;

public class Pliki {
    public static void main(String[] args) throws IOException {

        String fileName = "plik.txt";
        FileWriter fileWriter = null;

        try{
            fileWriter = new FileWriter(fileName);
            fileWriter.write("Text 1\n");
            fileWriter.write("Text 2\n");
            fileWriter.write("Text 3\n");
            fileWriter.write("Text 4\n");
            fileWriter.write("Text 5\n");
//            fileWriter.close(); zamykanie
//            fileWriter.flush();  oproznianie
        }finally {
            fileWriter.close();

        }
    }
}
