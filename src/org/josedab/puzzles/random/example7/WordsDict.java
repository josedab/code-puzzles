package org.josedab.puzzles.random.example7;

import java.util.HashMap;
import java.util.Map;

public class WordsDict {

    public static void main(String[] args) {
        String content = "there is something going on there";

        String[] words = content.split("\\s");

        dictionaryOfWords(words);

    }

    private static void dictionaryOfWords(String[] words) {

        Map<String, Integer> frequencies = new HashMap<String, Integer>();
        for (String word : words) {
            int frequency = 1;
            if (frequencies.containsKey(word)) {
                frequency = frequencies.get(word) + 1;
            }
            frequencies.put(word, frequency);
        }
        System.out.println(frequencies);
    }

}
