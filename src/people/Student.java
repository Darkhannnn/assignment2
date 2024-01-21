package people;

public class Student extends Person{
    private int id;
    private String name;
    private String surname;
    private double gpa;

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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private static int getNextId() {
        return nextId++;
    }

    public Student() {

    }

    public Student(String name, String surname, double gpa) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student: " +
                id + ". " +
                name + " " +
                surname;
    }
}
