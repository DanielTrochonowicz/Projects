package SavedFile;

import java.io.File;
import java.util.List;

public class FileSaveContext {

    private FileSavedStrategy strategy;


    public void setFileSavedStrategy (FileSavedStrategy strategy) {
        this.strategy = strategy;
    }

    public void createArchive(List<File> files) {
        strategy.fileSaved(files);
    }
}
