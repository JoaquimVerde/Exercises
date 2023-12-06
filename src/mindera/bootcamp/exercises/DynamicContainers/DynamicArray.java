package mindera.bootcamp.exercises.DynamicContainers;

import java.util.Arrays;
import java.util.Iterator;

public class DynamicArray<T> implements Iterable<T> {

    private int[] backbone;

    private int addCounter;


    public DynamicArray() {
        backbone = new int[4];
    }


    private void doubleArray() {
        int[] tempArray = new int[backbone.length * 2];
        for (int i = 0; i < backbone.length; i++) {
            tempArray[i] = backbone[i];
        }
        backbone = tempArray;
    }

    private void shrinkArray() {
        int[] tempArray = new int[backbone.length / 2];
        for (int i = 0; i < backbone.length / 2; i++) {
            tempArray[i] = backbone[i];
        }
        backbone = tempArray;
    }
    //copy one to the other


    public void add(int intToAdd) {
        if (needsGrowth()) {
            doubleArray();
        }
        backbone[addCounter] = intToAdd;
        addCounter++;
    }

    public void printList() {
       /* for (int i = 0; i < backbone.length; i++) {
            System.out.println(backbone[i]);
        }*/
        System.out.println(Arrays.toString(backbone));
    }


    public boolean needsGrowth() {
        return addCounter == backbone.length;
        //return backbone[backbone.length - 1] != 0;
    }


    public void remove(int intToRemove) {

        for (int i = 0; i < backbone.length; i++) {
            if (backbone[i] == intToRemove) {
                for (int j = i; j < backbone.length - 1; j++) {
                    backbone[j] = backbone[j + 1];
                }
                addCounter--;
                break;
            }
        }
        if (needsShrink()) {
            shrinkArray();
        }
        //reorder elements after removed
        //check if array can shrink
    }


    private boolean needsShrink() {
        return addCounter == backbone.length / 2;

        /*for (int i = backbone.length / 2; i < backbone.length; i++) {
            if (backbone[i] != 0) {
                return true;
            }
        }
        return false;*/
    }

    public int[] getBackbone() {
        return backbone;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator(backbone);
    }
}
