package mindera.bootcamp.exercises.DupeFruits;

import java.util.Objects;

public abstract class Fruits implements Comparable<Fruits> {

    private int acidity;

    private FruitType type;


    public Fruits(int acidity, FruitType type) {
        this.acidity = acidity;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Fruits fruits = (Fruits) o;
        return acidity == fruits.acidity && type == fruits.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(acidity, type);
    }

    @Override
    public String toString() {
        return type +
                " acidity = " + acidity;
    }

    public int compareTo(Fruits o) {
        return acidity - o.acidity;
    }
}
