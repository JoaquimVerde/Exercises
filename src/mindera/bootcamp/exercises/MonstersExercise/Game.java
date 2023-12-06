package mindera.bootcamp.exercises.MonstersExercise;

public class Game {

    private Player player1;

    private Player player2;

    private Monster[] availableCards;

    private Supernatural[] supernaturals;


    public Game(Player player1, Player player2) {

        this.player1 = player1;
        this.player2 = player2;
        this.availableCards = new Monster[]{new Vampire(), new Werewolf(), new Mummy(), new Vampire(), new Werewolf(), new Mummy(), new Vampire(), new Werewolf(), new Mummy(), new Vampire(), new Werewolf(), new Mummy()};
        this.supernaturals = new Supernatural[]{new Fairy(), new Witch()};
    }

    private void numOfCardsForPlayer() {
        int rand = (int) (Math.random() * (6 - 3 + 1) + 3);
        Monster[] player1Hand = new Monster[rand];
        Monster[] player2Hand = new Monster[rand];
        player1.setHand(player1Hand);
        player1.setAliveMonsters(player1.getHand().length);
        player2.setHand(player2Hand);
        player2.setAliveMonsters(player1.getHand().length);
        System.out.println(player1.getName() + " draws " + player1.getHand().length + " cards.");
        System.out.println(player2.getName() + " draws " + player2.getHand().length + " cards.");
    }

    private void pickCards() {
        for (int i = 0; i < player1.getHand().length; i++) {
            for (int j = 0; j < availableCards.length / 2; j++) {
                int rand = (int) (Math.random() * (availableCards.length / 2));
                Monster card = availableCards[rand];
                player1.getHand()[i] = card;
            }
        }
        for (int i = 0; i < player2.getHand().length; i++) {
            for (int j = availableCards.length / 2; j < availableCards.length; j++) {
                int rand = (int) (Math.random() * (((availableCards.length - 1) - 6 + 1)) + 6);
                Monster card = availableCards[rand];
                player2.getHand()[i] = card;
            }
        }
    }

    public void distributeCards() {
        numOfCardsForPlayer();
        pickCards();
    }

    public void player1Attack() {

        if (!player1.stillHasMonsters() || !player2.stillHasMonsters()) {
            return;
        }

        Monster chosenMonsterP1 = player1.playCard();
        Monster chosenMonsterP2 = player2.playCard();

        if (chosenMonsterP1 instanceof Mummy) {
            ((Mummy) chosenMonsterP1).setNumOfAppearances(((Mummy) chosenMonsterP1).getNumOfAppearances() + 1);
            if (((Mummy) chosenMonsterP1).getNumOfAppearances() == 3) {
                chosenMonsterP1.setHealth(chosenMonsterP1.getHealth() - 2);
                ((Mummy) chosenMonsterP1).setNumOfAppearances(0);
                System.out.println(player1.getName() + " tried to attack again with Mummy. Mummy rolled and self-inflicted damage. its health is now " + chosenMonsterP1.getHealth());
                return;
            }

        }
        if (chosenMonsterP1 instanceof Vampire || chosenMonsterP1 instanceof Werewolf) {

            for (Monster card : player1.getHand()) {
                if (card instanceof Mummy) {
                    ((Mummy) card).setNumOfAppearances(0);
                }
            }
        }

        chosenMonsterP1.attack(chosenMonsterP2);
        System.out.println(player1.getName() + " attacks with " + chosenMonsterP1.getName() + ", and " + player2.getName() + " defends with " + chosenMonsterP2.getName());
        System.out.println(chosenMonsterP2.getName() + " has now this health: " + chosenMonsterP2.getHealth());
        player2.monsterIndex(chosenMonsterP2);

    }

    public void player2Attack() {
        if (!player1.stillHasMonsters() || !player2.stillHasMonsters()) {
            return;
        }

        Monster chosenMonsterP2 = player2.playCard();
        Monster chosenMonsterP1 = player1.playCard();

        if (chosenMonsterP2 instanceof Mummy) {
            ((Mummy) chosenMonsterP2).setNumOfAppearances(((Mummy) chosenMonsterP2).getNumOfAppearances() + 1);
            if (((Mummy) chosenMonsterP2).getNumOfAppearances() == 3) {
                chosenMonsterP2.setHealth(chosenMonsterP2.getHealth() - 2);
                ((Mummy) chosenMonsterP2).setNumOfAppearances(0);
                System.out.println(player2.getName() + " tried to attack again with Mummy. Mummy rolled and self-inflicted damage. its health is now " + chosenMonsterP2.getHealth());
                return;
            }
        }
        if (chosenMonsterP2 instanceof Vampire || chosenMonsterP2 instanceof Werewolf) {
            for (Monster card : player2.getHand()) {
                if (card instanceof Mummy) {
                    ((Mummy) card).setNumOfAppearances(0);
                }
            }
        }
        chosenMonsterP2.attack(chosenMonsterP1);
        System.out.println(player2.getName() + " attacks with " + chosenMonsterP2.getName() + ", and " + player1.getName() + " defends with " + chosenMonsterP1.getName());
        System.out.println(chosenMonsterP1.getName() + " has now this health: " + chosenMonsterP1.getHealth());
        player1.monsterIndex(chosenMonsterP1);
    }


    public void generateObstacle(Monster monster1, Monster monster2) {
        int rand = (int) (Math.random() * 4);
        if (rand == 0) {
            supernaturals[0].attack(monster1, monster2);
            System.out.println("Fairy attack!");
            player1.monsterIndex(monster1);
            player2.monsterIndex(monster2);
            return;
        }

        if (rand == 1) {
            if (supernaturals[1] instanceof Witch w) {
                if (w.isDead()) {
                    return;
                }
            }
            supernaturals[1].attack(monster1, monster2);
            System.out.println("Witch attack!");
            player1.monsterIndex(monster1);
            player2.monsterIndex(monster2);
        }
    }

    public void match() {

        player1Attack();
        if (!player2.stillHasMonsters()) {
            System.out.println(player2.getName() + " monsters all died. " + player1.getName() + " wins the game!");
            return;
        }
        player2Attack();
        if (!player1.stillHasMonsters()) {
            System.out.println(player1.getName() + " monsters all died. " + player2.getName() + " wins the game!");
            return;
        }
        

        generateObstacle(player1.playCard(), player2.playCard());


        match();
    }


}




