package Hard;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class canCross {
    public static void main(String[] args) {
        int[] stones = {0, 1, 3, 5, 6, 8, 12, 17};
        System.out.println(canCross(stones));
    }

    static int Target;

    public static boolean canCross(int[] stones) {
        HashSet stoness = new HashSet();
        if(stones.length >= 2 && stones[1] == 1) {
            for (int k : stones)
                stoness.add(k);
            Target = stones[stones.length - 1];

            return canCross(stoness, 1, 1);
        }
        return false;
    }

    public static boolean canCross(HashSet stones, int location, int k) {
        if (location == Target)
            return true;
        boolean rval = false;
        if (k >= 1) {
            if (stones.contains(location + k - 1))
                rval = canCross(stones, (location + k - 1), k - 1);
            if (rval == false && stones.contains(location + k))
                rval = rval || canCross(stones, location + k, k);
            if (rval == false && stones.contains(location + k + 1))
                rval = rval || canCross(stones, location + k + 1, k + 1);
        }
        return rval;
    }
}
