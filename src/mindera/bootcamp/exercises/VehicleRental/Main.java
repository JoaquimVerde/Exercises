package mindera.bootcamp.exercises.VehicleRental;

public class Main {
    public static void main(String[] args) {

        Client joaquim = new Client("Joaquim");
        Client joana = new Client("Joana");
        Client jaime = new Client("Jaime");

        RentalShop shop2 = new RentalShop();


        joaquim.rentAVehicle(shop2, VehicleType.MOTORCYCLE);
        joaquim.getVehicleModelName();

        joana.rentAVehicle(shop2, VehicleType.MOTORCYCLE);
        joana.getVehicleModelName();

        jaime.rentAVehicle(shop2, VehicleType.CAR);
        jaime.getVehicleModelName();

        System.out.println("############################################");

        joaquim.goOnATrip(75, 1);

        joaquim.returnVehicle(shop2);

        joaquim.refuel(6);

        joaquim.returnVehicle(shop2);


    }
}
