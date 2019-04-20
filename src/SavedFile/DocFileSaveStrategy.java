package SavedFile;

import java.io.File;
import java.util.List;

public class DocFileSaveStrategy implements FileSavedStrategy {

    @Override
    public void fileSaved(List<File> files) {

        System.out.println("A file has just been saved using DOC. method");
    }
}
