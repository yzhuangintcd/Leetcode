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

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] answer = new int[2]; // Return an integer array answer of size 2 containing the two values...
        int index = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums1.length; i++) {
            int temp = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                if (temp == nums2[j]) {
                    count1++;
                    break;
                }
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            int temp = nums2[i];
            for (int j = 0; j < nums1.length; j++) {
                if (temp == nums1[j]) {
                    count2++;
                    break;
                }
            }
        }
        answer[0] = count1;
        answer[1] = count2;
        return answer;
    }

    public static void main(String[] args) {
        Solution tester = new Solution();
        int [] arr1 = {3,4,2,3};
        int [] arr2 = {1,5};

        int [] intersection = tester.findIntersectionValues(arr1, arr2);
        tester.printArray(intersection);
    }
}
