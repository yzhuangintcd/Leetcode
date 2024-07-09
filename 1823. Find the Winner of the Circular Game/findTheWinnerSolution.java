
public class findTheWinnerSolution {
    public int findTheWinner(int n, int k) {
        return findTheWinnerHelper(n, k) + 1;
    }

    private int findTheWinnerHelper(int n, int k) {
        if (n == 1) {
            return 0;
        } else {
            return (findTheWinnerHelper(n - 1, k) + k) % n;
        }
    }
}

/*
 * Very Clean Solution:
 * public int findTheWinner(int n, int k) {
 * int ans=0;
 * for(int i=1;i<=n;i++){
 * ans=(ans+k)%i;
 * }
 * return ans+1;
 * }
 */
