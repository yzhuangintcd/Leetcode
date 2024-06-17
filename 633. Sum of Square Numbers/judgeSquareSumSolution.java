
public class judgeSquareSumSolution {
    public boolean judgeSquareSum(int c) {
        int a = 0;
        int b = (int) Math.sqrt(c);

        while (a <= b) {
            if ((Math.pow(a, 2)) + ((Math.pow(b, 2))) == c) {
                return true;
            } else {
                if ((Math.pow(a, 2)) + ((Math.pow(b, 2))) > c) {
                    b--;
                } else {
                    a++;
                }
            }
        }
        return false;
    }
}
