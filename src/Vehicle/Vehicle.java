package Vehicle;


//Base Class:Vehicle
abstract class Vehicle {
    protected String vehicleId;
    protected String brand;
    protected String model;
    protected boolean isAvailable;


    //Encapsulated  methods

    public Vehicle(String vehicleId, String brand, String model, boolean isAvailable) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.isAvailable = isAvailable;

    }

    // Adding getters
    public String getVehicleId() {
        return vehicleId;
    }


    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public boolean isAvailable() {
        return isAvailable;
    }


    //Method for Returning Vehicle
    public void rentVehicle() throws Exception {
        if (isAvailable) {
            isAvailable = false;

        } else {
            throw new Exception("Vehicle is not available for rent");

        }
    }

    //Returning the Vehicle
    public void returnVehicle() throws Exception {
        isAvailable = true;
    }

    public abstract double calculateRentalCost(int days);


}

