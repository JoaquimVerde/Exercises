package mindera.bootcamp.exercises.VehicleRental;

public final class RentalShop {

    private Vehicle[] vehicles;


    public RentalShop() {
        vehicles = new Vehicle[]{new Car("BMW"), new Car("Mercedes"), new Motorcycle("Harley-Davidson"), new Car("Ford"), new Motorcycle("Honda")};
    }


    public Vehicle rentAVehicle(VehicleType type) {
        Vehicle vehicle = checkIfVehicleAvailable(type);
        if (vehicle == null) {
            System.out.println("no vehicles of that type available.");
            return null;
        }
        vehicle.setRented(true);
        return vehicle;
    }

    private Vehicle checkIfVehicleAvailable(VehicleType type) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType() == type && !vehicle.isRented()) {
                return vehicle;
            }
        }
        return null;
    }

    public double receiveVehicle(Vehicle vehicle) {
        if (!checkIfVehicleBelongsToStore(vehicle)) {
            System.out.println("This vehicle does not belong to the store.");
            return 0;
        }
        double price = vehicle.getType().getPrice();
        if (vehicle.getFuel() < 20) {
            price += calculateCost(vehicle.getFuel());
        }
        vehicle.setRented(false);
        return price;
    }

    private double calculateCost(double fuel) {
        return (20 - fuel) * 2.5;
    }

    private boolean checkIfVehicleBelongsToStore(Vehicle returnedvehicle) {
        for (Vehicle vehicle : vehicles) {
            if (returnedvehicle == vehicle) {
                return true;
            }
        }
        return false;
    }
}
