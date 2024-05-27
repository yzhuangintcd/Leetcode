import java.util.*;

public class Solution {

    public int specialArray(int[] nums) {
        for (int i = 1; i <= nums.length; i++) {
            if (isSpecial(i, nums))
                return i;
        }
        return -1;
    }

    private boolean isSpecial(int i, int[] nums) {

        int count = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] < i) {
                continue;
            } else {
                count++;
            }
        }
        return count == i;

    }

    // Helper Function to print out array of int
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Helper Function to print out 2d array of int
    public void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[] = { 3, 6, 7, 7, 0 };
        System.out.println(solution.specialArray(arr));
    }

}
