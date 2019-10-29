package savedFile;

import java.io.File;
import java.util.List;

public interface FileSavedStrategy {

    public void fileSaved (List<File> files);
}
