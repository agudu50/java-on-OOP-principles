package Vehicle;

public class Car extends Vehicle {
    private int seatingCapacity;

    //Constructor
    public Car(String vehicleId,String brand, String model, boolean isAvailble, int seatingCapacity) {
        super (vehicleId, brand, model, isAvailble);
    }

    @Override
    public double calculateRentalCost(int days) {
        return 1000 * days + seatingCapacity * 50;
    }
}
