package savedFile;

import java.io.File;
import java.util.List;

public class TxtFileSaveStrategy implements FileSavedStrategy{


    @Override
    public void fileSaved(List<File> files) {

        System.out.println("A file has just been saved using TXT. method");
    }
}
