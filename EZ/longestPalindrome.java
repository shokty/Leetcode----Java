package EZ;

import java.util.HashMap;
import java.util.Map;

public class longestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ccc"));
    }

    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> hasy = new HashMap<>();
        char currchar;
        for (int i = 0; i < s.length(); i++) {
            currchar = s.charAt(i);
            if (hasy.containsKey(currchar)) {
                hasy.replace(currchar, hasy.get(currchar) + 1);
            } else
                hasy.put(currchar, 1);
        }
        int max = 0;
        int count = 0;
        for (Map.Entry<Character, Integer> entry : hasy.entrySet()) {
            count += (entry.getValue() / 2) * 2;

            if (count % 2 == 0 && entry.getValue() % 2 == 1)
                count++;
        }
        return count + max;
    }
}

