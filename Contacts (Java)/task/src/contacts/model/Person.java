package contacts.model;

import contacts.parser.BirthDateParser;
import contacts.parser.GenderParser;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Person extends Record implements Serializable {

    private String name;
    private String surname;
    private LocalDate birthDate;
    private Gender gender;

    public Person(String phonenumber, String name, String surname, LocalDate birthDate, Gender gender) {
        super(phonenumber);
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String getDisplayName() {
        return String.format("%s %s", name, surname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(birthDate, person.birthDate) && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, surname, birthDate, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", birthDate=" + birthDate +
            ", gender='" + gender + '\'' +
            '}';
    }

    @Override
    public String[] getEditableFields() {
        return new String[]{"name", "surname", "birth", "gender", "number"};
    }

    @Override
    public void updateFieldValue(String name, String value) {
        switch (name) {
            case "name":
                setName(value);
                break;
            case "surname":
                setSurname(value);
                break;
            case "birth":
                setBirthDate(BirthDateParser.parse(value));
                break;
            case "gender":
                setGender(GenderParser.parse(value));
                break;
            case "number":
                setPhonenumber(value);
                break;
            default:
                System.out.println("Invalid field!");
        }
    }

    @Override
    public String getFieldValue(String name) {
        return switch (name) {
            case "name" -> getName();
            case "surname" -> getSurname();
            case "birth" -> getBirthDate() == null ? null : getBirthDate().toString();
            case "gender" -> getGender() == null ? null : getGender().name();
            case "number" -> getPhonenumber();
            default -> "Invalid field!";
        };
    }

    @Override
    public void print() {
        System.out.printf("Name: %s" +
                "%nSurname: %s" +
                "%nBirth date: %s" +
                "%nGender: %s" +
                "%nNumber: %s" +
                "%nTime created: %s" +
                "%nTime last edit: %s%n",
            formatNullValue(getName()),
            formatNullValue(getSurname()),
            formatNullValue(getBirthDate()),
            formatNullValue(getGender()),
            formatNullValue(getPhonenumber()),
            formatDate(getCreated()),
            formatDate(getLastModified()));
    }
}
