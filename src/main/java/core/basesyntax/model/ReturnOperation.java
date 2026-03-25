package core.basesyntax.model;

import core.basesyntax.FruitTransaction;
import core.basesyntax.db.Storage;

public class ReturnOperation implements OperationHandler {
    @Override
    public void operate(FruitTransaction transaction, Storage storage) {
        storage.add(transaction.getFruit(), transaction.getQuantity());
    }
}
