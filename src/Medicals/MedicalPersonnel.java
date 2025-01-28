package Medicals;

//Abstract class for medical Personnel
public class MedicalPersonnel {
    private String name;
    private String id;


    //Constructor to initialize name and id
    public MedicalPersonnel(String name, String id) {
        this.name = name;
        this.id = id;

    }


    //getter methods for name and id
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }


    //Abstract methods
    public void performDuties() {

    }

    public String getSpecialization(){
        return null;
    }

    //Concrete Methods
    public  void displayDetails() {
        System.out.println("Name: " + name + "ID: " + id);
    }

}
