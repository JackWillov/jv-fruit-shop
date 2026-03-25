package core.basesyntax.model;

import core.basesyntax.FruitTransaction;
import core.basesyntax.db.Storage;

public interface OperationHandler {
    void operate(FruitTransaction transaction, Storage storage);
}
