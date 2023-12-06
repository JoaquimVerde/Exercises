package mindera.bootcamp.exercises.DupeFruits;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Fruits> fruitList = new ArrayList<>();

        fruitList.add(new Orange(13));
        fruitList.add(new Apple(2));
        fruitList.add(new Orange(7));
        fruitList.add(new Orange(2));
        fruitList.add(new Apple(10));
        fruitList.add(new Orange(17));
        fruitList.add(new Orange(13));


        DupeFinder<Fruits> dupeFinder = new DupeFinder<>(fruitList);

        System.out.println(dupeFinder.checkDupes());
        System.out.println(dupeFinder.getDupes());


    }
}
