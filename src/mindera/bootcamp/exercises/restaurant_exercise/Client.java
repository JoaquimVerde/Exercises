package mindera.bootcamp.exercises.restaurant_exercise;

public class Client {

    private String name;

    private String order;

    private boolean paid;




    public Client(String name){
        this.name = name;
    }



    public void askForTable(int numOfClients){
        System.out.println("Hi, I would like a table for "+numOfClients);

    }

    public static String generateName(){
        String[] names = {"Mark", "Louis", "Jane", "Grace", "Mary", "John", "Michael","Jack", "Sandy", "Monica", "Martin", "David", "Gerard", "Andre", "Hanna", "Helen", "Nick", "Hugh","Xavier"};
        return names[Util.randomNumber0to18()];
    }

    private void setOrder(){

        String[] randomOrder = {"Fish", "Eggs", "Potatoes", "Rice", "Meat"};
        order = randomOrder[Util.randomNumber0to4()];
    }

    public String getOrder(){
        setOrder();
        return order;
    }
    public String getChosenOrder(){
        return order;
    }

    public String getName() {
        return name;
    }


    public void pay(){
        System.out.println("Thank you for the meal.");
        paid = true;
    }

    public boolean isPaid(){
        return paid;
    }



    public void setRestaurant(){

    }
    public void checkRestaurantPresence(){

    }


}
