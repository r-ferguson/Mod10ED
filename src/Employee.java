import java.util.Date;

public abstract class Employee extends Person {
    //do we need to associate Employee with an Emergency Department
    public Employee(String name, Date dob) {
        super(name, dob);
    }
}
