package contacts;

import contacts.model.Record;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileRecordStore implements RecordStore {
    public final String filename;
    private List<Record> records = new ArrayList<>();

    public FileRecordStore(String filename) {
        this.filename = filename;
        loadRecords();
    }

    @Override
    public List<Record> getRecords() {
        return records;
    }

    private void loadRecords() {
        File file = new File(filename);
        if (file.exists()) {
            try (var inputStream = new ObjectInputStream(new FileInputStream(file))) {
                records = (List<Record>) inputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("File not found");
            }
        }
    }

    @Override
    public void saveRecords() {
        File file = new File(filename);
        try (var inputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            inputStream.writeObject(records);
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
