import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Cardiff", "Aberbran Rd.", 8);
        Address address2 = new Address("Liverpool", "Vale Rd.", 20);
        Address address3 = new Address("Oxford", "Oatlands Rd.", 48);

        Person person1 = new Person("Paul", "Stephens", address1);
        System.out.println(person1);
        Person person2 = new Person("Coleen", "Rice", address2);
        System.out.println(person2);
        Person person3 = new Person("Thomas", "Webster", address3);
        System.out.println(person3);
        Person personNull = new Person(null, "Webster", address3);

        ArrayList <Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        PersonIOUtil.writePersons("People.txt", people);
        PersonIOUtil.readPersons("People.txt");
    }
}