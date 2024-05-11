
public class islandPerimeterSolution {
    public int islandPerimeter(int[][] grid) {
        int answer = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    answer += 4;
                    // check neighbours
                    if (i - 1 >= 0) {
                        if (grid[i - 1][j] == 1) {
                            answer--;
                        }
                    }

                    if (i + 1 < grid.length) {
                        if (grid[i + 1][j] == 1) {
                            answer--;
                        }
                    }

                    if (j - 1 >= 0) {
                        if (grid[i][j - 1] == 1) {
                            answer--;
                        }
                    }

                    if (j + 1 < grid[i].length) {
                        if (grid[i][j + 1] == 1) {
                            answer--;
                        }
                    }

                }

            }
        }

        return answer;
    }
}
