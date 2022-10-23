import java.util.Date;

public class Clerk extends Employee {
    //constructor
    public Clerk(String name, Date dob) {
        super(name, dob);
    }

    //methods
    public boolean register(Patient patient){
        return true;
    }

    public boolean assign(Patient patient, Bed bed){
        return true;
    }
}
