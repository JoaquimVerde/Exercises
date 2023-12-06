package mindera.bootcamp.exercises.TodoList;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TodoList implements Iterable<TodoList.TodoItem> {

    Queue<TodoItem> todoList = new PriorityQueue<>();


    private String name;

    public TodoList(String name) {
        this.name = name;
    }


    public void addTask(TodoItem task) {
        todoList.add(task);
    }

    public void removeTask(TodoItem task) {
        todoList.remove(task);
    }

    public TodoItem getNextTask() {
        return todoList.peek();
    }


    public void getAllTasks() {
        while (!todoList.isEmpty()) {
            System.out.println(todoList.poll().getTaskName());
        }
    }

    public void getIncompleteTasks() {
        for (TodoItem task : todoList) {
            if (!task.isTaskDone) {
                System.out.println(task.taskName);
            }
        }
    }


    public void getCompleteTasks() {
        for (TodoItem task : todoList) {
            if (task.isTaskDone) {
                System.out.println(task.taskName);
            }
        }
    }

    public void markTaskComplete(TodoItem task) {
        task.setTaskDone(true);
    }

    public void markTaskIncomplete(TodoItem task) {
        task.setTaskDone(false);
    }

    @Override
    public Iterator<TodoItem> iterator() {
        return new Iterator<>() {
            TodoItem actual = todoList.peek();

            @Override
            public boolean hasNext() {
                while (getNextTask() != null) {
                    return true;
                }
                return false;
            }

            @Override
            public TodoItem next() {
                actual = getNextTask();
                while (hasNext()) {
                    System.out.println(actual.taskName);
                }
                return actual;
            }
        };
    }


    public static class TodoItem implements Comparable<TodoItem> {

        private String taskName;

        private String taskDescription;

        private boolean isTaskDone;

        private int priorityLevel;

        public TodoItem(String taskName, String taskDescription, int priorityLevel) {

            this.taskName = taskName;
            this.taskDescription = taskDescription;
            this.priorityLevel = priorityLevel;
        }

        public int getPriorityLevel() {
            return priorityLevel;
        }

        public String getTaskName() {
            return taskName;
        }

        public boolean isTaskDone() {
            return isTaskDone;
        }

        public void setTaskDone(boolean taskDone) {
            isTaskDone = taskDone;
        }


        @Override
        public int compareTo(TodoItem o) {
            return o.priorityLevel - this.priorityLevel;
        }

    }


}
