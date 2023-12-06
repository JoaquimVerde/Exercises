package mindera.bootcamp.exercises.DupeFruits;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DupeFinder<E> {

    private List<Fruits> fruits;


    public DupeFinder(List fruits) {
        this.fruits = fruits;
    }


    public int checkDupes() {
        Set<Fruits> temp = new HashSet<>(fruits);
        return fruits.size() - temp.size();

    }

    public List<Fruits> getDupes() {
        Set<Fruits> temp = new HashSet<>(fruits);
        List<Fruits> temp2 = fruits;
        for (Fruits fruit : temp) {
            temp2.remove(fruit);
        }
        return temp2;
    }

    /*public List<E> sortedDupes() {
        List<E> list = getDupes();
        sort.reverseOrder

    }*/
}
