package S3_N3_E1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FileUtils.createFile();

        List<Person> personList = new ArrayList<Person>();

        boolean exit = false;
        while (!exit) {
            int option = showMenu();
            switch (option) {
                case 1:
                    Person p = userEnterPerson();
                    personList.add(p);
                    FileUtils.writeFile(p);
                    break;
                case 2:
                    FileUtils.insertSeparator();
                    personList.stream()
                            .sorted(Comparator.comparing(person -> person.getName()))
                            .forEach(person -> FileUtils.writeFile(person));

                    break;
                case 3:
                    FileUtils.insertSeparator();
                    personList.stream()
                            .sorted(Comparator.comparing(Person::getName).reversed())
                            .forEach(person -> FileUtils.writeFile(person));
                    break;
                case 4:
                    FileUtils.insertSeparator();
                    personList.stream()
                            .sorted(Comparator.comparing(person -> person.getSurname()))
                            .forEach(person -> FileUtils.writeFile(person));
                    break;
                case 5:
                    FileUtils.insertSeparator();
                    personList.stream()
                            .sorted(Comparator.comparing(Person::getSurname).reversed())
                            .forEach(person -> FileUtils.writeFile(person));
                    break;
                case 6:
                    FileUtils.insertSeparator();
                    personList.stream()
                            .sorted(Comparator.comparing(person -> person.getDni()))
                            .forEach(person -> FileUtils.writeFile(person));
                    break;
                case 7:
                    FileUtils.insertSeparator();
                    personList.stream()
                        .sorted(Comparator.comparing(Person::getDni).reversed())
                        .forEach(person -> FileUtils.writeFile(person));
                    break;
                default:
                    System.out.println("Error when typing the option.");
                case 0:
                    exit = true;
            }
        }
    }


    private static int showMenu() {
           System.out.println("**** MENU **** " +
                    "\n\t1.Enter person" +
                    "\n\t2.Show people sorted by name ascendant" +
                    "\n\t3.Show people sorted by name descendant" +
                    "\n\t4.Show people sorted by surname ascendant" +
                    "\n\t5.Show people sorted by surname descendant" +
                    "\n\t6.Show people sorted by dni ascendant" +
                    "\n\t7.Show people sorted by dni descendant" +
                    "\n\t0.Exit");
            int option = User.readInteger("Choose a option (0-7): ");
            return option;

    }


    public static Person userEnterPerson() {
        String name = User.readString("Enter name: ");
        String surname = User.readString("Enter surname: ");
        String dni = User.readString("Enter dni: ");
        Person p = new Person(name, surname, dni);
        System.out.println(p);
        return p;
    }


}
