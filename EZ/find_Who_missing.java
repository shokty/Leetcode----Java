package EZ;

import java.util.HashSet;

public class find_Who_missing {
    public static void main(String[] args) {
        System.out.println(whomissing(new int[] {1,3,4,2,2}));

    }
    public static int whomissing(int[] nums){
        int[] checkarr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(checkarr[nums[i]-1] != 0)
                return nums[i];
            else
                checkarr[nums[i]-1]++;
        }
        return -1;
    }
}
