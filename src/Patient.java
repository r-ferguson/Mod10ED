import java.util.Date;

public class Patient extends Person{
    //attributes
    public String id;
    public Date arrivalDate;
    public Date dischargeDate;
    public String status;

    public Patient(String name, Date dob, String id, Date arrivalDate, String status) {
        super(name, dob);
        this.arrivalDate = arrivalDate;
        this.id = id;
        this.status = status;
    }
}
