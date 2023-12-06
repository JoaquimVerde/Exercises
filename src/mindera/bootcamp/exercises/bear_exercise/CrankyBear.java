package mindera.bootcamp.exercises.bear_exercise;

public class CrankyBear extends Bear {

    private int numOfSadSongsSung;


    public void singASadSong(){
        System.out.println("singing a Sad Song.");
        numOfSadSongsSung++;
    }




    @Override
    public void talk(){
        if(getBattery() > 2){
            int randomSong = (int) (Math.random()*(2-1+1)+1);
            if(randomSong == 1 || (randomSong == 2 && numOfSadSongsSung > 0)){
                System.out.println("I love you");
                decreaseBattery();
                talk();
            return;
            }
            if(randomSong == 2){
                singASadSong();
                decreaseBattery();
                talk();
                return;
            }
        }
        if(numOfSadSongsSung < 1){
            System.out.println("singing sad song");
            System.out.println("................");
            return;
        }
        System.out.println("................");
    }
}
