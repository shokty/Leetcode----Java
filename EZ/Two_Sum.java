package EZ;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Two_Sum {


    public static void main(String[] args) {
        int[] num1 = {2,7,11,15};
        int target1 = 9;
        System.out.println(Arrays.toString(twoSum(num1,target1)));

        int[] num2 = {3,2,4};
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(num2,target2)));

        int[] num3 = {6};

    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int[] soul = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(hs.containsKey(target - nums[i])){
                soul[0] = hs.get(target-nums[i]);
                soul[1] = i;
                return soul;
            }
            hs.put(nums[i],i);
        }
        return soul;
    }


}
