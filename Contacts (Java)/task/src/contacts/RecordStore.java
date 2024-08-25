package contacts;

import contacts.model.Record;

import java.io.IOException;
import java.util.List;

public interface RecordStore {
    List<Record> getRecords();

    void saveRecords();
}
