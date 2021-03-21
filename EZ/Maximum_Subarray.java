package EZ;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] test = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findMaxSumSubArray(test));
    }
    public int maxSubArray(int[] nums) {
    return findMaxSumSubArray(nums);
    }
    public static int findMaxSumSubArray(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        int currentRunningSum = 0 ;
        for (int j : arr) {
            currentRunningSum = Math.max(currentRunningSum + j, j);
            maxValue = Math.max(currentRunningSum, maxValue);
        }
        return maxValue;
    }
}
