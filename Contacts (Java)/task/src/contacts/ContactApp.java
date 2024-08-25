package contacts;

import contacts.model.Record;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ContactApp {
    private final RecordStore recordStore;
    private int selectedIndex = 0;

    public ContactApp(RecordStore recordStore) {
        this.recordStore = recordStore;
    }

    public void addRecord(Record record) {
        recordStore.getRecords().add(record);
    }

    public void setSelectedIndex(int selectedIndex) {
        this.selectedIndex = selectedIndex;
    }

    public void removedSelectedRecord() {
        recordStore.getRecords().remove(getSelectedRecord());
    }

    public Record getSelectedRecord() {
        return recordStore.getRecords().get(selectedIndex - 1);
    }

    public List<Record> getRecords() {
        return Collections.unmodifiableList(recordStore.getRecords());
    }

    public void saveRecords() throws IOException {
        recordStore.saveRecords();
    }
}
