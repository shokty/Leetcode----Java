package EZ;

public class hammingWeight {
    public static void main(String[] args) {
        System.out.println(hammingWeight(00001111001));
    }
    public static int hammingWeight(int n) {
        int counter = 0;
        for (int i = 0; i < 32; i++) {
            counter += (n & 1);
            n >>= 1;

        }
        return counter;
    }
}
