package mindera.bootcamp.exercises.RockPaperScissors_Enum_Exercise;

public abstract class Match {

    public static void match(Player p1, Player p2){

        if(p1.getNumOfWins() < 3 && p2.getNumOfWins() < 3){
            round(p1,p2);
            match(p1,p2);
            return;
        }
        if(p1.getNumOfWins()>2){
            System.out.println(p1.getName()+" wins the Match!!");
            p1.ResetWins();
            p2.ResetWins();
            return;
        }
        System.out.println(p2.getName()+" wins the Match!!");
        p1.ResetWins();
        p2.ResetWins();
    }

    private static void round(Player p1, Player p2){

        PlayType p1play = p1.play();
        PlayType p2play = p2.play();

        if(p1play == p2play){
            System.out.println("It's a draw.");
            return;
        }

        if(p1play == PlayType.ROCK && p2play == PlayType.PAPER || p1play == PlayType.SCISSORS && p2play == PlayType.ROCK || p1play == PlayType.PAPER && p2play == PlayType.SCISSORS){
            System.out.println(p2.getName()+" wins the game!");
            p2.increaseWinsBy1();
            return;
        }

        System.out.println(p1.getName()+" wins the game!");
        p1.increaseWinsBy1();
    }
}
