package Medium;

import java.util.*;


public class generateParenthesis {
    private static HashSet<String> k = new HashSet<>();

    public static void main(String[] args) {
        List t = generateParenthesis(3);
        System.out.println();
    }

    public static List<String> generateParenthesis(int n) {
        int openers = n;
        int closers = n;
        realdeal(openers, closers, "");
        List<String> list = new ArrayList<String>(k);
        k.clear();
        return list;
    }

    public static void realdeal(int openers, int closers, String curr) {
        if (openers == 0) {
            if (closers == 0)
                k.add(curr);
            else
                realdeal(openers, closers-1, curr+")");

        } else {
            realdeal(openers-1,closers,curr+"(");
            if (closers > openers)
                realdeal(openers,closers-1,curr+")");
        }
    }

}

