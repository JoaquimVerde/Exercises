package mindera.bootcamp.exercises.TodoList;

public class Main {
    public static void main(String[] args) {

        TodoList todoList = new TodoList("ToDo");

        TodoList.TodoItem item5 = new TodoList.TodoItem("Comida", "Comprar Comida", 8);
        TodoList.TodoItem item1 = new TodoList.TodoItem("Compras", "Compras de Natal", 7);
        TodoList.TodoItem item2 = new TodoList.TodoItem("Estudar", "Estudar para teste", 6);
        TodoList.TodoItem item3 = new TodoList.TodoItem("Lavandaria", "Lavar roupa", 5);
        TodoList.TodoItem item4 = new TodoList.TodoItem("Jantar", "Fazer jantar", 4);
        TodoList.TodoItem item6 = new TodoList.TodoItem("Aspirar", "Aspirar casa", 1);

        todoList.addTask(item1);
        todoList.addTask(item4);
        todoList.addTask(item5);
        todoList.addTask(item2);
        todoList.addTask(item3);
        todoList.addTask(item6);

        todoList.getAllTasks();


    }
}
