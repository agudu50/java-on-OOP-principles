package Medicals;

//adding a private to the nurse
public class Nurse extends MedicalPersonnel{
    private String department;


    //Constructor for initialization of fields
    public Nurse(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }

    //Methods for implementing performDuties
    @Override
    public void performDuties(){
        System.out.println("Name: " + getName() + " Provides patient care, administers medications, and assists doctors.");

    }


    //Methods for implementing getSpecialization
    @Override
    public String  getSpecialization(){
        return department;
    }

}
