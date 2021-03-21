package EZ;

import java.util.Arrays;

public class findContentChildren {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[] {1,2} ,new int[] {1,2,3}));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int counter = 0;
        int nextchild = 0;
        for (int i = 0; i < s.length && nextchild < g.length; i++) {
            if(s[i] >= g[nextchild]){
                counter++;
                nextchild++;
            }
        }
        return counter;
    }


}
