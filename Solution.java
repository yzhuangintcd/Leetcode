import java.util.*;

public class Solution {

    // This does not work :(
    public int[] findErrorNums(int[] nums) {
        int[] answer = new int[2];
        answer[0] = 0;
        // find the repeating number first
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    answer[0] = nums[i];
                    break;
                }
            }
            if (nums[i] != 0) {
                break;
            }
        }

        int missingNumber = 1;
        for (int i = 1; i < nums.length; i++) {
            // this number is not missing
            if (nums[i] == missingNumber) {
                missingNumber++;
                continue;
            }
        }

        answer[1] = missingNumber;
        return answer;
    }

    // not finished yet
    public int numSquares(int n) {
        int answer = 1;
        int temp = 0;

        while (temp <= n) {

        }

        return answer;
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
        int[] arr1 = { 1, 2, 2, 4 };

        int[] arr = tester.findErrorNums(arr1);
        tester.printArray(arr);
    }
}
