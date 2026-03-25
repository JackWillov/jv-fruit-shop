package core.basesyntax.operations;

import core.basesyntax.FruitTransaction;
import core.basesyntax.storage.Storage;

public interface OperationHandler {
    void operate(FruitTransaction transaction, Storage storage);
}
