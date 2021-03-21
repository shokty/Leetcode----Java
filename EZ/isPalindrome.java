package EZ;

public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(515));
    }
    public static boolean isPalindrome(int x) {
        String k = Integer.toString(x);
        int i = 0;
        int j = k.length()-1;
        while (i < j) {
        if(k.charAt(i) != k.charAt(j))
            return false;
        i++;
        j--;
        }
        return true;
    }
}
