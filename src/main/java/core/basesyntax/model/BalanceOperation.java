package core.basesyntax.model;

import core.basesyntax.FruitTransaction;
import core.basesyntax.db.Storage;

public class BalanceOperation implements OperationHandler {

    @Override
    public void operate(FruitTransaction transaction, Storage storage) {
        storage.set(transaction.getFruit(), transaction.getQuantity());
    }
}
