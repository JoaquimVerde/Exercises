package mindera.bootcamp.exercises.ExerciseProducerConsumer;

public class Main {

    public static void main(String[] args) {


        Restaurant restaurant = new Restaurant(10);

        Thread[] cooks = new Thread[3];
        Thread[] clients = new Thread[2];


        for (int i = 0; i < cooks.length; i++) {
            cooks[i] = new Thread(new Cook(restaurant, i));
            cooks[i].start();
        }

        for (int i = 0; i < clients.length; i++) {
            clients[i] = new Thread(new Client(restaurant, i));
            clients[i].start();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        for (Thread cook : cooks) {
            cook.interrupt();
        }

        restaurant.close();

    }

}
