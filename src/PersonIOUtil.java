import java.io.*;
import java.util.ArrayList;

public class PersonIOUtil {

    public static void writePersons(String fileName, ArrayList arrayList) {

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(String.valueOf(arrayList));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readPersons(String fileName) {

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String s;
            ArrayList<Person> peopleReader = new ArrayList<>();
            while ((s = reader.readLine()) != null) {

                for (String people: s.split(", ")) {
                    people = people.replaceAll("[\\[\\]]", "");
                    String[] str = people.split("\\s");
                    Address address1 = new Address(str[2], (str[3]+ " " + str[4]), str[5]);
                    Person person1 = new Person(str[0],str[1], address1);
                    peopleReader.add(person1);
                    System.out.println(people);
                }
                System.out.println("\n" + "Collection output after reading the file:");
                System.out.println(peopleReader);
            }
            throw new EmptySourceFileException("File is empty!");
        } catch (EmptySourceFileException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
