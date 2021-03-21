package EZ;

import java.util.HashSet;
import java.util.Stack;

public class singleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {4,1,2,1,2}));
    }

    public static int singleNumber(int[] nums) {
        HashSet numbers = new HashSet();
        int sum = 0;
        int number;
        for (int i = 0; i < nums.length; i++) {
            number = nums[i];
            if (numbers.contains(number))
                sum -= number;
            else {
                numbers.add(number);
                sum += number;
            }
        }
        return sum;
    }
}
