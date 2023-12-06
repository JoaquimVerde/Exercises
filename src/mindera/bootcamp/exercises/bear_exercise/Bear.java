package mindera.bootcamp.exercises.bear_exercise;

public class Bear {

    private int battery;



    public Bear(){
        battery = 5;
    }



    public void decreaseBattery(){
        battery--;
    }

    public int getBattery(){
        return battery;
    }



    public void talk(){

        System.out.println("I love you");
        decreaseBattery();
    }
}
