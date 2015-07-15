package org.josedab.puzzles.example12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindNonRepeatedCharacter {

    public static void main(String[] args) {
        System.out.println(findFirstNoRepeatedCharacter("stress"));
        System.out.println(findFirstNoRepeatedCharacter2("stress"));

    }

    // O(n^2)
    public static char findFirstNoRepeatedCharacter(String cad) {

        char result = '?';
        for (int i = 0; i < cad.length(); i++) {
            char currentChar = cad.charAt(i);
            boolean success = true;

            for (int j = i + 1; j < cad.length(); j++) {
                char candidate = cad.charAt(j);
                if (currentChar == candidate) {
                    success = false;

                }
            }

            if (success) {
                result = currentChar;
                break;
            }
        }
        return result;
    }

    // O(n), sacrifices on space. An histogram not really needed
    public static char findFirstNoRepeatedCharacter2(String cad) {

        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        char result = '?';
        for (int i = 0; i < cad.length(); i++) {
            char currentChar = cad.charAt(i);
            Integer freq = map.get(currentChar);
            if (freq != null) {
                freq = freq + 1;
            } else {
                freq = 1;
            }
            map.put(currentChar, freq);
        }

        for (Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }

}
