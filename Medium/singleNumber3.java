package Medium;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class singleNumber3 {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> myset = new HashSet<>();
        for (int k : nums) {
            if (myset.contains(k))
                myset.remove(k);
            else
                myset.add(k);
        }
        return myset.stream().mapToInt(Number::intValue).toArray();
    }
}
