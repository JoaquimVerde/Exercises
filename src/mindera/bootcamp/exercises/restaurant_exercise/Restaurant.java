package mindera.bootcamp.exercises.restaurant_exercise;

public class Restaurant {

    private static int restaurantCount;

    private Client[] clients;

    private Table[] tables;

    private String name;


    private boolean fullCapacity;


    private int numberOfOccupiedTables;




    public Restaurant(String name){

        this.name = name;
        this.clients = new Client[Util.randomNumber10to19()];
        this.tables = new Table[Util.randomNumber4to6()];
        assignNumOfChairs();
        assignClients();
        restaurantCount++;
    }

    public Table[] assignNumOfChairs(){
        for (int i = 0; i < tables.length; i++) {
            tables[i] = new Table();
        }
        return tables;
    }

    private Client[] assignClients(){
        for (int i = 0; i < clients.length; i++) {
            clients[i] = new Client(Client.generateName());
        }
        return clients;
    }


    public String getRestaurantName(){
        return name;
    }

    public String getClientName(int i){
        System.out.println("This client's name is "+ clients[i].getName() + ".");
        return clients[i].getName();
    }



    public int getNumberOfOccupiedTables() {
        System.out.println("There are currently "+ numberOfOccupiedTables + " occupied tables.");
        return numberOfOccupiedTables;
    }

    public int getNumOfTables() {
        System.out.println("This restaurant " +getRestaurantName()+ " has "+ tables.length + " tables.");
        return tables.length;
    }

    public int getNumOfClients() {
        System.out.println("This restaurant "+getRestaurantName()+" currently has "+ clients.length + " clients.");
        return clients.length;
    }

    public boolean isFullCapacity() {
        return numberOfOccupiedTables >= tables.length;
    }

    public static int getRestaurantCount(){
        return restaurantCount;
    }
    public int findTable(int numberOfChairs){
        for (int i = 0; i < tables.length; i++) {
            if (!tables[i].isFree()) {
                continue;
            }
            if(tables[i].getNumberOfChairs() >= numberOfChairs){
                tables[i].occupy();
                numberOfOccupiedTables++;

                System.out.println("your table is "+ tables[i].getTableID());
                return tables[i].getTableID();
            }
        }
        System.out.println("No tables available for that number of chairs.");
        return 0;
    }

    public int freeTable(){
        for (int i = 0; i < tables.length; i++) {
            if(tables[i].isFree()){
                System.out.println("Table number "+tables[i].getTableID()+" is free.");
                return tables[i].getTableID();
            }
        }
        System.out.println("No tables available.");
        return 0;
    }

    public String receiveOrder(int i){

        String clientOrder = clients[i].getOrder();

        System.out.println(clients[i].getName() + " wants to order the " + clientOrder);
        return clientOrder;
    }
    public String getClientOrder(int i){
        return clients[i].getChosenOrder();
    }

    public boolean isTableFree(int tableID){
        return tables[tableID - 1].isFree();
    }

    private void occupyTable(int tableID){
        tables[tableID-1].occupy();
    }


    private boolean checkIfTableCanBeFreed(int i) {
        return clients[i].isPaid();
    }

    public void receivePayment(int i){
        clients[i].pay();
    };

    public void cleanTable(int i){
        if(checkIfTableCanBeFreed(i)){
            System.out.println("This table can be freed");
            tables[i].unOccupy();
            return;
        }
        System.out.println("Client has not paid yet");
    }






}
