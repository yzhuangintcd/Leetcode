import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public int minIncrementForUnique(int[] nums) {
        int increments = 0;
        Arrays.sort(nums);
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= prev) {
                increments += prev + 1 - nums[i];
                nums[i] = prev + 1;
            }
            prev = nums[i];
        }
        return increments;
    }

    // private boolean uniqueArray(int[] nums) {
    // Set set = new HashSet(Arrays.asList(nums));
    // if (nums.length == set.size()) {
    // return true;
    // } else
    // return false;
    // }

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
        Solution s = new Solution();
        int[] arr = { 1, 2, 2 };

        System.out.println(s.minIncrementForUnique(arr));
    }

}
