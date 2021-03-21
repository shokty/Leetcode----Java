package EZ;

import java.util.LinkedList;
import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String test2 = "([])()";
        System.out.println(isValid(test2));
    }

    public static boolean isValid(String s) {
        Stack sograim = new Stack(); // "("  ")"
        char currchar;
        for (int i = 0; i < s.length(); i++) {
            currchar = s.charAt(i);
            if (currchar == '(') {
                sograim.add('(');
            }
            if (currchar == '{') {
                sograim.add('{');
            }
            if (currchar == '[') {
                sograim.add('[');
            } else if (currchar == ')') {
                if (sograim.isEmpty() || (char) sograim.pop() != '(')
                    return false;
            } else if (currchar == '}') {
                if (sograim.isEmpty() || (char) sograim.pop() != '{')
                    return false;
            } else if (currchar == ']') {
                if (sograim.isEmpty() || (char) sograim.pop() != '[')
                    return false;
            }
        }
        return sograim.isEmpty();
    }
}


