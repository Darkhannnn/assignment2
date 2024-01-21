package people;

public class Employee extends Person {
    private String position;
    private double salary;

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

    public double getPaymentAmount() {
        return salary;
    }
    @Override
    public int compareTo(Person other) {
        if (other instanceof Employee) {
            return Double.compare(this.getSalary(), ((Employee) other).getSalary());
        }
        return super.compareTo(other);
    }

    public Employee(){
    }
    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee:" + super.toString() + " earns " + getPaymentAmount() + " tenge";
    }
}
