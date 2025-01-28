package Vehicle;

public class Bike extends Vehicle {
    private int engineCapacity;

//Constructor
    public Bike(String vehicleId, String brand, String model, boolean isAvailable, int engineCapacity) {
        super(vehicleId, brand, model, isAvailable);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return 500 * days * engineCapacity / 10.0;
    }
}
