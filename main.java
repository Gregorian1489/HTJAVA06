import java.util.HashSet;
import java.util.*;




public class main {
    
    public static void main(String[] args) {

        Person person1 = new Person("John", "Smith", 34, "male", "New York");
        Person person2 = new Person("John", "Smith", 34, "male", "New York");
        Person person3 = new Person("John", "Goldberg", 15, "male", "New York");
        Person person4 = new Person("Michael", "Taison", 19, "male", "Washington");
        Person person5 = new Person("Alice", "Tailor", 25, "female", "Springfild");

        Set<Person> persons = new HashSet<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        System.out.println("Заполненная коллекция: ");
        System.out.println(persons);
        System.out.println("Выборка по возрасту: ");
        persons.stream()
                    .filter(Person -> Person.getage() > 20)
                    .forEach(System.out::println);
        System.out.println("Сравнение по equals: ");
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println("Работа Hashcode: ");
        System.out.println(person1.hashCode());
        System.out.println(person4.hashCode());
    }

}