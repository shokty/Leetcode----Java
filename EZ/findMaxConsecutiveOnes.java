package EZ;

public class findMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currmax = 0 ,overallmax =0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1)
                currmax++;
            else{
                overallmax = Math.max(currmax,overallmax);
                currmax = 0;
            }
        }
        return overallmax;
    }
}
