import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private Address address;

    public Person () {
    }

    public Person (String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;

        try {
            if (firstName == null | lastName == null | address==null) {
                throw new NullFieldException("\n" + "Personal data contains NULL: ");
            }
        } catch (NullFieldException e) {
            System.out.println(e.getMessage() + Person.this);
        }
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress () {
        return address;
    }

    public void setAddress (Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + address;
    }
}
