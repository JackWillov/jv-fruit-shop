package core.basesyntax.readers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderImpl implements FileReader {

    @Override
    public List<String> read(String path) {
        List<String> linesString = new ArrayList<>();
        String line;
        try {
            BufferedReader br = new BufferedReader(new java.io.FileReader(path));
            while ((line = br.readLine()) != null) {
                linesString.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return linesString;
    }
}
