package EZ;

public class moveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[] {0,1,0,3,12});
    }

    public static void moveZeroes(int[] nums) {
        int countzero = 0,j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                countzero++;
            else {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = nums.length - countzero; i < nums.length; i++)
            nums[i] = 0;
    }
}
