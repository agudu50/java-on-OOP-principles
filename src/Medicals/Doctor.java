package Medicals;

//Adding private fields
public class Doctor extends MedicalPersonnel{
    private String specialization;

    @Override
    public String getSpecialization() {
        return specialization;
    }

    //adding Constructor
    public Doctor(String name, String id, String specialization) {
        super(name, id );
        this.specialization = specialization;

    }


    @Override
    public void  performDuties(){
        System.out.println("Doctor " + getName() + "Diagnoses patients, prescribes medication and conduct surgeries. " );

    }

    @Override
    public String toString(){
        return "Specialization" + getSpecialization();
    }


}
