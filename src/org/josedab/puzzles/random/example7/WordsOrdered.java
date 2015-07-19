package org.josedab.puzzles.random.example7;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class WordsOrdered {

    public static void main(String[] args) {
        String content = "there is something going on there";

        String[] words = content.split("\\s");

        Map<String, Integer> dict = dictionaryOfWords(words);
        System.out.println(orderMap(dict));
        System.out.println(orderMap2(dict));

    }

    private static Map<String, Integer> dictionaryOfWords(String[] words) {

        Map<String, Integer> frequencies = new TreeMap<String, Integer>();
        for (String word : words) {
            int frequency = 1;
            if (frequencies.containsKey(word)) {
                frequency = frequencies.get(word) + 1;
            }
            frequencies.put(word, frequency);
        }
        return frequencies;
    }

    // Not use of sorted set
    private static Map<String, Integer> orderMap(Map<String, Integer> dict) {

        List<Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(
                dict.entrySet());
        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                int result = o2.getValue().compareTo(o1.getValue());
                if (result == 0) {
                    result = o1.getKey().compareTo(o2.getKey());
                }
                return result;
            }
        });

        Map<String, Integer> result = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    // Use of sorted set
    private static Map<String, Integer> orderMap2(Map<String, Integer> dict) {

        SortedMap<String, Integer> result = new TreeMap<String, Integer>(new ValueComparator(dict));
        result.putAll(dict);
        return result;
    }

}
