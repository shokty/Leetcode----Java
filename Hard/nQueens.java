public class nQueens {
    public static void main(String[] args) {
    System.out.println(totalNQueens(4));
    }
    public static int totalNQueens(int n) {
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 0;
            }
        }

        return totalNQueensforreal(board, 0);
    }

    public static int totalNQueensforreal(int[][] board, int row) {
        int counter = 0;
        for (int i = 0; i < board.length; i++) {
            if (legitmove(board, row, i)) {
                if (row == board.length - 1)
                    return 1;
                else {
                    board[row][i] = 1;
                    counter = counter + totalNQueensforreal(board,row+1);
                    board[row][i] = 0;
                }
            }
        }
        return counter;
    }

    public static boolean legitmove(int a[][], int row, int col){
        int n = a.length;
        for(int i=0;i<n;i++){
            if(a[i][col]==1)
                return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(a[i][j]==1)
                return false;
        }
        for(int i=row,j=col;j<n && i>=0;i--,j++){
            if(a[i][j]==1)
                return false;
        }
        return true;
    }

}

