package mindera.bootcamp.exercises.DynamicContainers;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {

        NodeContainer nodeContainer = new NodeContainer();

        nodeContainer.add(1);
        nodeContainer.add(2);
        nodeContainer.add(3);
        /*nodeContainer.printList();
        nodeContainer.remove(2);
        nodeContainer.printList();*/

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(0);
        dynamicArray.add(7);
        /*dynamicArray.printList();

        System.out.println("##############################################");

        dynamicArray.remove(3);
        dynamicArray.printList();

        System.out.println("##############################################");
        dynamicArray.remove(5);
        dynamicArray.remove(0);
        dynamicArray.printList();*/

        MyIterator iterator = new MyIterator(dynamicArray.getBackbone());

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }

        System.out.println("#".repeat(10));
        //System.out.println(dynamicArray.iterator());

        Iterator iterator1 = new NodeContainer().iterator();


        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());

        }


    }
}
