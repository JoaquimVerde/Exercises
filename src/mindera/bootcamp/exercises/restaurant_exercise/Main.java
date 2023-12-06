package mindera.bootcamp.exercises.restaurant_exercise;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Restaurant cufra = new Restaurant("Cufra");

        cufra.getNumOfTables();
        cufra.getNumOfClients();

        cufra.getClientName(0);
        cufra.receiveOrder(0);
        cufra.findTable(4);
        cufra.receivePayment(0);
        cufra.cleanTable(0);
        System.out.println(cufra.isTableFree(1));




        



    }
}
