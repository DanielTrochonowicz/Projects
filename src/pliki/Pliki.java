package pliki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Pliki {
    public static void main(String[] args) throws IOException {

        //odczyt i zapis moga powodowac wyjatki dlatego nalezy je obsługiwac
        // nelzy obslugiwac wejscia i wyjscia jak zapisujemy do pliku czy odczutujemy
        // wlasnie po przez wyjatki
        //zeby np nie nadpisywal sie nam juz istniejacy plik


        String fileName = "plik.txt";
        FileWriter fileWriter = null;

        try{
            fileWriter = new FileWriter(fileName);
            fileWriter.write("Text 1\n");
            fileWriter.write("Text 2\n");
            fileWriter.write("Text 3\n");
            fileWriter.write("Text 4\n");
            fileWriter.write("Text 5\n");
            fileWriter.write("Text 6\n");

//            fileWriter.close();   // zamykanie
//            fileWriter.flush();   // oproznianie
        }catch (IOException ex){
            System.out.println("Problem z dostepem do pliku.");
        }finally {
            if (fileWriter == null){
                System.out.println("Problem");
                fileWriter.close();
            }else{
                fileWriter.close();
            }
        }


        BufferedReader bufferedReader = null;
        try{
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String linia = null;
            do{
                linia = bufferedReader.readLine();
                if (linia != null)
                System.out.println(linia);
            }while (linia != null);
        }catch (IOException ex){
            System.out.println("Problem z dostepem do pliku");
        }finally {
            bufferedReader.close();
//            if (bufferedReader != null){
//                System.out.println("Problem");
//                bufferedReader.close();
//            }else {
//                bufferedReader.close();
//            }
        }
    }
}
