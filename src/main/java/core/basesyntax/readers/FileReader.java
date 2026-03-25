package core.basesyntax.readers;

import java.util.List;

public interface FileReader {
    List<String> read(String path);
}
