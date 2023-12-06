package mindera.bootcamp.exercises.bear_exercise;

public class DrunkBear extends Bear {



    @Override
    public void talk(){
        int randomNum = (int) (Math.random()*(1000-1+1)*1);
        if(randomNum == 2 || randomNum == 3){
            System.out.println("snoring.....");
        }
        System.out.println("I love you");
    }


}
