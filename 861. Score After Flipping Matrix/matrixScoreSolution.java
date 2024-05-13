
public class matrixScoreSolution {
    private int getScore(int[][] grid) {
        int score = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < grid.length; i++) {
            sb = new StringBuilder();
            for (int j = 0; j < grid[i].length; j++) {
                sb.append(grid[i][j]);
            }
            score += Integer.parseInt(sb.toString(), 2);
        }
        return score;
    }

    public int matrixScore(int[][] grid) {

        int[][] temp = grid;

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                if (temp[i][0] == 0) {
                    // flip the row
                    for (int k = j; k < temp[i].length; k++) {
                        if (temp[i][k] == 1) {
                            temp[i][k] = 0;
                        } else {
                            temp[i][k] = 1;
                        }
                    }
                }
            }
        }

        int countZeroCol = 0;

        for (int j = 0; j < temp[0].length; j++) {
            countZeroCol = 0;
            for (int i = 0; i < temp.length; i++) {
                if (temp[i][j] == 0) {
                    countZeroCol++;
                }
            }
            int ones = temp.length - countZeroCol;
            if (countZeroCol > ones) {
                // flip the col
                for (int i = 0; i < temp.length; i++) {
                    if (temp[i][j] == 0) {
                        temp[i][j] = 1;
                    } else {
                        temp[i][j] = 0;
                    }
                }
            }
        }

        return getScore(temp);
    }
}
