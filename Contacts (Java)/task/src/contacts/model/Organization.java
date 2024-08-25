package contacts.model;

import java.io.Serializable;
import java.util.Objects;

public class Organization extends Record implements Serializable {

    private String  organizationName;
    private String address;

    public Organization(String phonenumber, String organizationName, String address) {
        super(phonenumber);
        this.organizationName = organizationName;
        this.address = address;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getDisplayName() {
        return organizationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Organization organization = (Organization) o;
        return Objects.equals(organizationName, organization.organizationName) && Objects.equals(address, organization.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), organizationName, address);
    }

    @Override
    public String toString() {
        return "Organization{" +
            "organizationName='" + organizationName + '\'' +
            ", address='" + address + '\'' +
            '}';
    }

    @Override
    public String[] getEditableFields() {
        return new String[]{"address", "number"};
    }

    @Override
    public void updateFieldValue(String name, String value) {
        switch (name) {
            case "address":
                setAddress(value);
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
            case "address" -> getAddress();
            case "number" -> getPhonenumber();
            default -> "Invalid field!";
        };
    }

    @Override
    public void print() {
        System.out.printf("Organization name: %s" +
                "%nAddress: %s" +
                "%nNumber: %s" +
                "%nTime created: %s" +
                "%nTime last edit: %s%n",
            formatNullValue(getOrganizationName()),
            formatNullValue(getAddress()),
            formatNullValue(getPhonenumber()),
            formatDate(getCreated()),
            formatDate(getLastModified()));
    }
}
