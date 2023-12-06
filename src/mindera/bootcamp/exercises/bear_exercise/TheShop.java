package mindera.bootcamp.exercises.bear_exercise;

public class TheShop {


    private int numOfBearsCreated;


    private String name;




    public TheShop(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printNumOfBearsCreated(){
        System.out.println("This shop created "+numOfBearsCreated+ " bears.");
    }

    /*public static void compareShops(TheShop shop1, TheShop shop2) {
        if (shop1.numOfBearsCreated < shop2.numOfBearsCreated) {
            System.out.println(shop2.getName() + " created more bears and wins the contest.");
            return;
        }
        if (shop1.numOfBearsCreated > shop2.numOfBearsCreated) {
            System.out.println(shop1.getName() + " created more bears and wins the contest.");
            return;
        }
        System.out.println("Both shops have the same number of bears, it's a draw.");
    }*/


    //O PROF FEZ ASSIM, A RETORNAR UMA SHOP:
    public static TheShop compareShops(TheShop shop1, TheShop shop2) {
        if (shop1.numOfBearsCreated < shop2.numOfBearsCreated) {
            System.out.println(shop2.getName() + " created more bears and wins the contest.");
            return shop2;
        }
        if (shop1.numOfBearsCreated > shop2.numOfBearsCreated) {
            System.out.println(shop1.getName() + " created more bears and wins the contest.");
            return shop1;
        }
        System.out.println("Both shops have the same number of bears, it's a draw.");
        return null;
    }

    /*public Bear createBear(){
        Bear bear = new Bear();
        numOfBearsCreated++;
        if(numOfBearsCreated % 5 == 0){
            bear = new CrankyBear();
            System.out.println("A Cranky bear was born.");
            System.out.println("##########################################");
            return bear;
        }
        if(numOfBearsCreated % 2 == 0){
            bear = new SimpleBear();
            System.out.println("A Simple bear was born.");
            System.out.println("##########################################");
            return bear;
        }
        bear = new DrunkBear();
        System.out.println("A Drunk bear was born.");
        System.out.println("##########################################");
        return bear;
    }*/


    //ESTA FOI A CORRECÇÃO DO PROFESSOR (FUNCIONA DE FORMA IGUAL MAS É MAIS SIMPLES):
    public Bear createBear(){
        numOfBearsCreated++;
        if(numOfBearsCreated % 5 == 0){
            System.out.println("A Cranky bear was born.");
            System.out.println("##########################################");
            return new CrankyBear();
        }
        if(numOfBearsCreated % 2 == 0){
            System.out.println("A Simple bear was born.");
            System.out.println("##########################################");
            return new SimpleBear();
        }
        System.out.println("A Drunk bear was born.");
        System.out.println("##########################################");
        return new DrunkBear();
    }
    
}
