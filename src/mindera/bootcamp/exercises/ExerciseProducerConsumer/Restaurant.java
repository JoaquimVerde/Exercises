package mindera.bootcamp.exercises.ExerciseProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class Restaurant {

    private final Queue<Order> orders = new LinkedList<>();

    private final int MAX_ORDERS;

    private boolean isOpen;


    public Restaurant(int maxOrders) {
        isOpen = true;
        MAX_ORDERS = maxOrders;
    }

    public void placeOrder(Order order) throws InterruptedException {
        synchronized (orders) {
            if (orders.size() == MAX_ORDERS) {
                orders.wait();
            }
            orders.add(order);
            orders.notifyAll();
        }
    }

    public Order takeOrder() throws InterruptedException {
        synchronized (orders) {
            if (orders.isEmpty()) {
                orders.wait();
            }
            if (!orders.isEmpty() && isOpen) {
                Order order = orders.poll();
                orders.notifyAll();
                return order;
            }
        }
        return null;
    }

    public void close() {
        isOpen = false;
    }


}
