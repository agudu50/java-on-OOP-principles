package Vehicle;

// Rental Manager Class
import java.util.ArrayList;
import java.util.List;


class RentalManager {
    private List<Vehicle> vehicles;

    // Constructor
    public RentalManager() {
        vehicles = new ArrayList<>();
    }

    // Add vehicle
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Display all available vehicles
    public void displayAvailableVehicles() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                System.out.println("Vehicle ID: " + vehicle.getVehicleId() + ", Brand: " + vehicle.getBrand() + ", Model: " + vehicle.getModel());
            }
        }
    }

    // Rent a vehicle by ID
    public void rentVehicleById(String vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                try {
                    vehicle.rentVehicle();
                    System.out.println("Vehicle rented successfully.");
                    return;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
        }
        System.out.println("Vehicle with ID " + vehicleId + " not found.");
    }

    // Return a vehicle by ID
    public void returnVehicleById(String vehicleId) throws Exception {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                vehicle.returnVehicle();
                System.out.println("Vehicle returned successfully.");
                return;
            }
        }
        System.out.println("Vehicle with ID " + vehicleId + " not found.");
    }
}
