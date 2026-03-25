package core.basesyntax.operations;

import core.basesyntax.FruitTransaction;
import core.basesyntax.storage.Storage;

public class SupplyOperation implements OperationHandler {
    @Override
    public void operate(FruitTransaction transaction, Storage storage) {
        storage.add(transaction.getFruit(), transaction.getQuantity());
    }
}
