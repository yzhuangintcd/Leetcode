public class isPowerOfTwoSolution {
    public boolean isPowerOfTwo(int n) {
        // the iterative solution:

        int temp = n; // set temp = n, don't want to change n itself

        // edge case
        if (n == 0) {
            return false;
        }
        // while (temp != 1){

        // if (temp % 2 != 0){
        // return false;
        // }

        // temp = temp / 2;
        // }
        // return true;

        // the non iterative solution: does not work yet

        double checker = log2(temp);
        int x = (int) checker;
        double y = checker - x;

        if (y == 0) {
            return true;
        }

        return false;

    }

    private static double log2(int N) {
        return Math.log(N) / Math.log(2);
    }
}
