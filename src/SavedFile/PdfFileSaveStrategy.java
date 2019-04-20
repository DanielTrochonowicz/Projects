package SavedFile;

import java.io.File;
import java.util.List;

public class PdfFileSaveStrategy implements FileSavedStrategy {

    @Override
    public void fileSaved(List<File> files) {

        System.out.println("A file has just been saved using PDF. method");
    }
}
