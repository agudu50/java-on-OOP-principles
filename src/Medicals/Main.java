package Medicals;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creating an array of MedicalPersonnel
        MedicalPersonnel[] personnel = new MedicalPersonnel[3];

        //Adding one Doctor, One Nurse and one Pharmacist
        personnel[0] = new Doctor("Dr. Anthony Gudu ", "D001", "Cardiologist" );
        personnel[1] = new Nurse("Kessiah Gudu ", "N522", "Emergency" );
        personnel[2] = new Pharmacist("Daniel Gudu ", "D642", "PHL00585" );



        //looping through the array to display details, duties and specialization
        for(MedicalPersonnel person: personnel){
            person.displayDetails();
            person.performDuties();
            System.out.println("Specialization/Department: " + person.getSpecialization());
            System.out.println(); //Adding space for readability
        }
    }



}
