package mindera.bootcamp.exercises.DynamicContainers;

import java.util.Iterator;

public class NodeContainer implements Iterable {

    private final Node head;

    private int itemCounter;


    public NodeContainer() {
        head = new Node(0);
        itemCounter = 0;
    }

    public void add(int numberToAdd) {
        Node lastNode = getLastNode();
        itemCounter++;
        lastNode.setNext(new Node(numberToAdd));
    }

    public void remove(int numberToRemove) {
        Node current = head;
        while (current.hasNext()) {
            if (current.getNext().value != numberToRemove) {
                current = current.next;
            } else {
                current.setNext(current.next.getNext());
            }
        }

    }

    public Node getLastNode() {
        Node current = head;
        while (current.hasNext()) {
            current = current.next;
        }
        return current;
    }

    public void printList() {
        Node current = head;
        while (current.hasNext()) {
            System.out.println(" " + current.value + " ");
            current = current.next;
        }
        System.out.println(" " + current.value + " ");

    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            Node actual = head;

            @Override
            public boolean hasNext() {
                return actual.hasNext();
            }

            @Override
            public Node next() {
                actual = actual.getNext();
                return actual.getObject();
            }
        };
    }


    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }


        public boolean hasNext() {
            return next != null;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }


        public Node getObject() {
            return next;
        }
    }
}







