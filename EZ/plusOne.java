package EZ;

public class plusOne {
    public static void main(String[] args) {
        plusOne(new int[] {8,9,9,9});
    }
    public static int[] plusOne(int[] digits) {
        int[] mybe = new int[digits.length+1];
        mybe[0] = 1;
        for (int i = digits.length-1; i >= 0 ; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                mybe[i + 1] = 0;
            }
            else {
                digits[i]++;
                return digits;
            }

        }
        return mybe;
    }

}
