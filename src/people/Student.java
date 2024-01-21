package people;

public class Student extends Person{
    private double gpa;

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getPaymentAmount() {
        return (gpa > 2.67) ? 36660.00 : 0.0;
    }
    @Override
    public int compareTo(Person other) {
        if (other instanceof Student) {
            return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
        }
        return super.compareTo(other);
    }

    public Student() {
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + " earns " + getPaymentAmount() + " tenge";
    }
}
