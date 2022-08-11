import java.util.*;

public class Main {

    public static void main(String[] args) {
        Deque<Person> attractionQueue = new ArrayDeque<>();
        attractionQueue.addAll(generateClients());

        while (!attractionQueue.isEmpty()) {
            Person person = attractionQueue.pollFirst();
            System.out.println(person.name + " " + person.surname +
                    " прокатился на аттракционе");
            person.setNumberOfTickets(person.numberOfTickets - 1);
            if (person.numberOfTickets != 0) {
                attractionQueue.addLast(person);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Artem", "Antonov", 6));
        persons.add(new Person("Boris", "Bolotnikov", 1));
        persons.add(new Person("Dima", "Dudnikov", 3));
        persons.add(new Person("Fedya", "Fedulov", 4));
        persons.add(new Person("Kolya", "Kulagin", 7));
        return persons;
    }
}
