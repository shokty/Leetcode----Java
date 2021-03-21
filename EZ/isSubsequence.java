package EZ;

import java.util.HashMap;
import java.util.HashSet;

public class isSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        if(t.length() == 0)
            return false;

        char currcur = s.charAt(0);
        int index = 0;

        for (int i = 0; i < t.length(); i++) {
            if(currcur == t.charAt(i)){
                if(index == s.length()-1)
                    return true;
                index++;
                currcur = s.charAt(index);
            }
        }
        return false;
    }
}
