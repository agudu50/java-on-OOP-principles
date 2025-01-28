package Medicals;


//Adding one field and also to inherit other fields from the MedicalPersonnel
public class Pharmacist  extends MedicalPersonnel{
    private String pharmacistLicenseId;


    //Constructor for initialization
    // and also to allow pharmacist to inherit some fields from parent class
    public Pharmacist(String name, String Id, String pharmacistLicenseId) {
        super (name, Id);
        this.pharmacistLicenseId = pharmacistLicenseId;
    }

    //Methods for implementing performDuties
    @Override
    public void performDuties(){
        System.out.println("Name: " + getName() + " Dispenses medication and advises patients on drug usage.");

    }
    @Override
    public String getSpecialization(){
        return "Pharmacy";
    }

}
