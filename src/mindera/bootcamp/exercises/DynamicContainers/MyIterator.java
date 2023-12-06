package mindera.bootcamp.exercises.DynamicContainers;

import java.util.Iterator;

public class MyIterator implements Iterator {

    private int[] array;
    private int index = 0;

    public MyIterator(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public Integer next() {
        return array[index++];
    }
}
