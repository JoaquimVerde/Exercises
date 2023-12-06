package mindera.bootcamp.exercises.VehicleRental;

public enum VehicleType {

    CAR(10, 120, 30),
    MOTORCYCLE(7, 100, 20);


    private final double gasConsumption;
    private final int maximumSpeed;
    private final int price;


    VehicleType(double gasConsumption, int maximumSpeed, int price) {
        this.gasConsumption = gasConsumption;
        this.maximumSpeed = maximumSpeed;
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public double getGasConsumption() {
        return gasConsumption;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }


}
