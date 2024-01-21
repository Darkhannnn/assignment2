package people;

public class Employee extends Person {
    private int id;
    private String name;
    private String surname;
    private String position;
    private double salary;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    private static int getNextId() {
        return nextId++;
    }

    public Employee(){

    }
    public Employee(int id, String name, String surname, String position, double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee:" +
                ". " + id +
                " " + name +
                " " + surname + '\'';
    }
}
