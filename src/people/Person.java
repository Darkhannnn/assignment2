package people;

import helpers.Payable;

public class Person implements Payable, Comparable<Person>{
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
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Person() {
    }

    public Person(String name, String surname) {
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
        return id + ". " +
                name + " " +
                surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0.0;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
