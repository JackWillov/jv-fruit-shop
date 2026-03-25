package core.basesyntax.converters;

import core.basesyntax.FruitTransaction;
import java.util.List;

public class DataConverterImpl implements DataConverter {

    @Override
    public List<FruitTransaction> convertToTransaction(List<String> data) {
        data.remove(0);

        return data.stream()
                .map(d -> d.split(","))
                .map(part -> new FruitTransaction(part[0], part[1], Integer.parseInt(part[2])))
                .toList();
    }
}
