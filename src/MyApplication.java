import people.Employee;
import people.Person;
import people.Student;

import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {
    public static void main(String[] args){
        ArrayList<Person> peopleList = new ArrayList<>();

        peopleList.add(new Employee("John", "Lennon", "Supervisor", 450000));
        peopleList.add(new Student("Paul","McCartney",3.67));
        peopleList.add(new Student("Ringo", "Starr", 2.1));
        peopleList.add(new Employee("George", "Harrison", "Worker", 100000));

        Collections.sort(peopleList);
        printData(peopleList);
    }
    public static void printData(Iterable<Person> people){
        for (Person person : people){
            System.out.println(person);
        }
    }
}
