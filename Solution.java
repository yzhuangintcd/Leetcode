import java.util.*;

public class Solution {

    public int[] findErrorNums(int[] nums) {
        int[] answer = new int[2];

        Hashtable<Integer, Boolean> table = new Hashtable<>();
        int n = nums.length;
        int expectedSum = (n * (n + 1) / 2);
        int sum = 0;
        // iterate through the array
        // place each "new" instance into the hash table
        // a num has already been stored in the hashtable then we have found the
        // repeating num

        // then the missing num should only be in the range of
        // repeated num - 1 > repeated num > repeated num + 1
        // we iterate through the array again and match the indices

        for (int num : nums) {
            if (!table.containsKey(num)){
                table.put(num, true);
            }
            else {
                answer[0] = num;
            }
            sum += num;
        }

        answer[1] = expectedSum - sum + answer[0];

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
        int[] arr1 = { 1, 2, 4, 4 };
        int[] arr2 = { 1, 2, 2, 4 };

        int[] arr = tester.findErrorNums(arr1);
        tester.printArray(arr);
    }
}
