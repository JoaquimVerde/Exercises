package mindera.bootcamp.exercises.ExerciseProducerConsumer;

public class Client implements Runnable {


    private int id;

    private Restaurant restaurant;


    public Client(Restaurant restaurant, int id) {
        this.id = id;
        this.restaurant = restaurant;
    }


    @Override
    public void run() {
        while (true) {
            try {
                Order order = restaurant.takeOrder();
                if (order != null) {
                    System.out.println("Client " + id + " took order " + order.getId());
                    Thread.sleep(2000);
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
