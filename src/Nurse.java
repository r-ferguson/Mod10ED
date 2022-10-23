import java.util.Date;

public class Nurse extends Employee{

    //constructor
    public Nurse(String name, Date dob) {
        super(name, dob);
    }



    //methods
    public void beginShift(){
        //
    }

    public void endShift(){
        //
    }

    public boolean treat(Patient patient){
        return true;
    }
}
