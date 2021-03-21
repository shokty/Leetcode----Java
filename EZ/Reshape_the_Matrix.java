package EZ;

import java.util.LinkedList;
import java.util.Queue;

public class Reshape_the_Matrix {
    Queue values = new LinkedList();
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
            values.add(nums[i][j]);
            }
        }
        if (values.size() != r*c)
            return nums;
        int[][] rval = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                rval[i][j] = (int) values.remove();
            }
        }
        return rval;
    }
}
