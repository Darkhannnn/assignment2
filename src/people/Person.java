package people;
public class Person {
    public static int nextId = 1;

    private int id;
    private String name;
    private String surname;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Person() {
    }

    public Person(int id, String name, String surname) {
        this.id = getNextId();
        this.name = name;
        this.surname = surname;
    }

    private static int getNextId() {
        return nextId++;
    }

    public String getPosition(){
        return "Student";
    }

    @Override
    public String toString() {
        return id +
                ". " + name +
                " " + surname + '\'';
    }
}
