package mindera.bootcamp.exercises.bear_exercise;

public class Main {
    public static void main(String[] args) {


        Bear simplebear1 = new SimpleBear();
        Bear crankybear1 = new CrankyBear();
        Bear drunkbear1 = new DrunkBear();

        simplebear1.talk();
        System.out.println("########################################################");
        crankybear1.talk();
        System.out.println("########################################################");
        drunkbear1.talk();
        System.out.println("########################################################");

        TheShop shop1 = new TheShop("shop1");
        TheShop shop2 = new TheShop("shop2");

        shop1.createBear();
        shop1.createBear();
        shop1.createBear();
        shop1.createBear();
        shop1.createBear();
        shop1.createBear();

        shop1.printNumOfBearsCreated();


        shop2.createBear();
        shop2.createBear();


        shop2.printNumOfBearsCreated();

        //TheShop.compareShops(shop1,shop2);

        TheShop.compareShops(shop1, shop2);


    }
}
