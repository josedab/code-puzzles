package org.josedab.puzzles.example3;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abca"));
        System.out.println(isPalindrome("abcba"));

        System.out.println(isPalindrome2("aba"));
        System.out.println(isPalindrome2("abba"));
        System.out.println(isPalindrome2("abca"));
        System.out.println(isPalindrome2("abcba"));

        System.out.println(isPalindrome3("aba"));
        System.out.println(isPalindrome3("abba"));
        System.out.println(isPalindrome3("abca"));
        System.out.println(isPalindrome3("abcba"));
    }

    public static boolean isPalindrome(String cad) {
        String reverseCad = new StringBuffer(cad).reverse().toString();
        boolean isPalindrome = false;
        if (cad.equals(reverseCad)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

    // Option 2
    // without stringBuffer
    public static boolean isPalindrome2(String cad) {
        String reverseCad = reverseCad(cad);
        boolean isPalindrome = false;
        if (cad.equals(reverseCad)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

    private static String reverseCad(String cad) {
        String result = "";
        for (int i = cad.length() - 1; i >= 0; i--) {
            result = result + cad.charAt(i);
        }
        return result;
    }

    // Option 3
    // without stringBuffer and reverse iteration
    public static boolean isPalindrome3(String cad) {
        boolean result = true;
        if (cad.length() > 0) {
            int middleLength = cad.length() / 2;
            for (int i = 0; i <= middleLength; i++) {
                if (cad.charAt(i) != cad.charAt(cad.length() - i - 1)) {
                    return false;
                }
            }
        }
        return result;
    }
}
