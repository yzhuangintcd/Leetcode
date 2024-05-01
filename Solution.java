import java.util.*;

class Solution {

    // This does not work :(
    public int[] findErrorNums(int[] nums) {
        int[] answer = new int[2];
        int j = 1;
        for (int i = 0; i < nums.length; i++, j++) {
            if (nums[i] != j) {
                answer[0] = i;
                answer[1] = j;
                break;
            }
        }
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
        
    }
}
