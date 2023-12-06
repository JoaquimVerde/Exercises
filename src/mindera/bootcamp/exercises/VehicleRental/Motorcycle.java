package mindera.bootcamp.exercises.VehicleRental;

public class Motorcycle extends Vehicle {


    public Motorcycle(String modelName) {
        super(modelName, VehicleType.MOTORCYCLE);
    }


    @Override
    public void goOnATrip(int distance, double time) {
        if (distance > 80) {
            System.out.println("cannot make that trip");
            return;
        }
        super.goOnATrip(distance, time);
    }

}
