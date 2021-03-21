package EZ;

public class findComplement {
    public static void main(String[] args) {
    System.out.println(findComplement(2));
    }

    public static int findComplement(int num) {
        String k = Integer.toBinaryString(num);
        k = new StringBuffer(k).reverse().toString();
        int answear = 0;
        for (int i = 0; i < k.length(); i++) {
            if(k.charAt(i) == '0')
                answear += Math.pow(2,i);
        }
        return answear;
    }
}

