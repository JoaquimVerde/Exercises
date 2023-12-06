package mindera.bootcamp.exercises.restaurant_exercise;

public class Table {

    private static int tableCounter;

    private int tableID;

    private boolean free;

    private int numberOfChairs;



    public Table(){
        this.free = true;
        this.numberOfChairs = Util.randomNumber4to6();
        tableCounter++;
        this.tableID = tableCounter;
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public void cleanOrder(){

    }

    public int getTableID() {
        return tableID;
    }



    public boolean isFree(){
        return free;
    }

    public void occupy(){
        free = false;
    }

    public void unOccupy(){
        free = true;
    }


}
