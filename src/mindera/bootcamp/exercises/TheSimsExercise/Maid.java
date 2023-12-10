package mindera.bootcamp.exercises.TheSimsExercise;

public class Maid {

    private String name;
    private int price;
    private boolean isCleaning;


    public Maid(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public void setCleaning(boolean cleaning) {
        isCleaning = cleaning;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isCleaning() {
        return isCleaning;
    }
}
