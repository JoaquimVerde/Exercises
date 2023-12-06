package mindera.bootcamp.exercises.WordHistogram;

public class Main {
    public static void main(String[] args) {

        WordHistogram histogram = new WordHistogram();

        histogram.analyseString("Hello are you there are you there there ?");


        /*for (String word : histogram) {
            System.out.println(word + " : " + histogram.get(word));
        }*/

        histogram.printList();


    }


}
