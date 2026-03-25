package core.basesyntax.storage;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    private final Map<String, Integer> fruits = new HashMap<>();

    public void set(String fruit, int quantity) {
        fruits.put(fruit, quantity);
    }

    public void add(String fruit, int quantity) {
        fruits.merge(fruit, quantity, Integer::sum);
    }

    public void subtract(String fruit, int quantity) {
        fruits.merge(fruit, -quantity, Integer::sum);
    }

    public Map<String, Integer> getAll() {
        return fruits;
    }

}
