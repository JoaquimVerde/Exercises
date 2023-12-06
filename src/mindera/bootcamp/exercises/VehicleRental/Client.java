package mindera.bootcamp.exercises.VehicleRental;

public class Client {

    private Vehicle vehicle;
    private String name;


    public Client(String name) {
        this.vehicle = null;
        this.name = name;
    }


    public void rentAVehicle(RentalShop shop, VehicleType type) {
        if (vehicle != null) {
            System.out.println("You already have a vehicle");
            return;
        }
        vehicle = shop.rentAVehicle(type);
    }

    public void goOnATrip(int distance, double time) {
        if (vehicle == null) {
            System.out.println("can´t go on a trip without a vehicle");
            return;
        }
        vehicle.goOnATrip(distance, time);
    }

    public void returnVehicle(RentalShop shop) {
        if (vehicle == null) {
            System.out.println("no vehicle to return");
            return;
        }
        double money = shop.receiveVehicle(vehicle);
        System.out.printf("Payed %.2f€\n", money);
        vehicle = null;
    }

    public void refuel(int amountToRefuel) {
        if (vehicle == null) {
            System.out.println("no vehicle to refuel");
            return;
        }
        vehicle.refueled(amountToRefuel);
    }

    public String getVehicleModelName() {
        if (vehicle == null) {
            System.out.println("this person does not have a vehicle.");
            return null;
        }
        System.out.println(name + " has a " + vehicle.getModelName());
        return vehicle.getModelName();
    }

    public String getName() {
        return name;
    }
}
