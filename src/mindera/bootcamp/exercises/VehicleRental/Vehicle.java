package mindera.bootcamp.exercises.VehicleRental;

public abstract class Vehicle {

    private double fuel;
    private boolean rented;
    private final VehicleType type;
    private final String modelName;


    public Vehicle(String modelName, VehicleType type) {
        this.modelName = modelName;
        fuel = 25;
        rented = false;
        this.type = type;
    }


    public void refueled(double fuelAmount) {
        fuel += fuelAmount;
    }

    public void goOnATrip(int distance, double time) {
        double fuelSpent = calculateFuelConsumption(distance);
        double speed = calculateSpeed(distance, time);
        if (!checkIfTripPossible(fuelSpent, speed)) {
            return;
        }
        fuel -= fuelSpent;
        System.out.printf("You have reached your destination your fuel is now: %.1f\n", fuel);
    }

    private boolean checkIfTripPossible(double fuelSpent, double speed) {
        if (fuelSpent < 0 || speed < 0) {
            System.out.println("Error");
            return false;
        }
        if (fuelSpent > fuel) {
            System.out.println("not enough fuel!");
            return false;
        }
        if (speed > type.getMaximumSpeed()) {
            System.out.println("cannot make this trip at this speed!");
            return false;
        }
        return true;
    }

    private double calculateFuelConsumption(int distance) {
        return distance / type.getGasConsumption();
    }

    private double calculateSpeed(int distance, double time) {
        if (time == 0) {
            System.out.println("cannot divide by zero");
            return 0;
        }
        return distance / time;
    }

    public VehicleType getType() {
        return type;
    }

    public boolean isRented() {
        return rented;
    }

    public double getFuel() {
        return fuel;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public String getModelName() {
        return modelName;
    }
}
