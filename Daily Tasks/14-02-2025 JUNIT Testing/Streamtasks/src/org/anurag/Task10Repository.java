package org.anurag;

import java.util.HashMap;
import java.util.Map;

public class Task10Repository {
    private final Map<Integer, String> dataStore = new HashMap<>();

    public void save(int id, String value) {
        dataStore.put(id, value);
    }

    public String findById(int id) {
        return dataStore.get(id);
    }
}
