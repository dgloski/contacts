package contacts.model;

import contacts.parser.InvalidValueException;
import contacts.parser.PhonenumberValidator;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Record implements Serializable {

    private LocalDateTime created;
    private LocalDateTime lastModified;
    private String phonenumber;

    protected Record(String phonenumber) {
        setPhonenumber(phonenumber);
        created = LocalDateTime.now();
        lastModified = created;
    }

    public void updated() {
        lastModified = LocalDateTime.now();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        try {
            PhonenumberValidator.validate(phonenumber);
            this.phonenumber = phonenumber;
        } catch (InvalidValueException e) {
            System.out.println(e.getMessage());
            this.phonenumber = null;
        }
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public abstract String getDisplayName();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return Objects.equals(created, record.created) && Objects.equals(lastModified, record.lastModified) && Objects.equals(phonenumber, record.phonenumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(created, lastModified, phonenumber);
    }

    @Override
    public String toString() {
        return "Record{" +
            "created=" + created +
            ", lastModified=" + lastModified +
            ", phonenumber='" + phonenumber + '\'' +
            '}';
    }

    public abstract String[] getEditableFields();

    public abstract void updateFieldValue(String name, String value);

    public abstract String getFieldValue(String name);

    public abstract void print();

    protected String formatDate(LocalDateTime value) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        return formatter.format(value);
    }

    protected Object formatNullValue(Object value) {
        return value == null ? "[no data]" : value;
    }
}
