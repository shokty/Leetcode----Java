package Medium;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class findDiagonalOrder {
    public static void main(String[] args) {
        int[][] key = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        findDiagonalOrder(key);
        ;
    }

    public static int[] findDiagonalOrder(int[][] matrix) {
        int rows = matrix.length;
        if (rows == 0)
            return new int[]{};
        int coulm = matrix[0].length;
        Queue<Integer> q = new LinkedList<>();
        Stack stack = new Stack();
        int[] answer = new int[rows * coulm];
        int savei, index = 0;
        for (int i = 0; i < coulm; i++) {
            savei = i;
            if (i % 2 == 0) {
                for (int j = 0; j < rows && savei >= 0; j++, savei--)
                    stack.add(matrix[j][savei]);
                while (!stack.isEmpty()) {
                    answer[index] = (int) stack.pop();
                    index++;
                }
            } else {
                for (int j = 0; j <rows  && savei >= 0; j++, savei--)
                    q.add(matrix[j][savei]);
                while (!q.isEmpty()) {
                    answer[index] = (int) q.poll();
                    index++;
                }
            }
        }
        return answer;
    }

}

