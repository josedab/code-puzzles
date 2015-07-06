package org.josedab.puzzles.example7;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator<String> {

    private Map<String, Integer> frequencies;

    public ValueComparator(Map<String, Integer> frequencies) {
        this.frequencies = frequencies;
    }

    @Override
    public int compare(String o1, String o2) {
        int result = frequencies.get(o2).compareTo(frequencies.get(o1));
        if (result == 0) {
            result = o1.compareTo(o2);
        }
        return result;
    }

}
