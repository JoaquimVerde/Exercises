package mindera.bootcamp.exercises.car_exercise;

public class Car {

    public void moving(){

        if(Tires.getWear() > 0){
            Tires.decreaseWear();
            moving();
            return;
        }

        Radio.playSong();
        System.out.println("Cannot move anymore, change your tire.");

    }

}
