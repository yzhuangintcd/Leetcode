
public class pivotInteger {
    public int pivotInteger(int n) {

        // find the total sum
        int totalSum = 0;
        // s_n = n/2 [2a+(n-1)d], a = 1, n = n, d = 1
        int tempN = n;
        while (tempN != 0) {
            totalSum += tempN;
            tempN--;
        }

        if (n == 1) {
            totalSum = 1;
        }

        // create a initial temp variable
        int temp = 0;

        // Run a for loop "n times" again but this time,
        // reduce the sum and check if (temp==sum), if not add it to temp.
        for (int i = 1; i <= n; i++) {

            totalSum -= i;

            if (temp == totalSum) {
                return i;
            }

            temp += i;
        }

        return -1;
    }
}
