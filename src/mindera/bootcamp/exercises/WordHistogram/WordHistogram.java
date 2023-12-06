package mindera.bootcamp.exercises.WordHistogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordHistogram implements Iterable<String> {


    private Map<String, Integer> wordHistogram;


    public void analyseString(String toAnalyse) {
        wordHistogram = new HashMap<>();

        for (String word : toAnalyse.toLowerCase().split("(\s|[.,!?:;\"-])+")) {
            wordHistogram.put(word, wordHistogram.getOrDefault(word, 0) + 1);
        }

    }

    public int get(String word) {
        return wordHistogram.get(word);
    }


    @Override
    public Iterator iterator() {
        return wordHistogram.keySet().iterator();
    }

    public void printList() {
        int longestWord = 0;
        for (String word : wordHistogram.keySet()) {
            if (word.length() > longestWord) {
                longestWord = word.length();
            }
        }
        for (String word : wordHistogram.keySet()) {
            System.out.print(word);
            System.out.print(" ".repeat(longestWord - word.length()));

            System.out.print(" | ");
            System.out.print("\u001B[34m" + "*".repeat(wordHistogram.get(word)));
            System.out.println("\u001B[0m");

        }
    }


}
