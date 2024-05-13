
public class largestLocalSolution {
    private int findMax(int[][] grid, int x, int y) {
        int max = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (max < grid[x + i][y + j]) {
                    max = grid[x + i][y + j];
                }
            }
        }
        return max;
    }

    public int[][] largestLocal(int[][] grid) {
        int[][] maxLocal = new int[grid.length - 2][grid.length - 2];
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid.length - 2; j++) {
                int max = findMax(grid, i, j);
                maxLocal[i][j] = max;
            }
        }
        return maxLocal;
    }
}
