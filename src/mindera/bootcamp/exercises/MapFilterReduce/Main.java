package mindera.bootcamp.exercises.MapFilterReduce;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String prayer = "Oh Lord, won't you buy me a trash Mercedes Benz\n" +
                "My friends all drive trash Porsches, I must make trash amends\n" +
                "Worked hard all my trash lifetime, no help from my trash friends\n" +
                "So Lord, won't you buy me a trash Mercedes Benz";

        String[] splitted = prayer.split(" ");


        Stream<String> stringsStream = Arrays.stream(splitted);

        System.out.println(stringsStream.filter(string -> !string.equals("trash"))
                .reduce("", (a, b) -> a + " " + b).toUpperCase());


    }


}
