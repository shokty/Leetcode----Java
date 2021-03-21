package Medium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class singleNumber {
    public static void main(String[] args) {

    }
    private HashMap<Integer,Integer> map = new HashMap<>();
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
        map.putIfAbsent(nums[i],0);
        map.replace(nums[i],map.get(nums[i])+1);
        if (map.get(nums[i]) == 3)
            map.remove(nums[i]);
        }
        Iterator hmIterator = map.entrySet().iterator();
        return (int) ((Map.Entry)hmIterator.next()).getKey();

    }
}
