package mindera.bootcamp.exercises.RockPaperScissors_Enum_Exercise;

public class Player {

    private String name;
    private int numOfWins;


    public Player (String name){
        this.name = name;
    }

    public int getNumOfWins() {
        return numOfWins;
    }

    public void increaseWinsBy1(){
        numOfWins++;
    }

    public void ResetWins(){ this.numOfWins = 0; }

    public String getName(){
        return name;
    }

    public PlayType play(){
        int randomNumber = (int) (Math.random()*(3-1+1)+1);
        if(randomNumber == 1){
            return PlayType.ROCK;
        }
        if(randomNumber == 2){
            return PlayType.PAPER;
        }
        return PlayType.SCISSORS;
    }

    //PlayType.values()[(int) (math.random() * 3)];
}
