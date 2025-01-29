package Medicals;

//Abstract class for medical Personnel
public abstract class MedicalPersonnel {
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
    public abstract void performDuties();
    public abstract String getSpecialization();
    //Concrete Methods
    public  void displayDetails() {
        System.out.println("Name: " + name + "ID: " + id);
    }

    @Override
    public String toString(){
        return "Specialization" + getSpecialization();
    }
}
