package Vehicle;
public class Main {
    public static void main(String[] args) throws Exception {
        RentalManager rentalManager = new RentalManager();

        // Create fleet of vehicles
        Car car1 = new Car("C001", "Toyota", "Camry", true, 5);
        Car car2 = new Car("C002", "Honda", "Accord", true, 4);
        Bike bike1 = new Bike("B001", "Yamaha", "R15", true, 150);
        Bike bike2 = new Bike("B002", "Kawasaki", "Ninja", true, 200);

        // Add vehicles to the system
        rentalManager.addVehicle(car1);
        rentalManager.addVehicle(car2);
        rentalManager.addVehicle(bike1);
        rentalManager.addVehicle(bike2);

        // Display available vehicles
        System.out.println("Available Vehicles:");
        rentalManager.displayAvailableVehicles();

        // Rent a vehicle
        System.out.println("\nRenting vehicle C001...");
        rentalManager.rentVehicleById("C001");

        // Display available vehicles
        System.out.println("\nAvailable Vehicles after renting C001:");
        rentalManager.displayAvailableVehicles();

        // Return a vehicle
        System.out.println("\nReturning vehicle C001...");
        rentalManager.returnVehicleById("C001");

        // Display available vehicles
        System.out.println("\nAvailable Vehicles after returning C001:");
        rentalManager.displayAvailableVehicles();

        // Calculate rental cost
        System.out.println("\nRental cost for car C001 for 5 days: GHS " + car1.calculateRentalCost(5));
        System.out.println("Rental cost for bike B001 for 3 days: GHS " + bike1.calculateRentalCost(3));
    }
}
