package mindera.bootcamp.exercises.ExerciseProducerConsumer;

import java.util.Random;

public class Cook implements Runnable {

    private final Restaurant restaurant;

    private final Random random;

    private final int id;


    public Cook(Restaurant restaurant, int id) {
        this.restaurant = restaurant;
        this.random = new Random();
        this.id = id;
    }


    @Override
    public void run() {
        while (true) {
            Order order = new Order(random.nextInt(110));
            try {
                restaurant.placeOrder(order);
                System.out.println("Cook " + id + " placed Order " + order.getId() + ".");
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
