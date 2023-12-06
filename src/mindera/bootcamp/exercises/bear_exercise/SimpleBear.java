package mindera.bootcamp.exercises.bear_exercise;

public class SimpleBear extends Bear {


    /*@Override
    public void talk(){
        if(getBattery() > 0){
        System.out.println("I love you");
        decreaseBattery();
        talk();
        return;
        }

        System.out.println("...........");
    }*/


    //TAMBÉM DÁ ESTE:
    @Override
    public void talk(){
        while(getBattery()>0){
            super.talk();
        }
        System.out.println("...........");
    }
}
