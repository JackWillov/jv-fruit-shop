package core.basesyntax.generator;

import core.basesyntax.storage.Storage;

public interface ReportGenerator {
    String getReport();

    String convertToCsv(Storage storage);
}
