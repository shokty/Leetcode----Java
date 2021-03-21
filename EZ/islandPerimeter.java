package EZ;

public class islandPerimeter {


    public int islandPerimeter(int[][] grid) {
        int answear = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1){
                    answear += 4;
                    if (0 <= i-1 && grid[i-1][j] == 1)
                        answear -= 1;
                    if (grid.length > i+1 && grid[i+1][j] == 1)
                        answear -= 1;
                    if (grid.length > j+1 && grid[i][j+1] == 1)
                        answear -=1;
                    if (0 <= j-1 && grid[i][j-1] == 1)
                        answear -=1;
                }
            }
        }
        return answear;
    }

}
