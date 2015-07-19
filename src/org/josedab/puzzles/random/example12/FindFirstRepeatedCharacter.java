package org.josedab.puzzles.random.example12;

public class FindFirstRepeatedCharacter {

    public static void main(String[] args) {
        System.out.println(findFirstRepeatedCharacter("stress"));

    }

    // O(n^2)
    public static char findFirstRepeatedCharacter(String cad) {

        char result = '?';
        for (int i = 0; i < cad.length(); i++) {
            char currentChar = cad.charAt(i);
            for (int j = i + 1; j < cad.length(); j++) {
                char candidate = cad.charAt(j);
                if (currentChar == candidate) {
                    result = currentChar;
                    break;
                }
            }
        }
        return result;
    }
}
