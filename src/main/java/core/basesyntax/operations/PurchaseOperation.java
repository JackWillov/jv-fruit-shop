package core.basesyntax.operations;

import core.basesyntax.FruitTransaction;
import core.basesyntax.storage.Storage;

public class PurchaseOperation implements OperationHandler {
    @Override
    public void operate(FruitTransaction transaction, Storage storage) {
        storage.subtract(transaction.getFruit(), transaction.getQuantity());
    }
}
