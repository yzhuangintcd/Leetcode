import java.util.*;

public class Solution {
    public int tribonacci(int n) {
        int[] F = new int[38];
        F[0] = 0;
        F[1] = 1;
        F[2] = 1;

        for (int i = 0; i < F.length - 3; i++){
            F[i + 3] = F[i] + F[i + 1] + F[i + 2];
        }
        return F[n];
    }

    // Helper Function to print out arrays of int
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution tester = new Solution();
        System.out.println(tester.tribonacci(25));

    }
}
