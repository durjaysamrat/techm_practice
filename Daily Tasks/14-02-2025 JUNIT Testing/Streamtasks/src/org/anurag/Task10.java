package org.anurag;

public class Task10 {
    private final Task10Repository repository;

    public Task10(Task10Repository repository) {
        this.repository = repository;
    }

    public String processAndSave(int id, String value) {
        String processedValue = value.toUpperCase();
        repository.save(id, processedValue);
        return processedValue;
    }

    public String getProcessedValue(int id) {
        return repository.findById(id);
    }
}
