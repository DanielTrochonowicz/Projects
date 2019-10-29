package savedFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Aplication {

    public static void main(String[] args) {

            FileSaveContext pdf = new FileSaveContext();
            pdf.setFileSavedStrategy(new PdfFileSaveStrategy());
            List<File> fileToBeSaved = new ArrayList<File>();

            File formatFile = new File("FormatFile");
            fileToBeSaved.add(formatFile);
            pdf.createArchive(fileToBeSaved);
//
//            FileSaveContext doc = new FileSaveContext();
//            doc.setFileSavedStrategy(new DocFileSaveStrategy());
//            List<File> fileToBeSavedI = new ArrayList<File>();
//
//            File formatFileI = new File("FormatFileI");
//            fileToBeSaved.add(formatFile);
//            doc.createArchive(fileToBeSaved);
    }
}
