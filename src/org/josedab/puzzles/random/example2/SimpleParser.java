package org.josedab.puzzles.random.example2;

import java.util.Stack;

public class SimpleParser {

    public static char[] CHAR_OPENERS = { '{', '[', '(' };
    public static char[] CHAR_CLOSERS = { '}', ']', ')' };

    public static void main(String[] args) {
        System.out.println(parse("{[[(}[}])"));
        System.out.println(parse("{}"));
        System.out.println(parse("}{"));
        System.out.println(parse("{]"));
        System.out.println(parse("{{[]}}"));
    }

    public static boolean parse(String cad) {

        Stack<Character> stack = new Stack<Character>();
        char[] characters = cad.toCharArray();
        for (char c : characters) {

            int index = calculateIndex(CHAR_OPENERS, c);

            if (index >= 0) {
                stack.push(c);
            } else {
                index = calculateIndex(CHAR_CLOSERS, c);
                char supposedOpener = CHAR_OPENERS[index];
                if (stack.isEmpty() || !stack.pop().equals(supposedOpener)) {
                    return false;
                }
            }
        }
        return true;
    }

    static int calculateIndex(char[] array, char c) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                return i;
            }
        }
        return result;

    }

}
