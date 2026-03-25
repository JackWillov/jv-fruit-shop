package core.basesyntax.operations;

import core.basesyntax.FruitTransaction;
import core.basesyntax.storage.Storage;

public class BalanceOperation implements OperationHandler {

    @Override
    public void operate(FruitTransaction transaction, Storage storage) {
        storage.set(transaction.getFruit(), transaction.getQuantity());
    }
}
