package contacts;

import contacts.model.Record;

import java.util.ArrayList;
import java.util.List;

public class TransientRecordStore implements RecordStore{

    private List<Record> records = new ArrayList<>();

    @Override
    public List<Record> getRecords() {
        return records;
    }

    @Override
    public void saveRecords() {

    }
}
