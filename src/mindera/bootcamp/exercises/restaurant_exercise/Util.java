package mindera.bootcamp.exercises.restaurant_exercise;

public class Util {

    public static int randomNumber0to4(){
        return (int) (Math.random()*5);
    }

    public static int randomNumber10to19(){
        return (int) ((Math.random()*(19-10+1)+10));
    }
    public static int randomNumber4to6(){
        return (int) ((Math.random()*(6-4+1)+4));
    }

    public static int randomNumber0to18(){
        return (int) ((Math.random()*19));
    }



}
